package tp1;

public class OperacionesCasting{
public static void main(String [] args){

    int A = 5, B = 3, R1;
    double C = 2.5, D = 2.0, R2;
    
    R1=A/B;
    R2=A/C; 
    System.out.println("Resultado (A / B)= "+R1);
    System.out.println("Resultado (A / C)= "+R2);

    R2=A*D;
    System.out.println("Resultado (A * D)= "+R2);

    R1=A*(int)D;
    System.out.println("Resultado (A * D)= "+R1);

    R1=(int)(C*D);
    System.out.println("Resultado (C * D)= "+R1);

    A++;
    System.out.println("Resultado A++= "+A);

    B=A++;
    System.out.println("Resultado B= "+B);

}
}