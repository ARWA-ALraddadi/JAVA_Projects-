/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

/**
 *
 * @author TOSHIBA
 */
public class M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("            Multiplication Table ");
       
       for (int j= 1 ; j<= 9 ; j ++)
        System.out.print("  " + j);
       
       System.out.println("\n ____________________________");
        for (int i = 1 ; i <=9 ; i++){ 
           System.out.print(i + "#"); 
            for (int j= 1 ; j<= 9 ; j ++){
            System.out.printf("%4d",i*j) ;}
           System.out.println();  
        }
       
        // TODO code application logic here
    }
    
}
