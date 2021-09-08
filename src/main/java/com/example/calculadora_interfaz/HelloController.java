package com.example.calculadora_interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    String expresion;
    BufferedReader br;
    Analizador analizador;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        br = new BufferedReader(new InputStreamReader(System.in));
        analizador = new Analizador();
        expresion = "";
        dec();
    }

    @FXML
    private TextField pantallaUno;

    @FXML
    private TextField PantallaDos;

    @FXML
    private Button igual;

    @FXML
    private Label base;


    @FXML
    private Button bin,oct,dec,hex,cerrar,siete, ocho, nueve, cuatro, cinco, seis, uno, dos, tres, cero, parentesisA, parentesisC, por, dividido, mas, menos, potencia, punto, porciento, c, ce,borrar;
    @FXML
    private Button a,d,b,e,cc,f;

    @FXML
    public void cerrar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void base(ActionEvent event) {
        Object boton = event.getSource();
        if (boton.equals(bin)) {
            base.setText("BIN");
            binario();
        } else if (boton.equals(oct)) {
            base.setText("OCT");
            octal();
        } else if (boton.equals(dec)) {
            base.setText("DEC");
            dec();
        } else if (boton.equals(hex)) {
            base.setText("HEX");
            hexagecimal();
        }
    }

    @FXML
    public void operar(ActionEvent event) {
        try {
            expresion = pantallaUno.getText();
            expresion = "" + analizador.evaluar(expresion);
            PantallaDos.setText(expresion);

        } catch (Excepciones exc) {
            expresion = "" + exc;
            PantallaDos.setText(expresion);
        }
    }

    public void resultado() {
        try {
            expresion = pantallaUno.getText();
            expresion = "" + analizador.evaluar(expresion);
            PantallaDos.setText(expresion);

        } catch (Excepciones exc) {
            expresion = "" + exc;
            PantallaDos.setText(expresion);
        }
    }

    public void dec(){
        uno.setDisable(false);
        dos.setDisable(false);
        tres.setDisable(false);
        cuatro.setDisable(false);
        cinco.setDisable(false);
        seis.setDisable(false);
        siete.setDisable(false);
        ocho.setDisable(false);
        nueve.setDisable(false);
        cero.setDisable(false);
        punto.setDisable(false);

        a.setDisable(true);
        b.setDisable(true);
        cc.setDisable(true);
        d.setDisable(true);
        e.setDisable(true);
        f.setDisable(true);
    }

    public void octal(){
        uno.setDisable(false);
        dos.setDisable(false);
        tres.setDisable(false);
        cuatro.setDisable(false);
        cinco.setDisable(false);
        seis.setDisable(false);
        siete.setDisable(false);
        ocho.setDisable(false);
        cero.setDisable(false);
        punto.setDisable(false);

        nueve.setDisable(true);
        a.setDisable(true);
        b.setDisable(true);
        cc.setDisable(true);
        d.setDisable(true);
        e.setDisable(true);
        f.setDisable(true);
    }
    public void binario(){
        uno.setDisable(false);
        cero.setDisable(false);
        punto.setDisable(false);

        dos.setDisable(true);
        tres.setDisable(true);
        cuatro.setDisable(true);
        cinco.setDisable(true);
        seis.setDisable(true);
        siete.setDisable(true);
        ocho.setDisable(true);
        nueve.setDisable(true);
        a.setDisable(true);
        b.setDisable(true);
        cc.setDisable(true);
        d.setDisable(true);
        e.setDisable(true);
        f.setDisable(true);
    }

    public void hexagecimal(){
        uno.setDisable(false);
        dos.setDisable(false);
        tres.setDisable(false);
        cuatro.setDisable(false);
        cinco.setDisable(false);
        seis.setDisable(false);
        siete.setDisable(false);
        ocho.setDisable(false);
        nueve.setDisable(false);
        cero.setDisable(false);
        punto.setDisable(false);
        a.setDisable(false);
        b.setDisable(false);
        cc.setDisable(false);
        d.setDisable(false);
        e.setDisable(false);
        f.setDisable(false);
    }
    @FXML
    void teclado(ActionEvent event) {
        Object boton = event.getSource();
        if (boton.equals(uno)) {
            pantallaUno.setText(pantallaUno.getText() + "1");
        } else if (boton.equals(dos)) {
            pantallaUno.setText(pantallaUno.getText() + "2");
        } else if (boton.equals(tres)) {
            pantallaUno.setText(pantallaUno.getText() + "3");
        } else if (boton.equals(cuatro)) {
            pantallaUno.setText(pantallaUno.getText() + "4");
        } else if (boton.equals(cinco)) {
            pantallaUno.setText(pantallaUno.getText() + "5");
        } else if (boton.equals(seis)) {
            pantallaUno.setText(pantallaUno.getText() + "6");
        } else if (boton.equals(siete)) {
            pantallaUno.setText(pantallaUno.getText() + "7");
        } else if (boton.equals(ocho)) {
            pantallaUno.setText(pantallaUno.getText() + "8");
        } else if (boton.equals(nueve)) {
            pantallaUno.setText(pantallaUno.getText() + "9");
        } else if (boton.equals(cero)) {
            pantallaUno.setText(pantallaUno.getText() + "0");
        } else if (boton.equals(punto)) {
            pantallaUno.setText(pantallaUno.getText() + ".");
        } else if (boton.equals(parentesisA)) {
            pantallaUno.setText(pantallaUno.getText() + "(");
        } else if (boton.equals(parentesisC)) {
            pantallaUno.setText(pantallaUno.getText() + ")");
        } else if (boton.equals(porciento)) {
            pantallaUno.setText(pantallaUno.getText() + "%");
        } else if (boton.equals(potencia)) {
            pantallaUno.setText(pantallaUno.getText() + "^");
        } else if (boton.equals(por)) {
            pantallaUno.setText(pantallaUno.getText() + "*");
        } else if (boton.equals(dividido)) {
            pantallaUno.setText(pantallaUno.getText() + "/");
        } else if (boton.equals(mas)) {
            pantallaUno.setText(pantallaUno.getText() + "+");
        } else if (boton.equals(menos)) {
            pantallaUno.setText(pantallaUno.getText() + "-");
        } else if (boton.equals(c)) {
            pantallaUno.setText("");
            PantallaDos.setText("");
        } else if (boton.equals(ce)) {
            pantallaUno.setText("");
            PantallaDos.setText("");
        } else if (boton.equals(borrar)) {
      /*      System.out.println(pantallaUno.getText());
            if(pantallaUno.getText() == null) System.out.println("verdad");*/
                pantallaUno.setText(pantallaUno.getText().substring(0,pantallaUno.getText().length()-1));
        }


        if (!boton.equals(ce) && !boton.equals(c) && !boton.equals(punto) && !boton.equals(porciento) && !boton.equals(menos)
                && !boton.equals(mas) && !boton.equals(dividido) && !boton.equals(por)&& !boton.equals(potencia)) resultado();

    }
}