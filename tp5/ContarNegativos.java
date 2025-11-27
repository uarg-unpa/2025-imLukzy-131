package tp5;

public class ContarNegativos {

    public static int negativos(int [] vector, int indice){
        if(indice==vector.length)
            return 0;
        
    
        if(vector[indice]<0)
            return 1+negativos(vector, indice+1);
        else
            return negativos(vector, indice+1);
    }
    
}
