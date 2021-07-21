/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Scanner;

public class CaballosRey {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int cant;
         String nombres[];
         int numclavos[];
         System.out.print("Ingrese la cantidad de caballos: ");
         cant = input.nextInt();
         nombres = new String[cant];
         numclavos = new int[cant];
         //Ingresar los datos
         int i=0;
         while(i<cant) {
           System.out.println("Caballo No. "+(i+1));
           System.out.print("Ingrese el nombre del caballo: ");
           nombres[i]=input.next();
           input.nextLine();
           System.out.print("Cantidad de clavos: ");
           numclavos[i]=input.nextInt();
           i++;
         }
         System.out.println("Listado de Caballos");
         for (i=0;i<cant;i++){
             System.out.println(nombres[i]+"   -  "+numclavos[i]);
         }
         //Calcular el total a pagar
         int totalpago=0;
         for (i=0;i<cant;i++){
             for(int k=1;k<=numclavos[i];k++){
                 totalpago=(int) (totalpago+Math.pow(2,k-1));
             }
         }
         System.out.println("Total pago:"+totalpago);
         
        
        
        
     }
}
