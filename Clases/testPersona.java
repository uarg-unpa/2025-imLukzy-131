package Clases;

public class testPersona {

public static void main (String [] args){

Persona persona1, persona2;
Direccion D1, D2;

D1 = new Direccion ("Don Bosco", 364);
D2 = new Direccion ("Hernan Cortez", 2525);

persona1= new Persona ("Franco", "Herrera", 31, 1234, D1);
persona2= new Persona ("Felipe", "Moledo", 13, 4321, D2);

if(persona1.mayorDeEdad())
    System.out.println(persona1.getNombre()+" Es mayor");
else  
    System.out.println(persona1.getNombre()+" No es mayor");

if(persona2.mayorDeEdad())
    System.out.println(persona2.getNombre()+" Es mayor");
else  
    System.out.println(persona2.getNombre()+" No es mayor");

System.out.println("Datos: "+persona1.mostrarInformacion());
System.out.println("Datos: "+persona2.mostrarInformacion());

//FIN
    }
}