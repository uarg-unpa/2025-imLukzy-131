package Parcial;
public class Rectangulo {
    //Atributos

    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    //Get y Set
    public double getAltura(){
        return this.altura;
    }
    public double getBase(){
        return this.base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void setBase(double base){
        this.base=base;
    }

    //Metodos
    public double calcularArea(){
        return this.base*this.altura;
    }
    public double calcularPerimetro(){
        return ((2*this.base)+(2*this.altura));
    }
    public boolean esMayorElArea(Rectangulo R){
        return calcularArea()>R.calcularArea();
    }
    
}
