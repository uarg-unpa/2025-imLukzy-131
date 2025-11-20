package tp5;

public class puzzle {

    public static int rompecabezas(int base, int limite) {
        if(base > limite)
            return -1;
        else
        if(base == limite)
            return 1;
        else
            return (base * rompecabezas(base + 1, limite));
    
    }
    

}
