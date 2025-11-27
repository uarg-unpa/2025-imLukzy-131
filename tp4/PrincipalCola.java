package tp4;

import java.util.Scanner;

public class PrincipalCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaInt cola = new ColaInt();
        int opcion;
        //Menu de selecion de opciones
        do {
            System.out.println("\n=== MENÚ COLA DE ENTEROS ===");
            System.out.println("1. Encolar elemento");
            System.out.println("2. Desencolar elemento");
            System.out.println("3. Eliminar repetidos");
            System.out.println("4. Mostrar frente (peek)");
            System.out.println("5. Mostrar estado (vacía, llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un entero: ");
                    int entero = sc.nextInt();
                    if (!cola.estaLlena()) {
                        cola.encolar(entero);
                        System.out.println("Elemento "+entero+" encolado con exito.");
                    } else {
                        System.out.println("Error: La cola esta llena.");
                    }
                    break;

                case 2:
                    if (!cola.estaVacia()) {
                        int desencolado = cola.desencolar();
                        System.out.println("Elemento desencolado: " + desencolado);
                    } else {
                        System.out.println("Error: La cola está vacia. No se puede desencolar.");
                    }
                    break;

                case 3:
                    cola.eliminarRepetidos();
                    System.out.println("Repetidos eliminados. La cola ahora contiene solo elementos únicos.");
                    break;

                case 4:
                    if (!cola.estaVacia()) {
                        int frente = cola.peek();
                        System.out.println("Frente de la cola: " + frente);
                    } else {
                        System.out.println("Error: La cola está vacía. No hay frente.");
                    }
                    break;

                case 5:
                    if (cola.estaVacia()) {
                        System.out.println("Estado: La cola está vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: La cola está llena.");
                    } 
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }   
}
