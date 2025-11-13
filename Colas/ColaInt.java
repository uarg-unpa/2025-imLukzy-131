package Colas;
//Frente fijo final movible

public class ColaInt {

    private int [] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;
    
    public ColaInt(){
        this.elementos = new int [MAX];
        this.frente=0;
        this.fin=0;
    }
    public boolean estaVacia(){
        return this.fin==0; //Vacia si no se encolado nada
    }
    public boolean estaLlena(){
        return this.fin==MAX; //Llena si no hay espacio
    }
    public void encolar(int elem){
        elementos[fin]=elem;
        this.fin++;
    }
    public int desencolar(){
        int aux=elementos[frente];

        for(int i = 0; i < (fin-1); i++){
            this.elementos[i]=this.elementos[i+1];
        }
        this.fin--;
        return aux;
    }
    public int mostrar(){
        return elementos[frente];
    }
    public int cantidad(){
        return this.fin;
    }


}
