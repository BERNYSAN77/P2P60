package ejerproducto.interfaz;

import ejerproducto.negocio.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("cartulinas",0.15,100);
        Producto p2 = new Producto();
        System.out.println("Datos del objeto p1");
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Precio: "+p1.getPrecio());
        System.out.println("Stock: "+p1.getStock());

        System.out.println("\nDatos del objeto p2");
        System.out.println("Nombre: "+p2.getNombre());
        System.out.println("Precio: "+p2.getPrecio());
        System.out.println("Stock: "+p2.getStock());

        p2.setNombre("cartuchera");
        p2.setPrecio(5.80);
        p2.setStock(25);

        System.out.println("\nDatos del objeto p2");
        System.out.println("Nombre: "+p2.getNombre());
        System.out.println("Precio: "+p2.getPrecio());
        System.out.println("Stock: "+p2.getStock());

        System.out.println();
        System.out.println(p1);
    }
}
