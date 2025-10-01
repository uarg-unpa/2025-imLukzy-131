package Colas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        ColaInt cola = new ColaInt();
        int opcion;
        
        do {
            System.out.println("=== MENÚ DE COLA ===");
            System.out.println("1. Poner en la cola");
            System.out.println("2. Sacar de la cola");
            System.out.println("3. Primer elemento");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (cola.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        cola.encolar(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (cola.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = cola.desencolar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                case 3: //Mostrar ultimo elemento
                    if (cola.estaVacia()){
                        System.out.println("No hay ultimo elemento.");
                    }else{
                        System.out.println("Ultimo elemento: "+cola.mostrar());
                    }
                    break;

                case 4: // Verificar estado
                    System.out.println("¿Vacía? " + cola.estaVacia() + " | ¿Llena? " + cola.estaLlena());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);


        sc.close();
    
}
}
