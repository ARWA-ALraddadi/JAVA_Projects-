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
public class triangle extends shape {
     private int beas ;
     private int hitgh ;
    public triangle(String color ,int beas ,int hitgh) {
        super(color);
        this.beas = beas ;
        this.hitgh = hitgh ;
    }
    @Override
     public String toString () {
         return" rectangle beas = " + beas + " \n  rectangle  hitgh =  "
        +  hitgh + "\n  the subclass of " + super.toString() ;
     }
     @Override
      public double getArea () {
          return 0.50 *beas * hitgh ;}
      
    
}
