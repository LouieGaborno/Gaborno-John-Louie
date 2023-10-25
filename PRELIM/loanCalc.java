import java.util.Scanner;
   public class loanCalc{
      public static void main(String [] args){
         Scanner scan = new Scanner(System.in);
         double interest = .20;
         
         System.out.println("Enter your loan amount: ");
         int num1 = scan.nextInt();
         
         System.out.println("Loan term: ");
         int num2 = scan.nextInt();
         
         
         double total = num1 * interest * num2;
         
         System.out.println("Your interest in " + num2 + "year is " + total);
      
      }
   }
   
   
   12 percent
   