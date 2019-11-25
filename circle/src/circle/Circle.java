/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author TOSHIBA
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle2D o1 = new circle2D (2, 2, 5.5) ;
        System.out.println ("the area : " +o1.getArea());
        System.out.println ("the prim : " + o1.getPerimeter());
        System.out.println(o1.contains(3, 3))  ;
        System.out.println(o1.contains(new circle2D (4 , 5 , 10.5) ));
        System.out.println(o1.overlaps(new circle2D (3 , 5 , 2.3) )) ;
        
        // TODO code application logic here
    }
    
}
