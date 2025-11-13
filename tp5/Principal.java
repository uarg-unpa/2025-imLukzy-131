package tp5;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        
        int num;

        System.out.print("Factorial de: ");
        num=sc.nextInt();
        System.out.println("Es: "+f.fact(num));
        
        sc.close();
        
        
    }
    
}
