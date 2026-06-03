package examen.interfaz;

import examen.negocio.ModeloRiesgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainLista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        double entrada;
        double confianza;
        int opc;
        List<ModeloRiesgo> riesgos = new ArrayList<ModeloRiesgo>();
        int indice = 0;
        do{
            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{System.out.print("Ingrese el nombre del modelo: ");
                        nombre = sc.nextLine();
                        System.out.print("Ingrese el factor de confianza");
                        confianza = Double.parseDouble(sc.nextLine());
                        riesgos.add(new ModeloRiesgo(nombre,confianza));
                    }break;
                case 2:{
                    if(!riesgos.isEmpty() ){
                        System.out.print("Ingrese el nombre del modelo al que desea modificar el factor de confianza: ");
                        nombre = sc.nextLine();
                        boolean encontro = false;
                        for(int i= 0; i < riesgos.size();i++){
                            if(riesgos.get(i).getNombreModelo().equals(nombre)){
                                System.out.println("Ingrese el nuevo factor de confianza");
                                confianza = Double.parseDouble(sc.nextLine());
                                riesgos.get(i).setFactorConfianza(confianza);
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
                    if(!riesgos.isEmpty() ){
                        System.out.print("Ingrese el nombre del modelo al que desea modificar el factor de confianza: ");
                        nombre = sc.nextLine();
                        boolean encontro = false;
                        for(ModeloRiesgo mr: riesgos)
                            if(mr.getNombreModelo().equals(nombre)){
                                System.out.println("Ingrese el valor de entrada al modelo");
                                entrada = Double.parseDouble(sc.nextLine());
                                System.out.println(mr.evaluar(entrada));
                                encontro = true;
                                break;
                            }

                        if(!encontro)
                            System.out.println("No existe el modelo");
                    } else
                        System.out.println("no existen modelos creados");
                }break;
                case 4:{
                    if(!riesgos.isEmpty() ){
                        Iterator <ModeloRiesgo> it = riesgos.iterator();
                        System.out.print("Ingrese el nombre del modelo: ");
                        nombre = sc.nextLine();
                        boolean encontro = false;
                        while (it.hasNext() && !encontro) {
                            ModeloRiesgo mr = it.next();
                            if(mr.getNombreModelo().equalsIgnoreCase(nombre)){
                                System.out.println("Ingrese el valor de entrada al modelo");
                                entrada = Double.parseDouble(sc.nextLine());
                                System.out.println("Modelo: "+mr.getNombreModelo());
                                System.out.println("Factor de confianza: "+mr.getFactorConfianza());
                                System.out.println("Evaluación: " + mr.evaluar(entrada));
                                encontro = true;
                            }else
                                System.out.println("No se encontró el modelo");
                            }
                    } else
                        System.out.println("No hay informacion al mostrar");
                }break;
                case 5:{
                    if(!riesgos.isEmpty() ){
                        Iterator <ModeloRiesgo> it = riesgos.iterator();
                        while (it.hasNext()){
                            System.out.println(it.next());
                        }
                    } else
                        System.out.println("No hay informacion al mostrar");
                }break;

                case 6:{
                    System.out.println("Gracias por usar nuestros modelos =)");
                }break;
                default:
                    System.out.println("No es una opción válida");
            }

        }while(opc != 6);

    }

    public static void menu(){
        System.out.println("**********Menú*********");
        System.out.println("1. Crear Modelo");
        System.out.println("2. Modificar factor de confianza");
        System.out.println("3. Evaluar");
        System.out.println("4. Simulación");
        System.out.println("5. Mostrar todos los modelos");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opción: ");


    }
}




