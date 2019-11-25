/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tollbooth;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Tollbooth {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in) ;
        tollboothob y = new  tollboothob () ;
        System.out.println ("welcome to Tollbooth "
                + "\n enter the max size for Tollbooth  ") ; 
        int max = x.nextInt() ;
        System.out.println ("enter 0 for paying car "
                + "and 1 for no paying car  and 2 for end"); 
        
        int m = 1 ;
        while (m <= max){
            int num =x.nextInt() ;
            if (num == 0 ) {y.payingCar() ;}
            else if (num==1) {y.nopayCar() ;}
            else { break ;}
            m++ ;
           }
        y.display();
         // TODO code application logic here
    }}
