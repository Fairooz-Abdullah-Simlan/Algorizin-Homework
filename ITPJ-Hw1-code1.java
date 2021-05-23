
import java.util.Scanner;

public class Main{

     public static void main(String []args){

         Scanner in1 = new Scanner(System.in);
         System.out.print("Please enter First number: ");
         int num1 = in1.nextInt();
         
         System.out.print("Please enter Second number: ");
         int num2 = in1.nextInt();
         
         System.out.print("Enter operator(+,_,*,/) : ");
         char operator =in1.next().charAt(0);
         
         switch(operator){
            case '+':
                int addition= num1+num2;
                System.out.print("First number + Second number = " + addition);
                break;
                 
            case '-':
                int subtraction= num1-num2;
                System.out.print("First number - Second number = " + subtraction);
                break;
            
            case '*':
                int multiplication= num1*num2;
                System.out.print("First number * Second number = " + multiplication);
                break;
                
            case '/':
                double divition= num1 / num2;
                System.out.print("First number / Second number = " + divition);
                break;
            
         }
         
     }
}
