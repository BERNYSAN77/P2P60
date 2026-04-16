package ejerproducto.interfaz;

import ejerproducto.negocio.Producto;

import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        String nombre = null;
        double precio=0;
        int stock= 0, opc;
        Producto pr1;
        Scanner sc = new Scanner(System.in);

        //leer las variables auxiliares
        pr1 = new Producto(nombre,precio,stock);
        do{
            System.out.println("1. Comprar");
            System.out.println("2. Vender");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese un opción: ");
            opc =Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:{
                    int cantidad;
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = Integer.parseInt(sc.nextLine());
                    pr1.abastecer(cantidad);
                    System.out.print("El nuevo stock es: "+ pr1.getStock());
                }break;
                case 2:{
                    int cantidad;
                    System.out.print("Ingrese la cantidad del producto");
                    cantidad=Integer.parseInt(sc.nextLine());
                    double preciot=pr1.vender(cantidad);
                    if (preciot>0){
                        System.out.println("El valor a pagar es: "+preciot);

                    }else System.out.println("No se pudo realizar la venta");


                }break;
                case 3:{
                    System.out.println("****DATOS DEL PRODUCTO****\n"+pr1);
                }break;
                case 4:{
                    System.out.println("Gracias por usar nuestros servicios");
                }break;
                default:
                    System.out.println("Opción no valida");
            }

        }while(opc != 4);

    }
}
