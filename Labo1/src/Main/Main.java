/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conversor.Conversion;
import Conversor.ConversorFactory;
import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("mi ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);


    }
    
    
    
    
}
