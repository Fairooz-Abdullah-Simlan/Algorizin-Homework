
import java.util.Scanner;

public class Main{

     public static void main(String []args){

         Scanner in1 = new Scanner(System.in);
         System.out.print("Please enter a number: ");
         int num1 = in1.nextInt();
         
         int fact =1;
         int i;
         
         for(i=1; i<=num1;i++ ){
             
             fact= fact*i ;
         }
        
         System.out.print("Factorial of " +num1+ " is " +fact);
         
     }
}
