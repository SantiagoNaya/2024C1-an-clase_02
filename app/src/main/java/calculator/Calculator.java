package calculator;

public class Calculator {
    //Todo:feat: agreagar metodo de suma de dos enteros
public int sumar(int primero, int segundo){
    return primero+segundo;
}
 
    //Todo:feat: agreagar metodo de multiplicacion de dos enteros
    public int multiplicar(int primero, int segundo){return primero*segundo; }
    //Todo:feat: agreagar metodo de resta de dos enteros
    public int restar(int primero, int segundo){return primero-segundo;}
    //Todo:feat: agreagar metodo de division de dos enteros
    public float dividision(float primero, float segundo){
    if (segundo==0) return -1;
    return primero/segundo;}


}
