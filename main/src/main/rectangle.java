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
public class rectangle extends shape  {
     private int leanth ;
     private int width ;
     
    public rectangle(String color , int leanth , int width ) {
        super(color);
        this.leanth = leanth ;
        this.width = width ;
    }
     @Override
     public String toString () {
         return" rectangle leanth = " + leanth + "  \n rectangle  width =  "
        +  width + "\n the subclass of " + super.toString() ;
     }
     @Override
      public double getArea () {
          return leanth * width ;}
      

     
    
}
