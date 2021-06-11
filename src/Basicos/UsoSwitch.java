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
public class UsoSwitch {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir=false;
        while (salir == false) {
             System.out.println("Menú Áreas - Seleccione la opción: ");
             System.out.println("1 - Rectángulo");
             System.out.println("2 - Triángulo");
             System.out.println("3 - Circulo");
             System.out.println("4 - Salir");
             int op = entrada.nextInt();
             switch (op) {
                 case 1:
                     System.out.println("Para calcular el Área de un Rectángulo");
                     salir=true;
                     break;
                 case 2:
                     System.out.println("Para calcular el Área de un Triángulo");
                     salir=true;
                     break;
                 case 3:
                     System.out.println("Para calcular el Área de un Cículo");
                     salir=true;
                     break;
                 case 4:
                     System.out.println("Gracias por utilizar nuestro programa");
                     salir=true;
                     break;
                 default:
                     System.out.println("Opción equivocada");
             }
         }

        
        

    }
}
