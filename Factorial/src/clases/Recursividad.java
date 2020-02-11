package clases;

public class Recursividad {
    //metodo recursivo a traves de parametros
    public int Factorial(int parametro){
        if(parametro >0){
            int value_calc = parametro * Factorial(parametro-1);
            return value_calc;
        }
        return 1;
    }
}
