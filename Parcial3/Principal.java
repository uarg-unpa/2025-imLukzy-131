package Parcial3;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        int [] producto = {2, 2, 2, 2, 2};
        String cadena = "casa";

        System.out.println("Ingrese los numeros: ");


        //Producto pares
        System.out.println("Producto: "+ProductoPares.pares(producto, 0));

        //Invertir cadena
        System.out.println("Cadena: "+CadenaInversa.inversa(cadena));

        sc.close();

    }
    
}
