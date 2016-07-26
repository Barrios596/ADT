/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* Main.java
*Programa principal de la calculadora que utiliza un archivo de texto
*/
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        float resultado;
        Stack<Float> pila =new StackVector<Float>();  //Se crea un Stack de floats 
        Calculadora calc = new Calculadora();   /*en la siguiente linea hay que ingresar la dirección completa del archivo de texto*/
        FileReader fr = new FileReader("C:\\Users\\JoiceAndrea\\OneDrive\\Documents\\4to Semestre\\ADT\\HT2\\ADT-master\\HDT2\\src\\datos.txt");
        BufferedReader br = new BufferedReader(fr); //BufferedReader es un objeto que puede leer archivos de texto y guardarlos en Strings
        String linea = br.readLine();   //se lee la primera linea del archivo de texto
        //Se repite un ciclo hasta que ya no hayan más lineas que leer
        while (linea != null){
            pila.empty();   //se vacia el vector antes de comenzar
            resultado = calc.calcular(linea, pila);      //se usa un metodo de la calculadora para realizar la operacion que hay en la linea
            System.out.println(linea+" = "+resultado);    //se imprime la operacion junto a su resultado
            linea = br.readLine();  //se lee la linea siguiente
        }
        //String texto = new Scanner(new File("C:\\Users\\Rodrigo\\Documents\\2do ciclo 2016\\ADT\\HDT2\\src\\datos.txt")).useDelimiter("\\Z").next();
        
        /*calc.calcular(texto, pila);
        System.out.println(texto);*/
    }
    
}
