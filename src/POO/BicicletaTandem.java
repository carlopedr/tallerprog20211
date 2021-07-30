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
public class BicicletaTandem extends Bicicleta{
    private int numAsientos;

    public BicicletaTandem(int numAsientos, int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual, platoActual, pinonActual);
        this.numAsientos = numAsientos;
    }

    void acelerar(){
        //velocidadActual=velocidadActual*2;
        velocidadActual*=4;
    }
    
    @Override
    public String toString() {
        return "BicicletaTandem{" + super.toString()+ " numAsientos=" + numAsientos + '}';
    }
    
    
    
}
