package interfaz;


import negocio.Carro;

public class Main {
    public static void main(String[] args) {
        Carro c1; //referencia a un objeto de tipo Carro
        c1 = new Carro(); //crea un objeto de tipo Carro y asigna su referencia a c1

        Carro c2 = new Carro();
        Carro c3 = new Carro();



        c1.potencia = 2;
        c1.velocidad = 100;

        c2.potencia = 2;
        c2.velocidad = 100;

        c3.potencia = 2.5;
        c3.velocidad = 60;

        System.out.println("La velocidad de c1 es: "+c1.velocidad);
        System.out.println("La potencia de c1 es: "+c1.potencia);

        System.out.println("\nLa velocidad de c2 es: "+c2.velocidad);
        System.out.println("La potencia de c2 es: "+c2.potencia);

        System.out.println("\nLa velocidad de c3 es: "+c3.velocidad);
        System.out.println("La potencia de c3 es: "+c3.potencia);

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c3.acelerar();

        System.out.println();
        System.out.println("La velocidad de c1 es: "+c1.velocidad);
        System.out.println("La potencia de c1 es: "+c1.potencia);

        System.out.println("\nLa velocidad de c2 es: "+c2.velocidad);
        System.out.println("La potencia de c2 es: "+c2.potencia);

        System.out.println("\nLa velocidad de c3 es: "+c3.velocidad);
        System.out.println("La potencia de c3 es: "+c3.potencia);



    }
}