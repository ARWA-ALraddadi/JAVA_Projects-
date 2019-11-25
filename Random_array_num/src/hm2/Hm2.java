/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm2;

/**
 *
 * @author TOSHIBA
 */
public class Hm2 {

   
     
    public static void main(String[] args) {
       double [] arry = new double [6] ;
       double [] arry2 = new double [arry.length] ;
       double [] sum = new double [arry.length] ;
        int j , i ;
       
      
       for ( i = 0 , j = 0 ; i <arry.length ; i++, j++  ) {
       arry[i]= i ; 
       System.out.print( " the arry1 " + arry[i] );
        
        System.out.print(" the arry2 ");
       arry2 [j] =  (int) (Math.random()*10) ;
        System.out.print(arry2[j] + " \n");
        
        sum [i]= arry[i] +  arry2 [j] ; 
       }
       System.out.println(" the sum " ) ;
       for (i=0 ;i <arry.length ; i++ )
          System.out.print( +sum [i] + "  " );
        // TODO code application logic here
    
    
} } 
