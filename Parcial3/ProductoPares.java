package Parcial3;

public class ProductoPares {

    public static int pares(int [] vector, int indice){
        
        if(vector.length==indice)
            return 1;
        if(vector[indice]%2==0)
            return vector[indice]*pares(vector, indice+1);
        else
            return pares(vector, indice+1);
    }
    
}
