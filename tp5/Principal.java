package tp5;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num, num2;

        //Factorial
        System.out.print("Factorial de: ");
        num=sc.nextInt();
        System.out.println("Es: "+Factorial.fact(num));

        //Puzzle tp1
        System.out.println("Puzzle de: ");
        System.out.print("Base: ");
        num=sc.nextInt();
        System.out.print("Limite: ");
        num2=sc.nextInt();

        System.out.println("Resultado 1: "+puzzle.rompecabezas(num, num2));

        System.out.println("2: "+puzzle.rompecabezas(14, 10));
        System.out.println("3: "+puzzle.rompecabezas(4, 7));
        System.out.println("4: "+puzzle.rompecabezas(0, 0));


        
        sc.close();
        
        
    }
    
}
