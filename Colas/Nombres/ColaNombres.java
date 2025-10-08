package Colas.Nombres;

public class ColaNombres {
    //atributos
    private int frente;
    private int fin;
    private String [] elementos;
    private final int MAX=10;

    //Constructor
    public ColaNombres(){
        this.frente=0;
        this.fin=0;
        this.elementos = new String[MAX];
    }

    //Metodos de cola circular, siguiente() - estaLlena() - estaVacia() - encolar() - desencolar() - mostrar()

    private int siguiente(int subind){
        if (subind==MAX-1)
            return 0;
        else   
            return ++subind;
    }
    public void encolar(String elem){
        this.fin=siguiente(fin);
        this.elementos[fin]=elem;
    }
    public String desencolar(){
        this.frente=siguiente(this.frente);
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
        return this.elementos[this.frente+1];
    }


    
}
