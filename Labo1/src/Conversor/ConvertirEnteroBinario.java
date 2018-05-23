/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;


/**
 *
 * @author LN710Q
 */
public class ConvertirEnteroBinario implements Conversor <Integer, String> {

    @Override
    public String convertir(Integer e) {
        String binario="";
        while (e>1){
            binario+=e%2;
        }
        binario+=e;
        binario = new StringBuilder(binario).reverse().toString();
        return binario;
    }

    
    
}
