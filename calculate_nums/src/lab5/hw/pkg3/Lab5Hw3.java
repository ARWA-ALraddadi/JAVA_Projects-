/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.hw.pkg3;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Lab5Hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("enter  number a, b , c ");
       double  a = x.nextDouble() ;
      double b = x.nextDouble() ;
      double c = x.nextDouble() ;
       
       if ((Math.pow(b, 2))- 4 *c* a == 0) {
       double s =-b + Math.pow((Math.pow(b, 2))- 4 *c* a, 0.5) / 2 * a   ;
        System.out.println(s);
       }
       
       if ((Math.pow(b, 2))- 4 *c* a > 0 ) {
       double r1 =-b + Math.pow((Math.pow(b, 2))- 4 *c* a, 0.5) / 2 * a   ;
       double r2 =-b - Math.pow((Math.pow(b, 2))- 4 *c* a, 0.5) / 2 * a   ;
       System.out.println( "root 1 = "+ r1 + " root 2 = "+ r2);
       }
       
       if ((Math.pow(b, 2))- 4 *c* a < 0) {
        System.out.println( " the equation has no root ");
       }
        // TODO code application logic here
    }
    
}
