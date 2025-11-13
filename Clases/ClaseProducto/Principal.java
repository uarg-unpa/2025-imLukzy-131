package Clases.ClaseProducto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        double precio;
        int cantidad, cant;
        int opcion;

        //Datos de P1
        System.out.print("Ingrese el nombre de P1: ");
        nombre=sc.nextLine();
        System.out.print("Ingrese el precio de P1: ");
        precio=sc.nextDouble();
        System.out.print("Ingrese el stock de P1: ");
        cantidad=sc.nextInt();

        //Inicializando el contructor P1
        Producto p1 = new Producto(nombre, precio, cantidad);

        //Datos de P2
        sc.nextLine();
        System.out.print("Ingrese el nombre de P2: ");
        nombre=sc.nextLine();
        System.out.print("Ingrese el precio de P2: ");
        precio=sc.nextDouble();
        System.out.print("Ingrese el stock de P2: ");
        cantidad=sc.nextInt();

        //Incializando el constructor P2
        Producto p2 = new Producto(nombre, precio, cantidad);

        do{
            System.out.println("======MENU DE PRODUCTOS======");
            System.out.println("1. Vender producto p1");
            System.out.println("2. Vender producto p2");
            System.out.println("3. Aumentar el Stock del producto p2 en 10 unidades");
            System.out.println("4. Mostrar cual tiene mas stock");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion=sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la cantidad a vender: ");
                    cant=sc.nextInt();
                    if (p1.hayStock(cant)){
                        System.out.println("Se vendieron "+cant+" unidades del prducto P1");
                        p1.vender(cant);
                        break;
                    }else {
                        System.out.println("No se pudo vender, por falta de stock");
                        break;
                        }

                case 2:
                    System.out.print("Ingrese la cantidad a vender: ");
                    cant=sc.nextInt();
                    if (p2.hayStock(cant)){
                        System.out.println("Se vendieron "+cant+" unidades del prducto P1");
                        p2.vender(cant);
                    }else 
                        System.out.println("No se pudo vender, por falta de stock");
                    break;

                case 3: 
                    System.out.println("Stock del producto p2 aumentado en 10 unidades");
                    p2.aumentarStock(10);
                    System.out.println(p2.getNombre()+" ahora hay "+p2.getCantidadStock()+" unidades");
                    break;

                case 4:
                    if (p1.tieneMasStockQue(p2)){
                        System.out.println(p1.getNombre()+" tiene mas stock que "+p2.getNombre());
                        System.out.println(p1.getNombre()+": "+p1.getCantidadStock());
                        System.out.println(p2.getNombre()+": "+p2.getCantidadStock());
                    }else{ 
                        System.out.println(p2.getNombre()+" tiene mas stock que "+p1.getNombre());
                        System.out.println(p1.getNombre()+": "+p1.getCantidadStock());
                        System.out.println(p2.getNombre()+": "+p2.getCantidadStock());
                        }
                    break;

                case 0:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                    System.out.println("Opcion invalida, intente otra vez");
            }
        }while (opcion!=0);

        sc.close();
    }
    
}