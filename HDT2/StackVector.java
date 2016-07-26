/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* Calculadora.java
* Clase que implementa los metodos de Stack para crear un vector de objetos
*/
import java.util.Vector;
public class StackVector<E> implements Stack<E> {
        //se crea un vector con objetos de tipo E
        Vector<E> vector = new Vector();
        //Constructor vacio
        public StackVector(){
            
	}
        //metodo para ingresar objetos en el vector
        @Override
	public void push(E item){
            vector.add(item);
	}
        //metodo para obtener el obejto que se encuentra de ultimo en el vector y eliminarlo de él
        @Override
	public E pop(){
            return vector.remove(size()-1);
	}
        
        //metodo que solo obtiene el objeto que se encuentra de último en el vector
	@Override
        public E peek(){
            return vector.get(size() - 1);
	}
	//metodo que devuelve el tamaño del vector
        @Override
	public int size(){
            return vector.size();
	}
        //metodo que elimina todos los objetos que hay dentro del vector
        @Override
	public boolean empty(){
            return size() == 0;
	}
    
}
