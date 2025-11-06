package tp4.ColaPromedio;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColaInt cola = new ColaInt();

        cola.encolar(10);
        cola.encolar(8);
        cola.encolar(9);
        cola.encolar(7);
        cola.encolar(10);

        System.out.println("Promedio: "+cola.calcularPromedio());
    }
    
}
