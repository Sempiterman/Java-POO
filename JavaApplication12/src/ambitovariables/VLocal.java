package ambitovariables;

/**
 *
 * @author Hector
 */
public class VLocal {
    
    void miMetodo(int parametro){
        int variableLocal = 52; //Variable local se debe inicializar
        
        System.out.println("El valor de la variable es"+variableLocal);
        System.out.println("El valor del parametro es"+parametro);
    }
    
    public void Prueba(){
        String variableLocal = "Variable String";
        System.out.println("El valor de la variable local es"+variableLocal);
    }
}
