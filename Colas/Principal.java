package Colas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        ColaInt cola = new ColaInt();
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ DE COLA DE TAREAS (Frente Fijo) ===");
            System.out.println("1. Encolar tarea (agregar un número)");
            System.out.println("2. Desencolar tarea(sacar un número)");
            System.out.println("3. Ver tarea en frente (peek)");
            System.out.println("4. Mostrar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    System.out.println("Ingrese el número de la tarea: ");
                    int tarea = sc.nextInt();
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (maximo 10 tareas). No se puede encolar: "+tarea);
                    } else {
                        cola.encolar(tarea);
                        System.out.println("Tarea: "+tarea+" encolado con exito.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (cola.estaVacia()) {
                        System.out.println("Error: La cola esta vacia.");
                    } else {
                        int elemento = cola.desencolar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                case 3: //Mostrar ultimo elemento
                    if (cola.estaVacia()){
                        System.out.println("Error. La cola esta vacia. No hay tarea en el frente");
                    }else{
                        System.out.println("Tarea en frente: "+cola.mostrar());
                    }
                    break;

                case 4: // Verificar estado
                    if (cola.estaVacia()){
                        System.out.println("Estado: La cola esta vacia.");
                        }else if(cola.estaLlena()){
                            System.out.println("Estado: La cola esta llena.");
                        }   else{
                                System.out.println("Hay "+cola.cantidad()+" tarea(s)");
                                
                        }
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
