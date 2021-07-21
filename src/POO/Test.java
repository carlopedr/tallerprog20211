/*
 * Clase para realizar pruebas de código
 */
package POO;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Bicicleta miBici = new Bicicleta(20,40,16);
        
        System.out.println(miBici.toString());
        miBici.acelerar();
        System.out.println("Después de acelerar");
        System.out.println("VlA:"+miBici.getVelocidadActual()
                +"\nPlA:"+miBici.getPlatoActual()
                +"\nPñA:"+miBici.getPinonActual());
        miBici.setVelocidadActual(32);
        miBici.frenar();
        System.out.println("Después de frenar");
        System.out.println("VlA:"+miBici.getVelocidadActual()
                +"\nPlA:"+miBici.getPlatoActual()
                +"\nPñA:"+miBici.getPinonActual());
        miBici.cambiarPinon(24);
        miBici.cambiarPlato(32);
        System.out.println("Después de cambiar plato y piño");
        System.out.println("VlA:"+miBici.getVelocidadActual()
                +"\nPlA:"+miBici.getPlatoActual()
                +"\nPñA:"+miBici.getPinonActual());
        
    
    }
}
