package listatipopila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args){
        
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do{
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        +"1. Insertar nodo\n"
                        +"2. Eliminar un nodo\n"
                        +"3. La pila esta vacia?\n"
                        +"4. Cual es el ultimo valor ingresado?\n"
                        +"5. Cuantos nodos tiene la pila\n"
                        +"6. Vaciar pila\n"
                        +"7. Mostrar contenido de la pila\n"
                        +"8. Salir"));
                
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor a guardar en el nodo"));
                        pila.Insertarnodo(nodo);
                        break;
                        
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null,"Se ha eliminado un nodo con el valor"+
                                    +pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null,"La pila NO esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null,"La pila SI esta vacia");
                        }
                        break;
                    
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es"
                                    +pila.MostrarUltimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene "+pila.TamanoPila()+" nodos.");
                        break;
                    
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null,"Se ha vaciado correctamente la pila");
                        }
                        break;
                        
                    case 7:
                        pila.MostrarValores();
                        break;
                        
                    case 8:
                        opcion = 8;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, intenta nuevamente");
                        break;
                }
            }catch(NumberFormatException e){
                                
            }
        }while(opcion !=8);
    }   
}
