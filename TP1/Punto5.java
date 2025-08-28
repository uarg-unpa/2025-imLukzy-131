package TP1;
import java.util.Scanner;

public class Punto5 {

public static void main (String [] args)
{
    Scanner scanner = new Scanner(System.in);
    char dia;

    System.out.println("Ingrese un dia de la semana: (L, M, I, J, V, S, D)");

    dia = scanner.next().toLowerCase().charAt(0);

    switch (dia)
    {

        case 'm'://Martes
        case 'i'://Miercoles
        case 'j'://Jueves
            System.out.println("Hoy tengo resolucion");
            break;
        case 'l': //Lunes
        case 'v'://Viernes
        case 's'://Sabado
        case 'd'://Domingo
            System.out.println("No tengo resolucion");
            break;
        default:
            System.out.println("La letra ingresada no es valida");

    }
    scanner.close();

}
    
}
