/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

import AbstractFactoryPackage.AbstractFactory;
import Conversor.Conversor;

/**
 *
 * @author LN710Q
 */
public class AritmeticoFactory implements AbstractFactory <Operacion>{

    @Override
    public Conversor getConversor(Operacion operacion) {
        return null;
    }

    @Override
    public Aritmetico getAritmetico(Operacion operacion) {
        
        switch(operacion){
            case SUMA:
                return new Suma();
            case RESTA:
                return new Resta();
                
            case MULTIPLICACION:
                return new Multipliacion();
                
            case DIVISION:
                return new Division();
                
            default: 
                return null;
        }
        
    }
    
}
