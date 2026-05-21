package ejerproducto.interfaz;

import javax.swing.*;
import java.util.Scanner;

public class MainES {
    public static void main(String[] args) {
        String nombre, apellido, ciudadResidencia;
        double sueldo;
        Scanner sc = new Scanner(System.in);

       // System.out.print("Ingrese el nombre: ");
        //nombre = sc.nextLine();
        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        //sueldo = sc.nextDouble();
        sueldo = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese su ciudad de residencia: ");
        ciudadResidencia = sc.nextLine();
       /* System.out.println("Su nombre es: "+nombre+" "+apellido);
        System.out.println("Sueldo actual: "+sueldo);
        System.out.println("Ciudad de residencia: "+ciudadResidencia);*/
        JOptionPane.showMessageDialog(null,"Su nombre es: "+nombre+" "+apellido+"\nSueldo actual: "
                +sueldo+"\nCiudad de residencia: "+ciudadResidencia);


    }
}
