package clases;

public class ClasePrincipal {
    public static void main(String[] args){
        try{
            ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
            mensajero.setSaldo(500);
            mensajero.Operaciones();
        }catch(Exception e){
            System.out.println("Fatal Error!");
            System.out.println("Elija alguna opcion del menu"+e);
            System.out.println("Reiniciar Operaciones \n");
        }finally{
            System.out.println("Operacion finalizada");
        }
    }
}
