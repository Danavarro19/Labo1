/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

import AbstractFactoryPackage.AbstractFactory;
import Aritmetico.Aritmetico;

/**
 *
 * @author LN710Q
 */
public class ConversorFactory implements AbstractFactory <Conversion>{

    @Override
    public Conversor getConversor(Conversion conv) {
        switch(conv){
            case DEC_BIN:
                return new ConvertirEnteroBinario();
                
            default:
                return null;
        }
    }

    @Override
    public Aritmetico getAritmetico(Conversion conv) {
        return null;
    }
    
    
}
