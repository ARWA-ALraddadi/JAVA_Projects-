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
public class book {
    public String Publisher ;
    public double  RegularPrice ;
    public int  YearPublished ;
     
   public  book (String p ,double  R , int y ){
     Publisher = p ;   
   RegularPrice = R ;
   YearPublished = y ;
   }
   
   public double ComputeSalePrice() {
        return  RegularPrice ;
   
   }
    
}
