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
public class circle2D {
    private double x ,y ;
    private double reduis ;
     
     circle2D (){
      x = 0 ;
      y = 0 ;
      reduis =  1 ; 
    }
     circle2D (int x , int y ,double reduis ){
     this.x = x ;
     this.y = y ; 
     this.reduis = reduis ;
     } 
     double getX (){ return x ;}
     
     double getY (){ return y ;}
     
     double getReduis (){ return reduis ;} 
     
     double getArea (){ return reduis * reduis * Math.PI ;} 
     
     double getPerimeter (){ return  2 * Math.PI * reduis  ; }
     
     boolean contains(double x, double y) {
       double point = (Math.pow(this.x - x , 2.0) + Math.pow(this.y - y, 2.0)) ;
       if (point <= reduis * reduis){ 
         return true ; } 
       else  return false ;
     }
     boolean contains( circle2D circle  ) {
        
     double distance = Math.sqrt(Math.pow(circle.x - getX(), 2.0) +
      Math.pow(circle.y - getY(), 2.0));
      if (distance <= Math.abs(reduis - circle.reduis)){
        return true;}
        else
        return false;
        
     }
      boolean overlaps( circle2D circle) {
          double distance = Math.sqrt(Math.pow(circle.x - getX(), 2.0) +
                               Math.pow(circle.y - getY(), 2.0));
         if (distance > Math.abs(reduis - circle.reduis) && distance <
                   Math.abs(reduis + circle.reduis))
             return true;
            else
            return false;
     }
     
}
