package excepciones;

import java.util.Scanner;

public class MainExcepciones {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        try{
            try{
                System.out.print("Ingrese el nombre: ");
                nombre = sc.nextLine();
                System.out.print("Ingrese la edad: ");
                edad = Integer.parseInt(sc.nextLine());
            }catch(ArithmeticException nfe){
                System.out.println("Error, se esperaba un número");
            }
        }catch(Exception e){
            System.out.println("Se produjo un error");
        }

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Gracias por usar nuestros servicios");
    }
}
