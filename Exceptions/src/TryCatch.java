import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        
        try{
            int value1, value2, result;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Give me the first value");
        value1 = in.nextInt();
        
        System.out.println("Give me second value");
        value2 = in.nextInt();
        
       result = value1 / value2 ;
        System.out.println("The result of operation is: "+result);
        }catch(Exception e){
            System.out.println("Error "+e);
        }finally{
            System.out.println("Retry again");
        }
}
    
}
