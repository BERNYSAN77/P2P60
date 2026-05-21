package deitel13.interfaz;

import deitel13.negocio.Empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nombre, apellido;
        double salario;
        Empleado em1;
        Empleado em2;

        //leer variables
        em1 = new Empleado(nombre,apellido,salario);
        //copiar la lectura varibles
        em2 = new Empleado(nombre,apellido,salario);
        System.out.println("El salario del empleado em1 es "+em1.getSalario()*12);
        double nuevoSal = em1.getSalario()*1.1;
        em1.setSalario(nuevoSal);

        em2.setSalario(em2.getSalario()*1.1);
    }
}
