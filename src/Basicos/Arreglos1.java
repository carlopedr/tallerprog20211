/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[];
        int b[] = new int[]{3, 4, 5, 6, 7, 8};
        System.out.println("Arreglo b");
        for(int i=0;i<6;i++){
            System.out.println(b[i]);
        }
        a = b;
        System.out.println("Arreglo a");
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
        a[3]=999;
        System.out.println("Arreglo b");
        for(int i=0;i<6;i++){
            System.out.println(b[i]);
        }
        a = b;
        System.out.println("Arreglo a");
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
        int c[]=new int[5];
        c[0]=1;
        c[1]=2;
        System.out.println("Tamaño de c:"+c.length);
    }
}
