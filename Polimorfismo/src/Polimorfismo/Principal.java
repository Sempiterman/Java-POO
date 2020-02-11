/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Hector
 */
public class Principal {
    
    public static void main(String[] args){
        OperacionesClase_Padre mensajero_suma = new Suma_ClaseHija();
        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        OperacionesClase_Padre mensajero_resta = new Resta_ClaseHija();
        mensajero_resta.PedirDatos();
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
    }
    
}
