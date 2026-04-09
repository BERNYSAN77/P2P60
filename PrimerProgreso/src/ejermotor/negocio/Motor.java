package ejermotor.negocio;

public class Motor {
    private boolean estado;
    private int velocidad;

    // encender(), apagar(), ajustarVelocidad(int nuevaVelocidad) y
    //mostrarEstado().
    public void encender(){
        if(estado){
            System.out.println("Motor ya está encendido.");
        }else{
            estado = true;
        }
    }
    public void apagado(){
        if(estado){
            estado = false;
        }else{
            System.out.println("Motor ya está apagado.");
        }
    }
    public void ajustarVelocidad(int nuevaVelocidad){
        if(nuevaVelocidad>0 && nuevaVelocidad<=100){
            velocidad = nuevaVelocidad;
        }else{
            System.out.println("La velocidad debe estar entre 1 y 100.");
        }
    }
    public void mostrarEstado(){
        if(estado){
            System.out.println("El motor está encendido.\nLa velocidad es: "+velocidad);
        }else {
            System.out.println("El motor está apagado.");
        }
    }

}
