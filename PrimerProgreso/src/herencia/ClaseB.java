package herencia;

public class ClaseB extends ClaseA{
    int b1;

    public ClaseB(int a1, int a2,int b1){
        super(a1,a2);
        System.out.println("Constructor ClaseB");
        this.b1 = b1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }
    @Override
    public void imprimir(){
        System.out.println("a1: "+getA1()+"\na2: "+a2);
    }

}
