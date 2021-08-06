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
        miBici.cambiarPinon();
        miBici.cambiarPlato();
        System.out.println("Después de cambiar plato y piñon sin parametros");
        System.out.println("VlA:"+miBici.getVelocidadActual()
                +"\nPlA:"+miBici.getPlatoActual()
                +"\nPñA:"+miBici.getPinonActual());
        Bicicleta tuBici = new Bicicleta();
        System.out.println("Objeto creado sin paratmetros");
        System.out.println(tuBici.toString()+" Num Ruedas:"+Bicicleta.numeroRuedas);
        Bicicleta.setNumeroRuedas(3);
        System.out.println(tuBici.toString()+" Num Ruedas:"+Bicicleta.numeroRuedas);
       
        System.out.println("Montaña");
        BicicletaMontana miBM = new BicicletaMontana(20,40,16,5);
        System.out.println(miBM.toString());
        System.out.println("Montaña Acelerada");
        miBM.acelerar();
        System.out.println(miBM.toString());
        System.out.println("Tandem");
        BicicletaTandem miBT = new BicicletaTandem(3,25,45,20);
        System.out.println(miBT.toString());
        miBT.acelerar();
        System.out.println("Tandem Acelerada");
        System.out.println(miBT.toString());
        System.out.println("Interfaz");
        Bicicleta miBici1 = new Bicicleta(30,54,12);
        miBici1.imprimir();
        
    }
}
