package Test.tema2;
import java.util.Scanner;

public class principal {

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        String nombre="vacio";
        char vender;
        double precio=0.0;
        int cantidad, stock=0;


        Producto producto1 = new Producto(nombre, precio, stock);
        Producto producto2 = new Producto(nombre, precio, stock);

        System.out.println("Ingrese el nombre del producto1: ");
        nombre=scanner.nextLine();
        producto1.setNombre(nombre);
        
        System.out.println("Ingrese el precio del producto1: ");
        precio=scanner.nextDouble();
        producto1.setPrecio(precio);

        System.out.println("Ingrese el stock del producto1: ");
        stock=scanner.nextInt();
        producto1.setStock(stock);

        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto2: ");
        nombre=scanner.nextLine();
        producto2.setNombre(nombre);
        
        System.out.println("Ingrese el precio del producto2: ");
        precio=scanner.nextDouble();
        producto2.setPrecio(precio);

        System.out.println("Ingrese el stock del producto2: ");
        stock=scanner.nextInt();
        producto2.setStock(stock);
        scanner.nextLine();

        System.out.println("Desea vender un producto? s: para confirmar");
        vender=scanner.nextLine().charAt(0);

        if(vender=='s' || vender=='S'){
            System.out.println("Cantidad a vender: ");
            cantidad=scanner.nextInt();
            producto1.venderProducto(cantidad);
        }else   
            System.out.println("No se vendio el producto.");
        
        producto2.aumentarStock(10);

        System.out.println(producto1.mostrarProducto());
        System.out.println(producto2.mostrarProducto());

        if(producto1.masStock(producto2))
            System.out.println("El producto: "+producto1.getNombre()+" tiene mas stock");
        else
            System.out.println("El producto: "+producto1.getNombre()+" no tiene mas stock");

        scanner.close();
    }
    
}
