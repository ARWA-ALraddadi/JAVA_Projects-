/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping.cart;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class ShoppingCart {
    
 static Scanner scan = new Scanner(System.in);
 static NumberFormat fmt = NumberFormat.getCurrencyInstance();
 static cart cart = new cart();
 static item tem = new item (" ",0.0 , 0);
 static int totalQuantity = 0;
 static double totalPrice = 0;
 static int itemCount = 0;

    public static void main(String[] args) {
        System.out.println("Hello, welcome to the df store!");
        System.out.println("0: Check Out");
        System.out.println("1: Pick a new item");
        System.out.print("\nEnter your choice: ");
       int choice = scan.nextInt();
       while (choice != 0)
        {
        switch(choice) {

           case 0:
       System.out.println("Please pay $"+ totalPrice);
          break;
               
         case 1:
         System.out.print("Item Name: ");
         String itemName = scan.next();
          System.out.print("Price: $");
         double price = scan.nextDouble();
          System.out.print("Quantity: ");
          int quantity = scan.nextInt();
          cart.addToCart(itemName, price, quantity);
        totalQuantity =+ quantity;
        totalPrice +=(quantity*price);
        itemCount += 1;
         break;
             
         default: System.out.println("Sorry, invalid choice");
        }
       choice = scan.nextInt() ;
        }
        System.out.println(cart.toString()); 
         
        System.out.println("Please pay $"+ totalPrice);

    }

 

  

 

}
 

 

      // *** print the final total of the grocery list with a “Please pay ...” in front of the toalPrice. 
  
   
