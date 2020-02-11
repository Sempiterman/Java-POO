/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadorafunciones;

/**
 *
 * @author Hector
 */
public class LLFunciones {
    private int kilos =  0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    
    public LLFunciones(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    private void Llenado(){
        if(kilos <= 12){
        llenadoCompleto = 1;
        System.out.println("Llenando.");
        System.out.println("Llenado completo.");
        } else {
            System.out.println("Exceso de carga reduce el peso");
        }
    }
    private void Lavado(){
        Llenado();
        if(llenadoCompleto ==1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa Blanca | Lavado Suave");
                System.out.println("Lavando....");
                LavadoCompleto = 1;
            }else if(TipoDeRopa ==2){
                System.out.println("Ropa de Color | Lavado Intenso");
                System.out.println("Lavando....");
                LavadoCompleto = 2;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color | lavado intenso");
                LavadoCompleto = 1;
            }
        }
    }
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("Ciclo de lavado finalizado");
            System.out.println("Tu ropa esta lista");
        }
    }
}
