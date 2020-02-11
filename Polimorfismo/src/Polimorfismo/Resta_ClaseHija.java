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
public class Resta_ClaseHija extends OperacionesClase_Padre{
    //con @Override sobreescribimos el metodo operaciones que ha sido abstraido en la clase padre y asignandole un
    //nuevo comportamiento en la clase hija
    @Override
    public void Operaciones(){
        resultado = valor1 - valor2;
    }
    
}
