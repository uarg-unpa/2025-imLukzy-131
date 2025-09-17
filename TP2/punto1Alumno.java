package TP2;
import java.util.Scanner;

public class punto1Alumno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String nombre, apellido;
        int legajo, dni, cantidadMaterias;

        claseAlumno alumno1 = new claseAlumno("Lucas", "Fernandez", 2020, 41865184, 4);

        System.out.println(alumno1.getAlumno());

        System.out.println("Ingrese el nombre del alumno: ");
        nombre=scanner.nextLine();
        System.out.println("Ingrese el apellido de alumno: ");
        apellido=scanner.nextLine();
        System.out.println("Ingrese el legajo: ");
        legajo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el dni: ");
        dni=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la cantidad de materias: ");
        cantidadMaterias=scanner.nextInt();
        scanner.nextLine();

        claseAlumno alumno2 = new claseAlumno(nombre, apellido, legajo, dni, cantidadMaterias);

        System.out.println(alumno2.getAlumno());
        scanner.close();
        
    }
    
}
