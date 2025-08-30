package Clases;

public class testPersona {

public static void main (String [] args)
{

boolean esMayor;

Persona persona1, persona2;

persona1= new Persona ("Franco", "Herrera", 23, 1234);
persona2= new Persona ("Felipe", "Moledo", 13, 4321);

esMayor=persona1.mayorDeEdad();

if(esMayor==true)
    System.out.println(persona1.getNombre()+" Es mayor");
else  
    System.out.println(persona1.getNombre()+" No es mayor");

esMayor=persona2.mayorDeEdad();
if(esMayor==true)
    System.out.println(persona2.getNombre()+" Es mayor");
else  
    System.out.println(persona2.getNombre()+" No es mayor");

}
    
}