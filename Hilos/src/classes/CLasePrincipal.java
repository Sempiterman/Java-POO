package classes;

public abstract class CLasePrincipal {
    
    public static void main(String [] args){
    
        Proceso1 thread1 = new Proceso1();
        Proceso1 thread3 = new Proceso1();
        Thread thread2 = new Thread(new Proceso2());
        
        thread1.start();
        thread3.start();
        thread2.start();   
        
        thread2.stop();   
    }
}