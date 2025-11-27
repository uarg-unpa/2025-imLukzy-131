package Clases.ClaseProducto;

public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidadStock;

    //Constructor
    public Producto (String nombre, double precio, int cantidadStock){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadStock=cantidadStock;
    }

    //Set y Get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setCantidadStock(int cantidadStock){
        this.cantidadStock=cantidadStock;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCantidadStock(){
        return this.cantidadStock;
    }

    //Metodos
    public boolean hayStock(int cantidad){
        return (this.cantidadStock>cantidad);
    }
    public void vender(int cantidad){
        this.cantidadStock=(this.cantidadStock-cantidad);
    }
    public void aumentarStock(int cantidad){
        this.cantidadStock=(this.cantidadStock+cantidad);
    }
    public boolean tieneMasStockQue(Producto otro){
        return (getCantidadStock()>otro.getCantidadStock());
    }
    
}
