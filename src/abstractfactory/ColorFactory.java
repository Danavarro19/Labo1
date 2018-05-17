/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import colors.Blue;
import colors.Color;
import colors.Green;
import colors.Red;
import shape.Shape;

/**
 *
 * @author Nelson Guardado
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color == null){
         return null;
      }		
      
      if(color.equalsIgnoreCase("RED")){
         return new Red();
         
      }else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
         
      }else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      
      return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
    
}
