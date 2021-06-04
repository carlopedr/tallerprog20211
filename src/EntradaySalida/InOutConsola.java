/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradaySalida;
import java.util.Scanner;
public class InOutConsola {
    public static void main(String[] args) {
        //Se crea un objeto (entrada) de la clase scanner
        //que sirve para capturar lo que se ingrese por teclado
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");//cout o printf C++
        //cin scanf
        nombre=entrada.next();
        System.out.println("Hola "+nombre);
        
        
    }
    
}
