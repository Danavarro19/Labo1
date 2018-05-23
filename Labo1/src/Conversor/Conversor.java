/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author LN710Q
 * @param <E>
 * @param <F>
 */
public interface Conversor<E,F> {
    
    F convertir(E e);
    
}
