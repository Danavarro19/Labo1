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
public class ConversorFactory implements AbstractFactory {

    @Override
    public Conversor getConversor(String type) {
        switch(type){
            case "DecimalBinario":
                return new ConvertirEnteroBinario();
                
            default:
                return null;
        }
    }

    @Override
    public Aritmetico getAritmetico(String type) {
        return null;
    }
    
    
}
