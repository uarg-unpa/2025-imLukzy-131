package Pilas.Navegador;

public class Historial {

    private String[] paginas;
    private int cima;
    private final int MAX=5;
    
    public Historial(){
        paginas = new String[MAX];
        cima= -1;
    }

    public boolean estaVacia(){
        if (cima== -1)
            return true;
        return false;
    }


    public boolean estaLlena(){return cima==(MAX-1);}

    public void meter (String pagina){
        cima++;
        paginas[cima]=pagina;
    }
    public String sacar(){
        return paginas[cima--];
    }
    public String toString(){
        return "Pila con "+ (cima+1)+" elementos";
    }
    /* Estos metodos no deben usarse desde la clase, 
    public String vaciarHistorial(){
        if(estaVacia())
            return "Pila vacia";
        
    }
    public String toString(){
        if(estaVacia())
            return "Historial Vacio";
    }*/
}
