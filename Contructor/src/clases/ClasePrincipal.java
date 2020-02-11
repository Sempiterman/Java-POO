package clases;

public class ClasePrincipal {
    public static void main(String[]args){
        //clase con constructor
        Conconstructor concon = new Conconstructor();

        SinConstructor sincons = new SinConstructor();
        sincons.PedirNombre();
        sincons.Imprimir();
    }
}