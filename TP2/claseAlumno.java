package TP2;

public class claseAlumno {

    //Atributos
    private String nombre;
    private String apellido;
    private int legajo;
    private int dni;
    private int cantidadMaterias;
    

    //Constructor
    public claseAlumno(String nombre, String apellido, int legajo, int dni, int cantidadMaterias){
        this.nombre=nombre;
        this.apellido=apellido;
        this.legajo=legajo;
        this.dni=dni;
        this.cantidadMaterias=cantidadMaterias;
    }
    //Crear los sets y gets
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public int getDni(){
        return this.dni;
    }
    public int getCantidadMaterias(){
        return this.cantidadMaterias;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setLegajo(int legajo){
        this.legajo=legajo;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setCantidadMaterias(int cantidadMaterias){
        this.cantidadMaterias=cantidadMaterias;
    }
    
    //Metodos

    public String getAlumno(){
        return "Alumno: "+this.nombre+" "+this.apellido+" | Legajo: "+this.legajo+" | DNI: "+this.dni+" | Materias: "+this.cantidadMaterias;
    }

    //FIN
}
