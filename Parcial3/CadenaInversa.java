package Parcial3;

public class CadenaInversa {

    public static String inversa(String cadena){

        if(cadena.length()<=1)
            return cadena;
        //el primero con el ultimo, en cada llamada se corta el string. 
        else
            return inversa(cadena.substring(1))+cadena.charAt(0);
    }
}