/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Usuario
 */
public class Test2 {
    public static void main(String[] args) {
        Bicicleta[] peloton = {
            new Bicicleta(20,40,16),
            new BicicletaMontana(24,44,10,5),
            new BicicletaTandem(18,35,20,3)
        };
        for (int i=0;i<peloton.length;i++){
            peloton[i].acelerar();
            System.out.println(peloton[i].toString());
        }
            
    }
}
