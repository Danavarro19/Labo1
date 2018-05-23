/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    
        private int WIDTH=300, HEIGHT =300;
        private int widthTF=120, heightTF =20;
        private int widthBT=100, heightBT =30;
        
        JButton btn;
        JTextField textfield1, textfield2, resultado;

    public Ventana() {
        this.btn = new JButton("Copiar");
        this.textfield1 = new JTextField();
        this.textfield2 = new JTextField();
        
        textfield2.setBounds(100,200,widthTF,heightTF);
        textfield1.setBounds(100,40,widthTF,heightTF);
        
        btn.setBounds(110,125,widthBT,heightBT);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield2.setText(textfield1.getText());
            }
        });
        textfield1.setEditable(true);
        textfield2.setEditable(false);
        add(btn);
        add(textfield1);
        add(textfield2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }

        

}
