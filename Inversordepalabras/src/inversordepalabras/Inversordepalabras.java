package inversordepalabras;

import java.util.Scanner;
/**
 * Este programa tambien puede servir para palindromos
 * @author Hector
 */
public class Inversordepalabras {

    public static void main(String[] args) {
        String palabra = "", palabraInvertida="";
        int longitudPalabra = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar palabra o frase:");
        palabra = entrada.nextLine();
        
        longitudPalabra = palabra.length();
        /*
        while (longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra--;
        }*/
            System.out.println("Cadena original:"+palabra);
            System.out.println("Palabra invertida:"+palabraInvertida);
        }
}