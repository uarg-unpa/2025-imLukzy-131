package tp5;

public class SumarPares {

    public static int pares(int limite){
        if(limite<=1)
            return 0;
        
        if (limite % 2 == 0)
            return limite + pares(limite-1);
        else
            return pares(limite-1);
    }
    
}
