package excepciones;

import java.util.Scanner;

public class MainTrow {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int adivina;

        System.out.print("Ingrese un número entre 1 y 10: ");
        adivina = Integer.parseInt(sc.nextLine());

        if(adivina == 7){
            throw new ArithmeticException("Ingresó el número prohibido");
        }
        System.out.println("Vuelva pronto!");
    }
}
