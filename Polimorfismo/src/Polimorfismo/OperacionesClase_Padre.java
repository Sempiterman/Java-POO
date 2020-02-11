package Polimorfismo;
import java.util.Scanner;

/**
 * El polimorfismo es la capacidad de que se le da a un metodo de comportarse de manera diferente de acuerdo a la instancia creada.
 * Es decir, dependiendo de la clase con la que interactue sera la funcion que ejecutara el metodo.
 * @author Hector
 */
public abstract class OperacionesClase_Padre {
    
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Dame el segundo apellido");
        valor2 = entrada.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        System.out.println("El resultado es "+resultado);
    }
    
}
