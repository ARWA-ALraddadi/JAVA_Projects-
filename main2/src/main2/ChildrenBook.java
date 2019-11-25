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
public class ChildrenBook  extends book{
    public int Age ;
    
    public  ChildrenBook ( String p ,double  R , int y , int a) {
     super( p ,  R , y ) ;
      Age = a ;
    }
    
    @Override
     public double ComputeSalePrice(){
        if (Age < 6 ){
        return RegularPrice * 40/100 ;}
        else  {return RegularPrice * 20/100 ;}
     }
     
}
