/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author TOSHIBA
 */
public class shape {
    private String color ; 
    
    public  shape (String color ){
        this.color = color ; 
    }
    public String toString (){
    return "the shap color =\" " + color  ;
    }
    public double getArea (){
        System.err.println(" shape unkonw , cannt comlet area");
        return 0;
    }
}
