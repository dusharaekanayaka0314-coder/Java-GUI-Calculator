import java.util.Scanner;

public class calcuator {
    public static void main (String[]args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the First Number : ");
        double num1 = input.nextDouble();
        
        System.out.println("Enter the Second Number : ");
        double num2 = input.nextDouble();
        
        System.out.println("Enter the Operation :  (+ , - , * , / ) ");
        char ope = input.next().charAt(0);
        
         double result = 0;
         if (ope=='+'){
             result = num1 + num2 ;
         }
         else if (ope =='-') {
             result = num1 - num2 ;
         }
         else if (ope=='*'){
             result = num1*num2;
         }    
         else if (ope=='/'){
             result = num1/num2;
         }
         
      
        System.out.println("Result : "+ result);
        
    }
    
}
