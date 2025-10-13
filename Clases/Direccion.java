package Clases;

public class Direccion {

    //Atributos
    private String calle;
    private int numero;

    //Constructor
    public Direccion (String calle, int numero){
        this.calle=calle;
        this.numero=numero;
    }

    //Set y Get
    public String getCalle(){
        return this.calle;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCalle(String calle){
        this.calle=calle;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    //Metodos
    
}
