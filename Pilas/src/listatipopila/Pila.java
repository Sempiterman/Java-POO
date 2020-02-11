package listatipopila;

import javax.swing.JOptionPane;

public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    public void Insertarnodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano ++;
    }
    
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano --;
        return auxiliar;
    }
    
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    public int TamanoPila(){
        return tamano;
    }
    
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido!=null){
            Lista += recorrido.informacion +"\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
