package ejerproducto.interfaz;

import java.util.Scanner;

public class MainES {
    public static void main(String[] args) {
        String nombre, apellido, ciudadResidencia;
        double sueldo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        sueldo = sc.nextDouble();
        System.out.println("Ingrese su ciudad de residencia: ");
        ciudadResidencia = sc.nextLine();
        System.out.println("Su nombre es: "+nombre+" "+apellido);
        System.out.println("Sueldo actual: "+sueldo);
        System.out.println("Ciudad de residencia: "+ciudadResidencia);


    }
}
