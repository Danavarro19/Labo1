/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPackage;

import Aritmetico.AritmeticoFactory;
import Conversor.ConversorFactory;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Aritmetico":
                return new AritmeticoFactory();
        
            case "Conversor":
                return new ConversorFactory();
                
            default:
                return null;
        }
    }
    
}
