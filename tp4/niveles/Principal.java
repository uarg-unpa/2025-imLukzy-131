package tp4.niveles;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PilaNiveles pila1 = new PilaNiveles();

        int opcion;
        do{
            System.out.println("\n=== MENÚ PILA DE NIVELES ===");
            System.out.println("1. Agregar numero");
            System.out.println("2. Sacar numero");
            System.out.println("3. Mostrar tope (peek)");
            System.out.println("4. Mostrar estado (vacía, llena)");
            System.out.println("5. Contar ocurrencias");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.print("Ingrese un valor/nivel: ");
                    if(pila1.estaLlena()){
                        System.out.println("Error: La pila esta llena.");
                    }else{
                        int num=sc.nextInt();
                        pila1.meter(num);
                        System.out.println("Nivel: "+num+" agregado.");
                    }
                break;

                case 2:
                    if(pila1.estaVacia()){
                        System.out.println("La pila esta vacia.");
                    }else{
                        int num=pila1.sacar();
                        System.out.println("Elemento sacado: "+num);
                    }
                break;

                case 3:
                    if(pila1.estaVacia()){
                        System.out.println("La pila esta vacia.");
                    }else{
                        int num=pila1.ultimoElemento();
                        System.out.println("Tope: "+num);
                    }
                break;

                case 4:
                    if(pila1.estaVacia()){
                        System.out.println("La pila esta vacia.");
                    }
                    if(pila1.estaLlena()){
                        System.out.println("La pila esta llena.");
                    }
                break;

                case 5:
                    if(pila1.estaVacia()){
                        System.out.println("Error, la pila esta vacia.");
                    }else{
                        System.out.print("Ingrese un nivel, para contar ocurrencias: ");
                        int num=sc.nextInt();
                        System.out.print("Ocurrencias de: "+num+". Son: "+pila1.contarOcurrencias(num));
                    }
                break;
                
                case 0:
                    System.out.println("Saliendo del menu...");
                    break;
            
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        }while(opcion!=0);
     
        sc.close();
    }
}
