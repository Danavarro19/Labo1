/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import colors.Color;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

/**
 *
 * @author Nelson Guardado
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
       return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
    }
    
}
