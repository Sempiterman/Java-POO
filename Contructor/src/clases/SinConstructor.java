package clases;
import java.util.Scanner;

public class SinConstructor {
    
    private Scanner mensajero = new Scanner(System.in);
    String nombre = "";
    
    public void PedirNombre(){
        System.out.println("Cual es tu nombre");
        nombre = mensajero.nextLine();
    }
    
    public void Imprimir(){
        System.out.println("Tu nombre sin constructor es "+nombre);
    }
}
