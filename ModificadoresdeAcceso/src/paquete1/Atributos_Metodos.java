package paquete1;

/**
 * el modificador de acceso default esta incluido de manera implicita en la declaracion de variables o atributos de la clase
 * esto solo esta disponible para las clases que esten dentro del mismo paquete
 * @author Hector
 */
public class Atributos_Metodos {
    //modificador de acceso DEFAULT esta declarado de forma implicita al declarar un elemento o vairable solo se puede acceder clases pertenecientes al mismo paquete
    String modificadorpordefecto;
    //modificador de acceso PUBLIC permite acceder al elemento desde cualquier clase ya sea que se encuentre dentro del paquete o no
    public String modificadorpublico;
    //modificador de acceso PRIVADO es el mas restrictivo solo puede ser usado desde la clase en la que se encuentra excepto con metodos getter y setter
    private String modificadorprivado;
    //modificador de acceso PROTECTED solo pude ser accedido desde su paquete y cualquier clase que herede la clase donde se encuentra independientemente si se encuentra en el mismo paquete o no
    protected String modificadorprotegido;
    
    public void Ernesto(){
    
    }
}
