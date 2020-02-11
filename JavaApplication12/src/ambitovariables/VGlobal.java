package ambitovariables;

/**
 * Las variables de ambito global o de instancia son aquellas pertenecientes
 * a las clase donde han sido declaradas dependiendo del modificador de acceso
 * utilizado podran ser accedidas dentro de la misma clase.
 * @author Hector
 */
public class VGlobal {
    
    int variable_Global;// una variable global no se inicializa
    
    void miMetodo(){
        System.out.println("Valor de variable global"+variable_Global);
    }
    
    public void prueba(){
        System.out.println("Valor de variable global"+variable_Global);
    }   
}