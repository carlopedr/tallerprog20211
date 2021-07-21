
package POO;

public class Bicicleta {
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
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
    
    
    
    
    void acelerar(){
        //velocidadActual=velocidadActual*2;
        velocidadActual*=2;
    }
    void frenar(){
        //velocidadActual=velocidadActual/2;
        velocidadActual/=2;
    }
    void cambiarPlato(int plato){
        platoActual=plato;
    }
    void cambiarPinon(int pinon){
        pinonActual=pinon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinonActual=" + pinonActual + '}';
    }
    
    
}
