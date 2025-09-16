package Parcial;
import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        double base, altura;
        //Carga de datos de R1
        System.out.println("Ingrese la altura de R1: ");
        altura=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la base de R1");
        base=scanner.nextDouble();
        scanner.nextLine();
        //Rectangulo R1
        Rectangulo R1 = new Rectangulo(base, altura);

        //Carga de datos de R2
        System.out.println("Ingrese la altura de R2");
        altura=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la base de R2");
        base=scanner.nextDouble();
        scanner.nextLine();
        //Rectangulo R2
        Rectangulo R2 = new Rectangulo(base, altura);

        System.out.println("El area de R1 es: "+R1.calcularArea());
        System.out.println("El perimetro de R2 es: "+R2.calcularPerimetro());

        if(R1.esMayorElArea(R2)){
            System.out.println("El rectangulo con mayor area es el R1");
        }else
            System.out.println("El rectangulo con mayor area es el R2");
    }
    
}
