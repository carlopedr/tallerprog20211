
package POO;

public class Bicicleta extends Vehiculo implements Imprimible {
    protected int platoActual;
    protected int pinonActual;
    public static int numeroRuedas = 2;
    
    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        super(velocidadActual);
        //this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    public Bicicleta() {
        super(0);
        this.platoActual = 1;
        this.pinonActual = 1;
    }
    //Métodos get y set para acceder al valor del atributo y 
    //cambiar el valor del atributo
    //Se crea un método get y un método set para cada atributo

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }

    public static int getNumeroRuedas() {
        return numeroRuedas;
    }

    public static void setNumeroRuedas(int numeroRuedas) {
        Bicicleta.numeroRuedas = numeroRuedas;
    }
        
    public void acelerar(){
        //velocidadActual=velocidadActual*2;
        velocidadActual*=2;
    }
    public void frenar(){
        //velocidadActual=velocidadActual/2;
        velocidadActual/=2;
    }
    void cambiarPlato(int plato) {
        platoActual = plato;
    }

    void cambiarPlato() {
        platoActual = 1;
    }

    void cambiarPinon(int pinon) {
        pinonActual = pinon;
    }

    void cambiarPinon() {
        pinonActual = 1;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Vel. Actual :"+velocidadActual);
        System.out.println("Plato Actual:"+platoActual);
        System.out.println("Plato Actual:"+pinonActual);
  
    }
    
    
    
}
