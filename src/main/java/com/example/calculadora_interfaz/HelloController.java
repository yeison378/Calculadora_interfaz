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
    }

    @FXML
    private TextField pantallaUno;

    @FXML
    private TextField PantallaDos;

    @FXML
    private Button igual;

    @FXML
    public void operar(ActionEvent event) {
        try {
            expresion = pantallaUno.getText();
           expresion = ""+analizador.evaluar(expresion);
            PantallaDos.setText(expresion);

        }catch(Excepciones exc) {
            expresion = ""+exc;
            PantallaDos.setText(expresion);
        }
    }
}