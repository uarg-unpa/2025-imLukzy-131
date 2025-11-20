package tp2;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String nombre, apellido;
        int legajo, dni, cantidadMaterias;

        Alumno alumno1 = new Alumno("Lucas", "Fernandez", 2020, 41865184, 4);

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

        Alumno alumno2 = new Alumno(nombre, apellido, legajo, dni, cantidadMaterias);

        System.out.println(alumno2.getAlumno());
        scanner.close();
        
        scanner.close();
    }
    
}
