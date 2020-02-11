package clases;

import java.util.Scanner;

public class Conconstructor {
    
    public Conconstructor(){
        
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Cual es tu nombre ?");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre con constructor es: "+nombre+"\n");
    }
}
