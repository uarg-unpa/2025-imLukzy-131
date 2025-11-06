package tp4.temas;

public class Cancion {
    //Atributos privados
    private String titulo;
    private String interprete;
    private String genero;
    private int anio;
    private int duracion;

    //Constructor
    public Cancion(String titulo, String interprete, String genero, int anio, int duracion){
        this.titulo=titulo;
        this.interprete=interprete;
        this.genero=genero;
        this.anio=anio;
        this.duracion=duracion;
    }

    //Set y Get
    public void setTitulo (String titulo){
        this.titulo=titulo;
    }
    public void setInterprete (String autor){
        this.interprete=autor;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getInterprete(){
        return this.interprete;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getAnio(){
        return this.anio;
    }
    public int getDuracion(){
        return this.duracion;
    }

    //Metodos
    public String toString(){
        return "| Titulo: "+this.getTitulo()+" | Autor: "+this.interprete+" | Genero: "+this.genero+" | Año: "+this.anio+" | Duracion: "+this.duracion+" segundos |";
    }
    
}
