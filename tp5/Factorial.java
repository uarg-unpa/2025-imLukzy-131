package tp5;
public class Factorial {

    public Factorial(){

    }

    public static int fact (int n){
        if (n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    
}
