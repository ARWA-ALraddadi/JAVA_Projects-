/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.jones;

import java.util.Scanner;




public class DAVIDJONES {
int customers = 400 ; 
int suppliers = 500 ;
String CustomerName ;
    
    public static void main(String[] args) { 
        // الاستدعاء 
        Scanner input = new Scanner(System.in);
        
        // instrouctions 
        DisplayInstrouctions (); 
        // name 
        GetCustomerName() ; 
        // number
        GetCustomerNumber () ; 
        
        
        
        
        
       
    }
    

public static void DisplayInstrouctions (){ 
    
    
}

public static String GetCustomerName ()
{
   System.out.println("please enter the Customer Name \n  ");
   System.out.println("must be between 6 and 15 characters");
   Scanner input = new Scanner(System.in);
   String CustomerName = input.nextLine(); 
  for (int i = 0 ; i < 10 ; i++ )
  {
  if (6 < CustomerName.length() && CustomerName.length() < 15)
     {
     System.out.println("that is correct ");
     System.out.println("__________________________ ");
     i = 10 ;
     }
  else {  
  System.out.println("must be between 6 and 15 characters"); 
  CustomerName = input.nextLine();
       } 
  }   
    return null ;   
}
public static int GetCustomerNumber ()
{
  System.out.println("please enter the Customer Number \n  ");
  System.out.println("must be 6 digits and start with digit 1");
  System.out.println("please prus enter after each digits ");
  Scanner input = new Scanner(System.in); 
  int arryCustomerNumber [] = new int [6] ;
      
  for (int i = 0 ; i < 6 ; i++ ){
   arryCustomerNumber[i] = input.nextInt() ;
   
  }
     if ( arryCustomerNumber[0] == 1 )
     {
     }
  else {  
      System.out.println("must be 6 digits and start with digit 1");
      System.out.println("please prus enter after each digits ");
      for (int i = 0 ; i < 6 ; i++ ){
      arryCustomerNumber[i] = input.nextInt() ;}
       } 
  
  
    return 0;
}
public static String GetSuppliersName ()
{
   System.out.println("please enter the suppliers Name \n  ");
   System.out.println("must be between 5 and 16 characters");
   Scanner input = new Scanner(System.in);
   String suppliersName = input.nextLine(); 
  for (int i = 0 ; i < 10 ; i++ )
  {
  if (5 < suppliersName.length() && suppliersName.length() < 16)
     {
     System.out.println("that is correct ");
     System.out.println("__________________________ ");
     i = 10 ;
     }
  else {  
  System.out.println("must be between 5 and 16 characters"); 
  suppliersName = input.nextLine();
       } 
  }   
    return null ;
}
public static int GetSupplierNumber ()
{
  System.out.println("please enter the Customer Number \n  ");
  System.out.println("must be 6 digits and start with digit 2");
  System.out.println("please prus enter after each digits ");
  Scanner input = new Scanner(System.in); 
  int arrySupplierNumber [] = new int [6] ;
      
  for (int i = 0 ; i < 6 ; i++ ){
   arrySupplierNumber[i] = input.nextInt() ;
   
  }
     if ( arrySupplierNumber[0] == 2 )
     {
     }
  else {  
      System.out.println("must be 6 digits and start with digit 2");
      System.out.println("please prus enter after each digits ");
      for (int i = 0 ; i < 6 ; i++ ){
   arrySupplierNumber[i] = input.nextInt() ; }
    
       } 
  
   
    return 0;
}



}
