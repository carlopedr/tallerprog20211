/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Textos1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto1="2021";
        System.out.println("Texto1:"+texto1);
        String texto2=texto1+1;
        System.out.println("Texto2:"+texto2);
        String a = "USCO";
        String b = "Usco";
        System.out.println("Comparar String equals:" + a.equals(b));
        System.out.println("Comparar String equals:"+a.equalsIgnoreCase(b));
        int valor1=Integer.valueOf(texto1)+1;
        System.out.println("Valor1:"+valor1);
        
    
    }
}
