/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complejo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Complejo c1 = new Complejo(2,3);
        c1.print();
        Complejo c2 = new Complejo(4,5);
        c2.print();
        //c1+c2
        //c3=c1.suma(c2)
        Complejo c3= new Complejo();
        System.out.println("Suma");
        c3=c1.suma(c2);
        c3.print();
        System.out.println("Resta");
        c3=c1.resta(c2);
        c3.print();
        
        
    }
}
