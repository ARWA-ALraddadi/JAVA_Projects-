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
public class node {
  public Object  data ;
  public node next ;
  
  public node (){
  this(null , null);
  }
   public node (Object  data){
  this(data , null);
  }
  public node(Object  data , node next ){
  this.data = data ;
  this.next = next ;
  }
}
