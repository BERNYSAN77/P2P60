package examen.interfaz;

import examen.negocio.ModeloRiesgo;

import java.util.Scanner;

public class MainModelo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ModeloRiesgo mr = null;
        String nombre;
        double entrada;
        double confianza;
        int opc;
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    System.out.print("Ingrese el nombre del modelo: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese el factor de confianza");
                    confianza = Double.parseDouble(sc.nextLine());
                    mr = new ModeloRiesgo(nombre,confianza);

                }break;
                case 2:{
                    if(mr != null){
                        System.out.println("Ingrese el nuevo factor de confianza");
                        confianza = Double.parseDouble(sc.nextLine());
                        mr.setFactorConfianza(confianza);
                    } else
                        System.out.println("no existen modelos creados");
                }break;
                case 3:{
                    if(mr != null){
                        System.out.println("Ingrese el valor de entrada al modelo");
                        entrada = Double.parseDouble(sc.nextLine());
                        System.out.println(mr.evaluar(entrada));
                    }else
                        System.out.println("no existen modelos creados");

                }break;
                case 4:{
                    if(mr != null)
                        System.out.println(mr);
                    else
                        System.out.println("no existen modelos creados");
                }break;
                case 5:{
                    System.out.println("Gracias por usar nuestros modelos =)");
                }break;
                default:
                    System.out.println("No es una opción válida");
            }

        }while(opc != 5);

    }
    public static void menu(){
        System.out.println("**********Menú*********");
        System.out.println("1. Crear Modelo");
        System.out.println("2. Modificar factor de confianza");
        System.out.println("3. Evaluar");
        System.out.println("4. Mostrar datos");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");

    }
}
