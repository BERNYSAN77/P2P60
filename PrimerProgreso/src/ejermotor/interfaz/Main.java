package ejermotor.interfaz;


import ejermotor.negocio.Motor;

public class Main {
    public static void main(String[] args) {
        Motor motorElectrico = new Motor();
        motorElectrico.mostrarEstado();
        motorElectrico.encender();
        motorElectrico.encender();
        motorElectrico.mostrarEstado();
        motorElectrico.ajustarVelocidad(50);
        motorElectrico.mostrarEstado();
        motorElectrico.ajustarVelocidad(150);

    }
}