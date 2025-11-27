package Colas.Nombres;

public class ColaNombres {
    //atributos
    private int frente;
    private int fin;
    private String [] elementos;
    private final int MAX=10;
    private int cantidad;

    //Constructor
    public ColaNombres(){
        this.frente=0;
        this.fin=0;
        this.elementos = new String[MAX];
        this.cantidad=0;
    }

    //Metodos de cola circular, siguiente() - estaLlena() - estaVacia() - encolar() - desencolar() - mostrar() - contar()

    private int siguiente(int subind){
        if (subind==MAX-1)
            return 0;
        else   
            return ++subind;
    }
    public void encolar(String elem){
        this.fin=siguiente(fin);
        this.elementos[fin]=elem;
        this.cantidad++;
    }
    public String desencolar(){
        this.frente=siguiente(this.frente);
        this.cantidad--;
        return this.elementos[this.frente];
        
    }
    public boolean estaLLena(){
        int sigultimo = siguiente(fin);
        return (sigultimo==this.frente);
    }
    public boolean estaVacia(){
        return (this.frente==this.fin);
    }
    public String mostrar(){
        return this.elementos[this.frente];
    }
    public int contar(){
        return cantidad;
    }    
}
