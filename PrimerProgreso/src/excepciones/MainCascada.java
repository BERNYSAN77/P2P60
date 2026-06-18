package excepciones;

public class MainCascada {
    public static void main(String[] args) {
        try{
            a(100);
            System.out.println("Retiro exitoso");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Gracias por confiar en nuestro banco!");
    }
    public static void a(int num) throws Exception{
        b(num);
    }
    public static void b(int num) throws Exception{
        c(num);
    }
    public static void c(int num) throws Exception{
        if(num < 100){
            throw new Exception("El valor a retirar es menor a 100");
        }
    }
}
