package tp5;

public class Potencia {

    public static int elevado(int base, int exponente){
        if(exponente==0)
            return 1;
        else
            return base*elevado(base, exponente-1);
    }
    
}
