/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

/**
 *
 * @author TOSHIBA
 */
public class tollboothob {
    int thetotalnumberofcars ;
    double totalamountofthemoney ;
    
    tollboothob() { 
    
    }
   public void payingCar() {
      ++ thetotalnumberofcars ;
        totalamountofthemoney +=  0.50 ;
        }
    public void  nopayCar() {
     thetotalnumberofcars ++ ;
    }
   public void display() {
   System.out.println("the total number of cars = " + thetotalnumberofcars);
   System.out.println("the total amount of the money = " +  totalamountofthemoney);
   
   }
   
}
