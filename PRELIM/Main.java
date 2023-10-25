/* 
5000

20%



*/

import java.util.Scanner;
   public class Main{
      public static void main(String [] args){
         Scanner scan = new Scanner(System.in);
         int Allowance = 10000;
         
         
      System.out.println("List your expenses below");
      System.out.println("Your total allowance is: " + Allowance);
      
      System.out.println("Grocery: ");
      int sec1 = scan.nextInt();
      
      System.out.println("Internet: ");
      int sec2 = scan.nextInt();
      
      System.out.println("Gas: ");
      int sec3 = scan.nextInt();
      
      System.out.println("Electricity: ");
      int sec4 = scan.nextInt();
      
      System.out.println("Water: ");
      int sec5 = scan.nextInt();  
      
      int total = sec1 + sec2 + sec3 + sec4 + sec5;
      
      int balance = Allowance - total;
      
      System.out.println("Your total expense is: " + total);
     
      System.out.println("Your allowance right now is:" + balance );
       
     if(balance >= 5000){
     System.out.println("Goodjob you surpass your goal!!");
     }
     
     else{
     System.out.println("Its okay better luck next time");
     }
      
      }
   }

