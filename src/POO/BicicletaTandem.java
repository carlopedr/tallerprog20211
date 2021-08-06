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
    private final int numAsientos;

    public BicicletaTandem(int velocidadActual, int platoActual, int pinonActual, int numAsientos) {
        super(velocidadActual, platoActual, pinonActual);
        this.numAsientos = numAsientos;
    }

    public void acelerar(){
        //velocidadActual=velocidadActual*2;
        velocidadActual*=4;
    }
    
    @Override
    public String toString() {
        return "BicicletaTandem{" + super.toString()+ " numAsientos=" + numAsientos + '}';
    }
    
    
    
}
