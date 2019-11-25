/* arwa al radadi 
id 3452656
 sec cs3
 */
package arwa;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Arwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
      Scanner x = new Scanner (System.in);
      System.out.println("enter your name , your account number and your balance");
      String name = x.next();
      int account = x.nextInt() ;
      double balance = x.nextDouble() ;
        int opp;
      do {
      System.out.println(" choose the operation \n1.Deposit\n" + "2.Withdraw \n" + "3.Exit");
       opp = x.nextInt() ;
      
      switch (opp){
          case 1 :   System.out.println("enter the amount of money");
             double amount = x.nextDouble() ;
              double sum = balance + amount ;
              System.out.printf("your balance now is %f " , sum); break ;
              
          case 2 : 
              System.out.println("enter the amount of money");
            double amoun = x.nextDouble() ;
            
             if ( balance > amoun)  { double w = balance - amoun ;
            System.out.println("your balance now is  " + w); } 
             else
             {  System.out.println("sory  your amount is not enough " ) ;} break ;  
               
      }
      } while ( opp!= 3) ;
    }   }
              
              
             
      
    
