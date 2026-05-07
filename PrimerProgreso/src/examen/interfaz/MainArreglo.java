package examen.interfaz;

import examen.negocio.ModeloRiesgo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MainArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //ModeloRiesgo mr = null;
        String nombre;
        double entrada;
        final int MAX=20;
        double confianza;
        int opc;
        ModeloRiesgo riesgos[]=new ModeloRiesgo[MAX];
        int indice = 0;
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    if(indice < MAX){
                        System.out.print("Ingrese el nombre del modelo: ");
                        nombre = sc.nextLine();
                        System.out.print("Ingrese el factor de confianza");
                        confianza = Double.parseDouble(sc.nextLine());
                        riesgos[indice ++ ]  = new ModeloRiesgo(nombre,confianza);
                    }else{
                        System.out.println("Ya no hay memoria...");
                    }

                }break;
                case 2:{
                    if(indice < MAX){
                        System.out.print("Ingrese el nombre del modelo al que desea modificar el factor de confianza: ");
                        nombre = sc.nextLine();
                        boolean encontro = false;
                        for(int i= 0; i < indice;i++){
                            if(riesgos[i].getNombreModelo().equals(nombre)){
                                System.out.println("Ingrese el nuevo factor de confianza");
                                confianza = Double.parseDouble(sc.nextLine());
                                riesgos[i].setFactorConfianza(confianza);
                                encontro = true;
                                break;
                            }
                        }
                        if(!encontro)
                            System.out.println("No existe el modelo");


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
                    if(indice >= 1){
                        for(int i = 0 ; i < indice; i++)
                            System.out.println(riesgos[i]);
                    } else
                        System.out.println("No hay informacion al mostrar");
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


