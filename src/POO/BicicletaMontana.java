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
public class BicicletaMontana extends Bicicleta{
    int suspension;
    
    public BicicletaMontana(int velocidadActual, int platoActual, int pinonActual,int suspension){
        super(velocidadActual, platoActual, pinonActual);
        this.suspension=suspension;
    }
    
    public void cambiarSuspension(int suspension){
        this.suspension=suspension;
    }

    public void acelerar(){
        //velocidadActual=velocidadActual*2;
        velocidadActual*=3;
    }
    @Override
    public String toString() {
        return "BicicletaMontana{"+ super.toString()+ "suspension=" + suspension + '}';
    }
    
    
}
