<<<<<<<< HEAD:Test/tema2/Producto.java
package Test.tema2;
========
package TestClase.Tema2;
>>>>>>>> 725b1eb3c4f9fe9c763d5ecce703818e11c1b316:TestClase/Tema2/Producto.java

public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    //Get y Set
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    //Metodos 1.venderProducto(int Cantidad) 2.aumentarStock(int Cantidad) 3.mostrarProducto() 4. masStock(producto p)
    public void venderProducto(int cantidad){
        this.stock=this.stock-cantidad;
    }
    public void aumentarStock(int cantidad){
        this.stock=this.stock+cantidad;
    }
    public String mostrarProducto(){
        return "Nombre del producto: "+this.nombre+" | Precio: $"+this.precio+" | Cantidad: "+this.stock+" |";
    }
    public boolean masStock(Producto p){
        return this.stock>p.getStock();
    }

    
}
