package Test.tema3;

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
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    //Metodos
    public double calcularArea(){
        return this.altura*this.base;
    }
    public double calcularPerimetro(){
        return 2*(this.altura+this.base);
    }
    public boolean esMayorElArea(Rectangulo R){
        return calcularArea()>R.calcularArea();
    }
    public String mostrarInformacion(){
        return "Altura: "+this.altura+" | Base: "+this.base+" | Area: "+calcularArea()+" | Perimetro: "+calcularPerimetro()+" |";
    }
    
}
