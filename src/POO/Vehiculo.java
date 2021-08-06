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
public abstract class Vehiculo {
    protected int velocidadActual;

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
}
