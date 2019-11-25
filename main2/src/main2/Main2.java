/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author TOSHIBA
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChildrenBook x = new ChildrenBook ("we" , 223 , 2015 ,7) ;
        Cartoon w = new Cartoon("se", 120 , 2014 , "the");
        poly v = new poly () ;
        
        
        System.out.println(x.ComputeSalePrice());
        System.out.println(w.ComputeSalePrice());
        v.print(x);
        v.print(w);
    }
    
}
