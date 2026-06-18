package ejermotor.negocio;

public class Motor {
    private boolean estado;
    private int velocidad;

    // encender(), apagar(), ajustarVelocidad(int nuevaVelocidad) y
    //mostrarEstado().
    public void encender() throws Exception{
        if(estado){
            throw new Exception("Motor ya está encendido.");

        }else{
            estado = true;
        }
    }
    public void apagado() throws Exception{
        if(estado){
            estado = false;
        }else{
            throw new Exception("Motor ya está apagado.");

        }
    }
    public void ajustarVelocidad(int nuevaVelocidad) throws Exception{
        if(nuevaVelocidad>0 && nuevaVelocidad<=100){
            velocidad = nuevaVelocidad;
        }else
            throw new Exception("La velocidad debe estar entre 1 y 100.");

    }
    public void mostrarEstado() throws Exception{
        if(estado){
            throw new Exception("El motor está encendido.\nLa velocidad es: "+velocidad);
        }else {
            throw new Exception("El motor está apagado.");
        }
    }

}
