/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llist;

/**
 *
 * @author TOSHIBA
 */
public class Llist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        node x = new node ((Integer)10);
        node y = new node ((Integer)20);
        node z = new node ((Integer)30);
        slllist list = new slllist ();
        list.insart(x); 
        list.insart(y);
        list.insart(z);
        list.printall();
        list.delet(y);
        list.printall();
    }
    
}
