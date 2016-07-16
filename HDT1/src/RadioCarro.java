/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* RadioCarro.java
*Este programa implementa la interfaz Radio y crea objetos de tipo RadioCarro.
*Las emisoras van de 87.9 a 107.9 en FM y de 530 a 1610 en AM
*/
public class RadioCarro implements Radio {
    
    public boolean estado; /*encendido o apagado*/
    public boolean frecuencia;  /*AM o FM*/
    public double emisora;  /*numero de emisora*/
    public double[][] botones; /*arreglo con las 24 emisoras AM y FM que van a estar guardadas en los botones*/
    /*constructor*/
    public RadioCarro(){
        estado=false;   /*true es encendido y false es apagado*/
        frecuencia=true; /*true es FM y false es AM*/
        emisora=87.9;   /*se inicializa con esta emisora*/
        botones = new double[2][12];
        for (int i=0; i<11; i++){
            botones[0][i]=(87.9+i);
        }
        for (int i=0; i<11; i=i+10){
            botones[1][i]=(530+i);
        }
    }
    
    @Override
    public double selectEmisora(int btn){
        return emisora;
    }
    /*cambia de encendido a apagado y viceversa*/
    @Override
    public void setEncendido(boolean state){
        if (state==true){
            this.estado=false;
        }
        else{
            this.estado=true;
        }
    }
    
    /*cambia de frecuencia de AM a FM y viceversa*/
    @Override
    public void setFrecuencia(boolean frecuency){
        if (frecuency==true){
            this.frecuencia=false;
        }
        else{
            this.frecuencia=true;
        }
    }
    
    /*cambia la emisora actual a una nueva, que se ingresa como parametro*/
    @Override
    public void setEmisora(double nuevaEmisora){
        emisora=nuevaEmisora;
    }
    
    @Override
    public void saveEmisora(int btn, double emisora){
        
    }
    
    @Override
    public boolean getEncendido(){
        return estado;
    }
    
    @Override
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    @Override
    public double getEmisora(){
        return emisora;
    }
}
