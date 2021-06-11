/*
 * Calcular el promedio de n valores
 * 
 * 
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author Carlos Pedraza 20012345678
 */
public class UsoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        double prom,acum=0,dato;
        System.out.print("Cantidad de datos: ");
        n=entrada.nextInt();
        //Uso de contador para control de ciclo
        int i=1;
        while(i<=n){
            
            System.out.print("Ingrese un numero: ");
            dato=entrada.nextDouble();
            acum=acum+dato;
            i++;
        }
        prom=acum/n;
        System.out.println("Promedio: "+prom);
        System.out.println("i: "+i);
        
        

    }
    
}
