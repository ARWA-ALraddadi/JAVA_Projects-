/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hm;

/**
 *
 * @author TOSHIBA
 */
public class Hm {

    
     public static void form1 (int x) {
     for (int i = x ; i>=1 ; i --){
     for (int j = 1 ; j <= i ; j ++) {
     System.out.print( j + " " ) ; }
     System.out.println ( );} }
     
     public static void form2 ( int x) {
         for (int i = 1 ; i<=x ; i ++){
     for (int j = 1 ; j <= (i) ; j ++) {
     System.out.print( j + " " ) ; }
     System.out.println ( );}}
     
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println (" the form1 \n" );
         form1 ( 16 ) ;
          System.out.println (" \n the form2 \n" );
         form2 ( 16 ) ;
    }
    
}
