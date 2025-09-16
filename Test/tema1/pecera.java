package Test.tema1;
import java.util.Scanner;

public class pecera {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String marca, procesador;
        double precio;
        int ram;

        //Datos
        System.out.println("Ingrese la marca de la pc: ");
        marca=scanner.nextLine();
        System.out.println("Ingrese el procesador: ");
        procesador=scanner.nextLine();
        System.out.println("Ingrese el precio: $");
        precio=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la ram: ");
        ram=scanner.nextInt();
        scanner.nextLine();

        //Constructor
        pc pc1 = new pc(marca, procesador, precio, ram);
        pc pc2 = new pc(marca, procesador, precio, ram);

        //Subir ram de pc2
        pc1.actualizarRam(8);

        //Descuento de la pc1
        pc1.aplicarDescuento(10);

        //Mostrar info de ambas pc
        System.out.println(pc1.mostrarInformacion());
        System.out.println(pc2.mostrarInformacion());

        if (pc1.mayorRam(pc2)==true)
            System.out.println("PC1 tiene mas ram");
        else    
            System.out.println("PC1 no tiene mas ram");
  
    }
    
}
