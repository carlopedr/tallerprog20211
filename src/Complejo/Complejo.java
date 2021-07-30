/*
1. Crea una clase Complejo que permita trabajar con números 
complejos (parte real y parte imaginaria). 
Incluye los siguientes métodos: constructores (por defecto y parametrizado), 
getters, setters, suma, resta, multiplicación, división, 
acumulación y print().
 */
package Complejo;
/**
 *
 * @author Carlos Pedraza - carlospedraza@usco.edu.co
 */
public class Complejo {
    private float preal;
    private float pimag;
    //Constructor por defecto
    public Complejo() {
    }
    //Constructor parametrizado
    public Complejo(float preal, float pimag) {
        this.preal = preal;
        this.pimag = pimag;
    }
    //Getters

    public float getPreal() {
        return preal;
    }

    public float getPimag() {
        return pimag;
    }
    //Setters

    public void setPreal(float preal) {
        this.preal = preal;
    }

    public void setPimag(float pimag) {
        this.pimag = pimag;
    }

    public void print(){
        System.out.println("PReal: "+preal+" PImag: "+pimag);
    }

    @Override
    public String toString() {
        return "Complejo{" + "preal=" + preal + ", pimag=" + pimag + '}';
    }
    
    //Métodos
    
    public Complejo suma(Complejo op){
        Complejo res=new Complejo(preal+op.preal,pimag+op.pimag);
        return res;
        
    }
    
    public Complejo resta(Complejo op){
        Complejo res=new Complejo(preal-op.preal,pimag-op.pimag);
        return res;
      
    }
    
    public void producto(){
        
    }
    
    public void division(){
        
    }
    
    
    
    

    
    
    
    
    
    
}
