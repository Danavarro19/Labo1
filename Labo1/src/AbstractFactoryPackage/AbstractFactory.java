/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPackage;

import Aritmetico.Aritmetico;
import Conversor.Conversor;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    
    Conversor getConversor(String type);
    Aritmetico getAritmetico(String type);
    
}
