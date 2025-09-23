package TP1;
import java.util.Scanner;

public class Punto6 {

public static void main (String [] args){

Scanner scanner = new Scanner (System.in);

int NUM1, NUM2, NUM3, PRODUCTO, SUMA, CONT, NUM=10;
int [] Numeros = new int [NUM];

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
CONT=0;
NUM=0;

while(CONT<=2){
    System.out.println("Ingrese Numero: ");
    Numeros[NUM]=scanner.nextInt();
    CONT++;
    PRODUCTO=PRODUCTO*Numeros[NUM];
    SUMA=SUMA+Numeros[NUM];
    NUM++;
}

System.out.println("Suma de enteros: "+SUMA);
System.out.println("Producto de enteros: "+PRODUCTO);

//FIN
scanner.close();
}    
}
