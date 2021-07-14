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
public class Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int m[][];
        System.out.print("Ingrese el tamaño de la matriz: ");
        n=input.nextInt();
        m=new int[n][n];
        //Ingreso de datos por el usuario
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             System.out.print("Ingrese el valor "+i+","+j+":");
             m[i][j]=input.nextInt();
            }
        }*/
        //Datos de forma aleatoria
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             m[i][j]=(int)(Math.random()*10+1);
            }
        }
        //Mostrar la matriz
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             System.out.print(m[i][j]+"    ");
            }
            System.out.println();
        }
        
        
        
    
    }
}
