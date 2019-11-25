/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;


public class Cartoon  extends book {
   public String name ; 

    public Cartoon(String p, double R, int y , String n ) {
        super(p, R, y);
        name = n ;
    }
     @Override
     public double ComputeSalePrice(){
        if (RegularPrice < 100 ){
        return RegularPrice * 25/100 ;}
        else  {return RegularPrice * 40/100 ;}
     }
     
     
}
