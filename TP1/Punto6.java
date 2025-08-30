package TP1;
import java.util.Scanner;

public class Punto6 {

public static void main (String [] args){

Scanner scanner = new Scanner (System.in);

int NUM1, NUM2, NUM3, PRODUCTO, SUMA, NUM;

System.out.println("Ingrese el Numero 1:");
NUM1= scanner.nextInt();
scanner.nextLine();

System.out.println("Ingrese el Numero 2: ");
NUM2= scanner.nextInt();
scanner.nextLine();

System.out.println("Ingrese el Numero 3: ");
NUM3= scanner.nextInt();
scanner.nextLine();

PRODUCTO=NUM1*NUM2*NUM3;
SUMA=NUM1+NUM2+NUM3;

System.out.println("Suma de enteros: "+SUMA);
System.out.println("Producto de enteros: "+PRODUCTO);

PRODUCTO=1;
SUMA=0;
CONT=1;

while(CONT<=3){

    System.out.println()
    NUM=scanner.nextInt();

}

//FIN
}    
}
