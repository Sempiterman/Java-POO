package lavadora_uno;
import Libreria.LLFunciones;
import java.util.Scanner;
/**
 *LESSON #9 Importacion de paquetes y encapsulamiento
 * ejemplo ciclo de lavado de una lavadora
 * @author Hector
 */
public class Lavadora_Uno {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona || 1-Ropa blanca || 2-Ropa de color");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("Cuantos kilos de ropa a lavar?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(1);

        System.out.println("El tipo de ropa es "+mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
