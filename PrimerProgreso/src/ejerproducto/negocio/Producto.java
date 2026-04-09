package ejerproducto.negocio;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(){
        /*
        puedo dejar vacio y Java pone los valores por defecto
        puede colocar de forma explícita los valores por defecto de Java
        puede tener valores específicos que se consideren como defecto
         */
    }
    public Producto(String nombre,double precio,int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /*
    métodos get (sacar la información de los atributos
    siempre retornar un valor -> generalmente es del mismo tipo del atributo
    no recibe parámetros
     */
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    /*
    métodos set (modificar el valor del atributo)
    generalmente son void
    siempre recibe parámetro -> generalmente es del mismo tipo atributo
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio<0)
            precio=0;
        this.precio = precio;
    }

    /*modificar de void a que retorna un boolean para indicar si fue
    o no posible el cambio
     */
    public boolean setStock(int stock){
        if (stock>0){
            this.stock = stock;
            return true;
        }
        return false;

    }
    //sobreescribir
@Override
    public String toString(){
    return "Nombre: "+nombre+"\nPrecio: $"+precio+"\nStock: "+stock;


}

}
