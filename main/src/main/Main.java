/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        shape o1 = new rectangle("red" , 4 , 5) ;
        System.out.println(o1);
        System.out.println("the area is " + o1.getArea());
        
          shape o2 = new triangle ("blue" , 2 , 4) ;
        System.out.println(o2);
        System.out.println("the area is " + o2.getArea());
        
        // TODO code application logic here
    }
    
}