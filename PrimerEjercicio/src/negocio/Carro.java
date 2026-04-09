package negocio;

public class Carro {
    public double velocidad;
    public double potencia;

    public void acelerar(){
        velocidad += potencia;
    }
    public void frenar(){
        velocidad /= 2;
    }

}
