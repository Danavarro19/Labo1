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
        private int widthSC=460, heightSC =30;
        private int widthBT=70, heightBT =30;

        JButton btnBinDec, btnSuma, btnResta,
                btnMultiplicacion, btnDivision;


        JTextField textfield1, textfield2, textfield3,
                resultado, field;

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
        this.field= new JTextField();


        resultado.setBounds(20,20,widthSC,heightSC);

        textfield1.setBounds(20,60,widthTF,heightTF);
        textfield2.setBounds(85,60,widthTF,heightTF);
        textfield3.setBounds(250,65,widthTF,heightTF);

        btnSuma.setBounds(20,120,widthBT,heightBT);
        btnResta.setBounds(95,120,widthBT,heightBT);
        btnMultiplicacion.setBounds(20,155,widthBT,heightBT);
        btnDivision.setBounds(95,155,widthBT,heightBT);
        btnBinDec.setBounds(250,120,120,heightBT);

        field.setBounds(20,260,280,30);

        btnSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAritmetico(Operacion.SUMA);
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAritmetico(Operacion.RESTA);

            }
        });

        btnMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnAritmetico(Operacion.MULTIPLICACION);

            }
        });

        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnAritmetico(Operacion.DIVISION);

            }
        });

        btnBinDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnConversion(Conversion.DEC_BIN);
            }
        });


        resultado.setEditable(false);
        textfield1.setEditable(true);
        textfield2.setEditable(true);
        textfield3.setEditable(true);
        field.setEditable(false);



        add(resultado);
        add(textfield1);
        add(textfield2);
        add(textfield3);
        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);
        add(btnBinDec);
        add(field);

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
            field.setText("Verificar valores ingresados");
        }

    }


    private void btnAritmetico(Operacion operacion){
        getFieldsText(Calculo.ARITMETCO);
        factory = FactoryProducer.getFactory(Calculo.ARITMETCO);
        try {
            Double total = factory.getAritmetico(operacion).operacion
                    (a, b);
            resultado.setText(total.toString());
            field.setText(null);
            }catch(NullPointerException expt){}
    }


    private void btnConversion(Conversion conversion){
        getFieldsText(Calculo.CONVERSION);
        factory =FactoryProducer.getFactory(Calculo.CONVERSION);
        try {
            String total = factory.getConversor(
                    conversion).convertir(num);
            resultado.setText(total);
            field.setText(null);

        }catch (NullPointerException expt){}

    }


}


        


