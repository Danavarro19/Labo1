/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactoryPackage.AbstractFactory;
import AbstractFactoryPackage.Calculo;
import AbstractFactoryPackage.FactoryProducer;
import Aritmetico.*;
import Conversor.Conversion;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{

        private AbstractFactory factory;
        private Double a;
        private Double b;
        private Integer num;

        private int WIDTH=500, HEIGHT =300;
        private int widthTF=60, heightTF =20;
        private int widthSC=150, heightSC =30;
        private int widthBT=70, heightBT =30;

        JButton btnBinDec, btnSuma, btnResta,
                btnMultiplicacion, btnDivision;


        JTextField textfield1, textfield2, textfield3,
                resultado, conversion, label;

    public Ventana() {
        this.btnBinDec = new JButton("Bin/Dec");
        this.btnSuma = new JButton("+");
        this.btnResta = new JButton("-");
        this.btnMultiplicacion = new JButton("*");
        this.btnDivision= new JButton("/");

        this.textfield1 = new JTextField();
        this.textfield2 = new JTextField();
        this.textfield3 = new JTextField();
        this.resultado = new JTextField();
        this.conversion= new JTextField();
        this.label= new JTextField();


        resultado.setBounds(20,20,widthSC,heightSC);
        conversion.setBounds(250,20,widthSC,heightSC);

        textfield1.setBounds(20,60,widthTF,heightTF);
        textfield2.setBounds(20,85,widthTF,heightTF);
        textfield3.setBounds(250,65,widthTF,heightTF);

        btnSuma.setBounds(20,120,widthBT,heightBT);
        btnResta.setBounds(95,120,widthBT,heightBT);
        btnMultiplicacion.setBounds(20,155,widthBT,heightBT);
        btnDivision.setBounds(95,155,widthBT,heightBT);
        btnBinDec.setBounds(250,120,120,heightBT);

        label.setBounds(20,260,280,30);

        btnSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                getFieldsText(Calculo.ARITMETCO);
                factory = FactoryProducer.getFactory(Calculo.ARITMETCO);
                try{
                    Double total = factory.getAritmetico(Operacion.SUMA).operacion
                            (a,b);
                    resultado.setText(total.toString());
                    label.setText("");
                }catch(NullPointerException expt){}


            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getFieldsText(Calculo.ARITMETCO);
                factory = FactoryProducer.getFactory(Calculo.ARITMETCO);
                try{
                    Double total = factory.getAritmetico(Operacion.RESTA).operacion
                            (a,b);
                    resultado.setText(total.toString());
                    label.setText("");
                }catch(NullPointerException expt){}

            }
        });

        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getFieldsText(Calculo.ARITMETCO);
                factory = FactoryProducer.getFactory(Calculo.ARITMETCO);
                try{
                    Double total = factory.getAritmetico(Operacion.MULTIPLICACION).operacion
                            (a,b);
                    resultado.setText(total.toString());
                    label.setText("");
                }catch(NullPointerException expt){}

            }
        });

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getFieldsText(Calculo.ARITMETCO);
                factory = FactoryProducer.getFactory(Calculo.ARITMETCO);
                try {
                    Double total = factory.getAritmetico(Operacion.DIVISION).operacion
                            (a, b);
                    resultado.setText(total.toString());
                    label.setText("");
                }catch(NullPointerException expt){}
            }
        });

        btnBinDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getFieldsText(Calculo.CONVERSION);
                factory =FactoryProducer.getFactory(Calculo.CONVERSION);
                try {
                    String total = factory.getConversor(
                            Conversion.DEC_BIN).convertir(num);
                    conversion.setText(total);
                    label.setText("");

                }catch (NullPointerException expt){}
            }
        });


        resultado.setEditable(false);
        conversion.setEditable(false);
        textfield1.setEditable(true);
        textfield2.setEditable(true);
        textfield3.setEditable(true);
        label.setEditable(false);



        add(resultado);
        add(conversion);
        add(textfield1);
        add(textfield2);
        add(textfield3);
        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);
        add(btnBinDec);
        add(label);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }

    private void getFieldsText(Calculo calculo){
        try{
        if (calculo==Calculo.ARITMETCO){

                    a = Double.parseDouble(textfield1.getText());
                    b = Double.parseDouble(textfield2.getText());

        }else if (calculo==Calculo.CONVERSION) {
                num = Integer.parseInt(textfield3.getText());
        }
        }catch(NumberFormatException extp){
            label.setText("Verificar valores ingresados");
        }
    }

        

}
