package examen.interfaz;

import examen.negocio.ModeloRiesgo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PruebaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double confianza;
        List<ModeloRiesgo> modelos = new ArrayList<ModeloRiesgo>();
        System.out.print("Ingrese el nombre del modelo: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el factor de confianza");
        confianza = Double.parseDouble(sc.nextLine());
        modelos.add(new ModeloRiesgo(nombre,confianza));
        //for normal
        for(int i = 0; i < modelos.size(); i++){
            System.out.println(modelos.get(i));
        }
        //for coleccion
        for(ModeloRiesgo mr : modelos){
            System.out.println("Ingrese el valor de entrada al modelo");
            double entrada = Double.parseDouble(sc.nextLine());
            System.out.println(mr.evaluar(entrada));
        }
                //iterator
        Iterator<ModeloRiesgo> it = modelos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
