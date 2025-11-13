package tp5;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num;

        System.out.print("Factorial de: ");
        num=sc.nextInt();
        System.out.println("Es: "+Factorial.fact(num));
        
        sc.close();
        
        
    }
    
}
