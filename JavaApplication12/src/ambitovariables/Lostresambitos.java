package ambitovariables;

/**
 * implicacion de los 3 ambitos de variables en un solo programa basico y simple
 * @author Hector
 */
public class Lostresambitos {
    
    static int staticvar; //se podria decir que una variable estatica debe llevar static
    int globalvar;//una variable global se podria decir que debe llevar un modificador de acceso por default
    
    void metodo (int parametro){
        int localvar = 5;//el parametro tambien es local dentro del metodo
        // forzosamente una variable local debe ser inicializada
    }
}
