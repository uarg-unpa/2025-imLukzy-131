package tp4.PilaBuscarEliminar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
    

        Scanner sc = new Scanner(System.in);
        PilaInt pila = new PilaInt();

        int opcion;

        do{

            System.out.println("\n===MENU DE PILA DE ENTEROS");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Buscar y eliminar elemento");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    if(pila.estaLlena()){
                        System.out.println("La pila esta llena.");
                    }else{
                        System.out.print("Ingrese elemento: ");
                        int elemento=sc.nextInt();
                        pila.meter(elemento);
                    }
                    break;
                case 2: 
                    if(pila.estaVacia()){
                        System.out.println("Error, la pila esta vacia");
                    }else{
                        int elemento=pila.sacar();
                        System.out.println("Elemento sacado: "+elemento);
                    }
                    break;
                case 3:
                    if(pila.estaVacia()){
                        System.out.println("No hay elementos en la pila");
                    }else{
                        System.out.print("Ingrese el elemento a sacar: ");
                        int elemento=sc.nextInt();
                        if(pila.buscarElemento(elemento)){
                            System.out.println("Elemento encontrado y eliminado: "+elemento);
                            System.out.println("Se movieron "+pila.cantidadDeMovidos()+" elementos");
                        }else{
                            System.out.println("Elemento no encontrado...");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        }while(opcion!=0);
        sc.close();

    }   
}
