/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Nelson Guardado
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equals("SHAPE"))
        {
             return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("COLOR"))
        {
             return new ColorFactory();
        }
        return null;
    }
}
