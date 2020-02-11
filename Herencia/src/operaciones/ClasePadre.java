/*
 * La herencia es el procedimiento utilizado para reutilizar codigo cuando creamos nuevas clases.
   Pues lo unico que se hace es indicar al programa que queremos utilizar las variables y funciones de una clase que ya hemos creado
   anteriormente es decir utilizar los metodos y atributos que ya se han creado anteriormente ya existente y colocarlos dentro de una
   nueva clase sin la necesidad de volver a escribir el codigo
   Importante: Los aributos son las variables, mientras que los metodos son las funciones de una clase o verbos.
   
 */
package operaciones;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor");        
        valor1 = entrada.nextInt();
        System.out.println("Dame el segundo dato");
        valor2 = entrada.nextInt();
    }
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
