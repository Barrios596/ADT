/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135

* Main.java
* Clase que utiliza a sorteador para ordenar un listado de numeros en orden ascendente
*/
public class Main {

    public static void main(String[] args){
        
        Sorteador sorteador = new Sorteador();
        int[] array,quicksort,gnomesort,mergesort,radixsort;
        
        sorteador.escribir();
        array = sorteador.llenado();
        quicksort = array;
        gnomesort = array;
        mergesort = array;
        radixsort = array;
        
        sorteador.quicksort(quicksort, 0, 2999);
        sorteador.gnomeSort(gnomesort);
        sorteador.mergesort(mergesort, 0, 2999);
        sorteador.radixSort(radixsort);
        
        System.out.println("Los numeros en orden son: ");
        for(int i=0;i<3000;i++){
            System.out.print(radixsort[i]+", ");
            //System.out.print(gnomesort[i]+", ");
        }
    }
    
}
