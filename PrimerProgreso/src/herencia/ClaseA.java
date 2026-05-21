package herencia;

public class ClaseA {
    private int a1;
    protected int a2;

    public ClaseA(int a1, int a2){
        System.out.println("Constructor ClaseA");
        setA1(a1);
        setA2(a2);

    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        if(a1 > 0)
            this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        if(a2 > 0)
            this.a2 = a2;
    }

    public void imprimir(){
        System.out.println("a1: "+a1+"\na2: "+a2);
    }
}
