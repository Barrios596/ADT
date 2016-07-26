/*Universidad del Valle de Guatemala
* Algoritmos y Estructuras de datos - Seccion 30
* Rodrigo Barrios, carne 15009
* Mario Hernandez, carne 15135
* Joice Miranda, carne 15552

* Calculadora.java
*Clase que usa los metodos de StackVector para realizar cálculos
*/
public class Calculadora {
    
    private String caracter;
    float operando;
    
    public Calculadora(){
    }
    
    public float calcular(String text, Stack<Float> pile){
        float res=0;
        float operando1;
        float operando2;
        for (int i=0;i<text.length();i++){
            caracter=text.substring(i, i+1);
            try{
              operando = Float.valueOf(caracter);
              pile.push(operando);
            }
            catch (NumberFormatException e){
                if (caracter.equals("+")){
                    operando1=pile.pop();
                    operando2=pile.pop();
                    res=operando1+operando2;
                    pile.push(res);
                }
                if (caracter.equals("-")){
                    operando1=pile.pop();
                    operando2=pile.pop();
                    res=operando2-operando1;
                    pile.push(res);
                }
                if (caracter.equals("*")){
                    operando1=pile.pop();
                    operando2=pile.pop();
                    res=operando1*operando2;
                    pile.push(res);
                }
                if (caracter.equals("/")){
                    operando1=pile.pop();
                    operando2=pile.pop();
                    res=operando2/operando1;
                    pile.push(res);
                }
            }
        }
        return res;
    }
}
