package herenciapersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        List<Persona> listado = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        String cedula = null, nombre = null, universidad = null, carrera = null,especialidad = null;
        int horas = 0, opc;
        double valorHora;
        do{
            menu();
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    //lectura
                    listado.add(new AlumnoPregrado(cedula,nombre,universidad,carrera));
                }break;
                case 4:{
                    for(Persona p: listado){
                        System.out.println(p);
                    }
                }

            }

        }while(opc != 9);


    }
    public static void menu(){
        System.out.println("1. Ingresar alumno pregrado");
        System.out.println("2. Ingresar alumno maestria");
        System.out.println("3. Ingresar profesor por horas");
        System.out.println("4. Mostrar todo");
        System.out.println("5. Mostrar alumno pregrado");
        System.out.println("6. Mostrar alumno maestria");
        System.out.println("7. Mostrar profesor por horas");
        System.out.println("8. Calcular nómina");
        System.out.println("9. Salir");

    }
}
