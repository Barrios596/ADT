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
}
