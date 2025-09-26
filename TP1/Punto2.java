package TP1;

public class Punto2 {
    
    public static void main(String [] args)
    {
        int A, B, X;
        double C, D, Y;

        A=5;
        B=3;
        C=7.5;
        D=2.0;
        
        X= A / B;
        System.out.println("1. X= "+X);
        X= (int)(A*D)/(int)(C/A);
        System.out.println("2. X= "+X);
        Y= A / B;
        System.out.println("3. Y= "+Y);
        Y=(double)(A / B);
        System.out.println("4. Y= "+Y);
        Y= (double)A * D / (int)C;
        System.out.println("5. Y= "+Y);
        Y= (double)(A*D) / (C * (int)D);
        System.out.println("6. Y= "+Y);
        Y= A * (int) D;
        System.out.println("7. Y= "+Y);
        Y= (int)(A*(int)D);
        System.out.println("8. Y= "+Y);
    }
}
