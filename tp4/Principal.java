package tp4;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres();
        int opcion;

        do{

            System.out.println("\n=== MENÚ DE COLA DE TAREAS (FIFO, First In - First Out) ===");
            System.out.println("1. Encolar caracter (agregar un caracter)");
            System.out.println("2. Desencolar caracter(sacar un caracter)");
            System.out.println("3. Ver caracter en frente (peek)");
            System.out.println("4. Mostrar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: //Encolar caracter
                    System.out.println("Ingrese un caracter: ");
                    char caracter = sc.nextLine().charAt(0);
                    if (cola.estaLlena()) {
                        System.out.println("Error: La cola está llena (maximo 10 tareas). No se puede encolar: "+caracter);
                    } else {
                        cola.encolar(caracter);
                        System.out.println("Tarea: "+caracter+" encolado con exito.");
                    }
                    
                    break;
                case 2: //Desencolar caracter
                    if (cola.estaVacia()){
                        System.out.println("Error, la cola esta vacia");
                    }else{
                        char elemento = cola.desencolar();
                        System.out.println("Caracter sacado: "+elemento);
                    }
                    break;
                case 3: //ver primer caracter (peek)
                    if(cola.estaVacia()){
                        System.out.println("No hay caracter en la cola");
                    }else
                        System.out.println("Frente: "+cola.mostrar());
                    break;
                case 4: //Mostrar estado de la cola
                    if (cola.estaVacia()){
                        System.out.println("Estado: La cola esta vacia.");
                        }else if(cola.estaLlena()){
                            System.out.println("Estado: La cola esta llena.");
                        }
                    System.out.println("Hay "+cola.cantidad()+" tarea(s)");                              
                        
                    break; 
                case 0:
                    System.out.println("Saliendo...");
                    break;                       
                    
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion != 0);
        sc.close();


        
    }
    
}
