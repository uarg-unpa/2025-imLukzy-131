package TP1;

import java.util.Scanner;

public class Punto4 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int numero1, numero2, numero3;

System.out.println("Ingrese 3 numeros enteros: ");

System.out.println("Ingrese el numero 1: ");
numero1 = scanner.nextInt();
scanner.nextLine();//Limpiar el buffer

System.out.println("Ingrese el numero 2: ");
numero2 = scanner.nextInt();
scanner.nextLine();

System.out.println("Ingrese el numero 3: ");
numero3 = scanner.nextInt();
scanner.nextLine();

if (numero1 > numero2 && numero1 > numero3)
    System.out.println("El mayor es numero1: "+numero1);
else    
    if (numero2 > numero1 && numero2 > numero3)
        System.out.println("El mayor es numero2: "+numero2);
    else
        System.out.println("El mayor es numero3: "+numero3);

scanner.close();
}
}