package Test.tema3;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double base, altura;


        
        Rectangulo R1 = new Rectangulo(10, 20);
        Rectangulo R2 = new Rectangulo(15, 30);

        System.out.println(R1.calcularArea());
        System.out.println(R2.calcularPerimetro());

        if(R1.esMayorElArea(R2)){
            System.out.println("El rectangulo con mayor area es R1");
        }else
            System.out.println("El rectangulo con mayor area es R2");

        System.out.println(R1.mostrarInformacion());
        System.out.println(R2.mostrarInformacion());
    }
    
}
