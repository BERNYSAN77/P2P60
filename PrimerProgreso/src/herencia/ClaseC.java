package herencia;

public class ClaseC extends ClaseB{
    private int c1;

    public ClaseC(int a1, int a2,int b1,int c1){
        super(a1,a2,b1);
        System.out.println("Constructor ClaseC");
        this.c1 = c1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("c1: "+c1);
    }
}
