/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Uso de la clase Arrays
 * @author Usuario
 */
public class Arreglos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[];
        int b[] = new int[20];
        Arrays.fill(b, -1);
        System.out.println("Arreglo b");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        
       
    }
}
