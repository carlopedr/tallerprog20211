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
public class SesionUno {
     public static void main(String[] args) {
         int d;
         boolean bl;
         d=1000;
         byte b=(byte)d;
         System.out.println("b= "+b);
         //b=días;
         b=100;
         int i=b;
         {
         float f=100.6f;
         i=(int)f;
         }
         
         System.out.println("i= "+i);
         //bl=(boolean)f;
         //i=f;
        Scanner entrada = new Scanner(System.in);
        char l='S';
        String n="Nombre";
        System.out.print("Ingrese su nombre: ");
        System.out.print("\n");
        String nombre;
        //System.out.println("Ingrese su nombre: ");//cout o printf C++
        //cin scanf
        nombre=entrada.next();
        //System.out.println("Hola "+nombre);
        
        
    }
}
