package herencia;

public class MainHerencia {
    public static void main(String[] args) {

        ClaseC cc = new ClaseC(1,2,3,4);
        cc.imprimir();
        cc.a2 = -100;
        System.out.println("a2: "+cc.getA2());
    }
}
