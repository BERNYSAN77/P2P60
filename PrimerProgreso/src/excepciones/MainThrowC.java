package excepciones;

import java.util.Scanner;

public class MainThrowC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adivina;

        System.out.print("Ingrese un número entre 1 y 10: ");
        adivina = Integer.parseInt(sc.nextLine());

        try{
            if(adivina == 7){
                throw new ArithmeticException("Ingresó el número prohibido");
            }
        } catch (ArithmeticException ae) {
           //ae.printStackTrace();
            System.out.println(ae.getMessage());
        }

        System.out.println("Vuelva pronto!");
    }
}
