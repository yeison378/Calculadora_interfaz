package com.example.calculadora_interfaz;
import java.io.*;

public class Principal {
    public static void main(String args[])throws IOException{
        
        String expresion;
        BufferedReader br = new
        BufferedReader(new InputStreamReader(System.in));
        
        Analizador analizador = new Analizador();
        System.out.println("INGRESA UNA EXPRESION");
        expresion = br.readLine();
        
        try {
            System.out.println("RESULTADO: "+analizador.evaluar(expresion));
            System.out.println();
        }catch(Excepciones exc) {
            System.out.println(exc);
        }
        
    }
}

