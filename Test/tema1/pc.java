package Test.tema1;

public class pc {

    //Atributos

    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    //Constructor
    public pc(String marca, String procesador, double precio, int ram){
        this.marca=marca;
        this.procesador=procesador;
        this.precio=precio;
        this.ram=ram;
    }

    //Get y Set
    public String getMarca(){
        return this.marca;
    }
    public String getProcesador(){
        return this.procesador;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getRam(){
        return this.ram;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setProcesador(String procesador){
        this.procesador=procesador;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setRam(int ram){
        this.ram=ram;
    }

    //Metodos 1.actualizarRam(int nuevaRam) 2.aplicarDescuento(double porcentaje) 3.mostrarInformacion() 4.mayorRam(Pc p)

    public void actualizarRam(int nuevaRam){
        this.ram=this.ram+nuevaRam;
    }
    public void aplicarDescuento(double porcentaje){
        this.precio=this.precio-(this.precio*(porcentaje/this.precio));
    }
    public String mostrarInformacion(){
        return "PC Marca: "+this.marca+" | Procesador: "+this.procesador+" | RAM: "+this.ram+"GB | Precio: $"+this.precio+" |";
    }
    public boolean mayorRam(pc p){
        if(this.ram>p.getRam())
            return true;
        else
            return false;
    }

    
}
