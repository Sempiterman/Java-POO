package classes;

public class Proceso2 implements Runnable{
 
    @Override
    public void run(){
        for(int i = 0;1 <= 5;i++){
            System.out.println("Process 2");
        }   
    }
}