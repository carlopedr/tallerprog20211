/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operadores {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op1, op2;
        op1 = 5;
        op2 = 4;
        //int res=op1/op2;
        float res2 = (float) op1 / (float) op2;
        System.out.println("Resultado: " + res2);
        //Operadores condicionales
        boolean carnetConducir = true;
        int edad = 17;
        boolean puedeConducir = (edad >= 18) && carnetConducir;
        System.out.println("Puede conduir?: " + puedeConducir);
        //Notación de operaciones
        int x=0;
        x=x+3;
        x+=3;
        int resultado = 9 / 3 * 3;
        System.out.println("Resultado: " + resultado);
        
        
        

    }
}
