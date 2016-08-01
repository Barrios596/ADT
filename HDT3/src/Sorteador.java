/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135

* Sorteador.java
* Clase que contiene los metodos necesarios para ordenar numeros en orden ascendente
*/
import java.util.Random;
import java.io.*;

public class Sorteador{
    
    Random numeroRandom;
    int enteroRandom;
    String stringRandom;
    
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;
    
    int[] arreglo = new int[3000];
    
    public Sorteador(){
    }   
    
    public void escribir(){
        try{
            fw = new FileWriter("C:\\Users\\Rodrigo\\Documents\\2do ciclo 2016\\ADT\\HDT3\\src\\numeros.txt"); //Aquí hay que escribir la dirección COMPLETA del archivo de texto donde se escribirán los números, si no existe el archivo este programa crea uno nuevo.
            bw = new BufferedWriter(fw);
            for (int i=0;i<3000;i++){
                numeroRandom = new Random();
                enteroRandom = numeroRandom.nextInt((3000)+1);
                stringRandom =Integer.toString(enteroRandom);
                bw.write(stringRandom);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e){
            System.out.println("Por favor escriba una dirección válida para guardar los números en un archivo .txt");
        }
    }
    
    public int[] llenado(){
        try{
            fr = new FileReader("C:\\Users\\Rodrigo\\Documents\\2do ciclo 2016\\ADT\\HDT3\\src\\numeros.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();

            int lineaNum;
            for(int i=0;linea!=null;i++){
                linea = br.readLine();
                lineaNum = Integer.parseInt(linea);
                arreglo[i]=lineaNum;
            }
        } catch(Exception e){
            
        }
        return arreglo;
    }
    //El metodo de quicksort se investigó de la siguiente fuente: http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.htmlhttp://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
    public void quicksort(int A[], int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
           while(A[j]>pivote) j--;         // busca elemento menor que pivote
           if (i<j) {                      // si no se han cruzado                      
               aux= A[i];                  // los intercambia
               A[i]=A[j];
               A[j]=aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if(izq<j-1){
            quicksort(A,izq,j-1); // ordenamos subarray izquierdo
        }
        if(j+1 <der){
            quicksort(A,j+1,der); // ordenamos subarray derecho
        }
    }
    //El metodo de gnomeSort fue investigado de la siguiente fuente: https://rosettacode.org/wiki/Sorting_algorithms/Gnome_sort#Java
    public void gnomeSort(int[] a){
        int i=1;
        int j=2;

        while(i < a.length) {
          if ( a[i-1] <= a[i] ) {
            i = j; j++;
          } 
          else {
            int tmp = a[i-1];
            a[i-1] = a[i];
            a[i--] = tmp;
            i = (i==0) ? j++ : i;
          }
        }
    }
    //El metodo mergesort usa al metodo merge. Ambos fueron investigados de la siguiente fuente: http://puntocomnoesunlenguaje.blogspot.com/2014/10/java-mergesort.html
    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
                  B[i]=A[i];

                  i=izq; j=m+1; k=izq;
                  while (i<=m && j<=der) //copia el siguiente elemento más grande
                  if (B[i]<=B[j])
                          A[k++]=B[i++];
                  else
                          A[k++]=B[j++];
                  while (i<=m) //copia los elementos que quedan de la
                                A[k++]=B[i++]; //primera mitad (si los hay)
    }
    public void mergesort(int A[],int izq, int der){
        if (izq<der){
                int m=(izq+der)/2;
                mergesort(A,izq, m);
                mergesort(A,m+1, der);
                merge(A,izq, m, der);
        }
    }
    
    public  void radixSort(int[] arr){
        if(arr.length == 0){
            return;
        }
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                        arr[j++] = np[l][0];
        }
    }
}
