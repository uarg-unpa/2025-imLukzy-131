package tp5;

public class MayorElemento {

    public static int mayor(int[] vector, int indice){
        
        if (indice==vector.length-1)
            return vector[indice];
        if (vector[indice]>mayor(vector, indice+1))
            return vector[indice];
        else   
            return mayor(vector, indice+1);

    }
    
}
