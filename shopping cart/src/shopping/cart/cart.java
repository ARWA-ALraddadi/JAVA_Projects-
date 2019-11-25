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

public class cart {
    private int itemCount;
    private double totalPrice ;
    private int capacity; 
    item [] cart ; 
    
   public cart() {
    capacity = 5;
     itemCount = 0; 
     totalPrice = 0.0;  
     cart = new item[capacity];
     
   } 
   
   public void addToCart(String itemName, double price, int quantity ){
    if (itemCount > 5)
		{
			System.out.println("Now the shopping cart is full");
		}
		else
		{
			cart[itemCount]=new item(itemName, price, quantity);
			totalPrice = totalPrice + (price * 	quantity);
		}
		itemCount = itemCount+1;   
    }
   public String toString()  { 
       NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
       
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
         for (int i = 0; i <itemCount ; i++) {
        contents += cart[i] + "\n";}
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n"; 
        
        return contents; 
         }
    private void increaseSize()
	{
		capacity = capacity + 3;
	}
	
    
    
}
