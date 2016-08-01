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
        int[] array,quicksort,gnomesort;
        
        sorteador.escribir();
        array = sorteador.llenado();
        quicksort = array;
        gnomesort = array;
        
        sorteador.quicksort(quicksort, 0, 2999);
        sorteador.gnomeSort(gnomesort);
        System.out.println("Los numeros en orden son: ");
        for(int i=0;i<3000;i++){
            System.out.print(quicksort[i]+", ");
            System.out.print(gnomesort[i]+", ");
        }
    }
    
}
