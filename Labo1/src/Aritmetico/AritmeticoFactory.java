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
public class AritmeticoFactory implements AbstractFactory{

    @Override
    public Conversor getConversor(String type) {
        return null;
    }

    @Override
    public Aritmetico getAritmetico(String type) {
        
        switch(type){
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
                
            case "multipliacion":
                return new Multipliacion();
                
            case "division":
                return new Division();
                
            default: 
                return null;
        }
        
    }
    
}
