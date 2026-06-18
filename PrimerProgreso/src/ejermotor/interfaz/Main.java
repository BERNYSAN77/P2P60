package ejermotor.interfaz;


import ejermotor.negocio.Motor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Motor motorElectrico = new Motor();
        try{
            motorElectrico.mostrarEstado();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        try{
            motorElectrico.encender();
            motorElectrico.encender();
            motorElectrico.mostrarEstado();
            motorElectrico.ajustarVelocidad(50);
            motorElectrico.mostrarEstado();
            motorElectrico.ajustarVelocidad(150);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }


    }
}