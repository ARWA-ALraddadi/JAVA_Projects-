/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping.cart;

/**
 *
 * @author TOSHIBA
 */
import java.text.NumberFormat ; 

public class item {
     
    private String name ;
    private double price ; 
    private int quantlty ;
     
    public  item (String itemname , double itemprice , int numquant ) {
    name = itemname ;
    price = itemprice ;
    quantlty  = numquant ;
    } 
    
     public String tostring (){
     
     NumberFormat x = NumberFormat.getCurrencyInstance() ;
     return (name + "\t" + x.format(price) + "\t"+ quantlty + "\t"+ x.format( price * quantlty)  ) ;
     } 
     
     public double getPrice()
              {  return price;  }
     
     public String getName() 
     {  return name;  } 
     
     public int getQuantity() 
     {  return quantlty ;  }  
     
}
