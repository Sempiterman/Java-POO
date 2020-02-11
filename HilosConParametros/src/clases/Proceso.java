package clases;

public class Proceso extends Thread{
    int num_int; // global var
    
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }
    
    @Override//sobreescritura del metodo run con polimorfismo 
    public void run(){
        for(int i = 0; i <= num_int;i++){
            System.out.println(this.getName()+"Exe "+i);
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
    }
}
