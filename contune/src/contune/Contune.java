/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contune;

/**
 *
 * @author TOSHIBA
 */
public class Contune {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0 ;
         for (int i = 1 ; i<100 ; i ++) {
             if (i % 10 == 0 ){ continue ;}
             else {System.out.printf("%4d", i) ; count ++ ;}
             
              if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
              { System.out.println( " " ) ; }
         }
        // طريقة اخرى للحل 
          
       
         for (int i = 1 ; i<100 ; i ++) {
             if (i % 10 == 0 ){ continue ;}
              else if ( i %11 == 0) {System.out.printf("%4d", i) ; System.out.println("");}
             else {System.out.printf("%4d", i) ;  }
             
    }
    }   
}
