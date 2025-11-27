package tp5;

public class SumarEnteros {

    public static int sumarVector(int [] vector, int indice){

        if(indice==vector.length)
            return 0;
        else
            return vector[indice]+sumarVector(vector, indice+1);
    }

    public static int productoVector(int [] vector, int indice){
        
        //if(vector[0]==0) return 0;
        if(indice==vector.length)
            return 1;
        else
            return vector[indice]*productoVector(vector, indice+1);
    }
    
}
