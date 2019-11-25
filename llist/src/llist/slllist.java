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
public class slllist {
    public node head =null ;
    
    public node serch (Object k){
        node x = head ;
        while (x!= null && !x.data.equals(k))
        x = x.next ;
        return x;
}
    public void insart (node x ){
    x.next = head ;
    head = x ;
    }
    public void delet (node x ){
    if (x==head )x.next =head ;
    else {
    node tem = head , prev = null ;
    while (tem != x && tem !=null ){
    prev = tem ; 
    tem = tem.next ;        
    }
    if (tem == null) return ;
    prev.next = tem.next;
    
    }
    }
    public void printall (){
    for (node tem = head ; tem != null ; tem = tem.next){
    System.out.print(tem.data + "  ");
    }
    
    }
}
