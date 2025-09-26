package Clases;

public class Persona { //Modificador de acceso y nombre de la clase
//Que es una clase? Diferencia con objeto. Abstraccion y concreto

//Atributos de la clase, son caracteristicas
private String nombre;
private String apellido;
private int edad;
private int dni;
private Direccion direccion;

//Constructor es el objeto vacio, porque es importante? Para reservar memorias, para crear objetos consistentes, estados estables
public Persona(String nombre, String apellido, int edad, int dni, Direccion direccion)
{
    this.apellido=apellido;
    this.nombre=nombre;
    this.dni=dni;
    this.edad=edad;
    this.direccion=direccion;
    }

//Metodos set y gets para pedir y modificar datos
public String getNombre(){
    return this.nombre;
}
public String getApellido(){
    return this.apellido;
}
public int getEdad(){
    return this.edad;
}
public int getDni(){
    return this.dni;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setApellido(String apellido){
    this.apellido=apellido;
}
public void setEdad(int edad){
    this.edad=edad;
}
public void setDni(int dni){
    this.dni=dni;
}

//Funciones
public boolean mayorDeEdad(){
    return edad>=18;
}

public String mostrarInformacion(){
    return "Nombre: "+getNombre()+" "+getApellido()+" | "+"Edad: "+getEdad()+" |"+" DNI: "+getDni()+" |"+"Direccion: "+direccion.getCalle()+" "+direccion.getNumero()+" |";
}


}
