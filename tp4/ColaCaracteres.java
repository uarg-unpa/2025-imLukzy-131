package tp4;

public class ColaCaracteres {

    private char [] elementos;
    private int frente;
    private int fin;
    private final int MAX=10;

    public ColaCaracteres(){
        this.elementos=new char [MAX];
        this.frente=0;
        this.fin=0;
    }
    public boolean estaVacia(){
        return this.fin==0;
    }
    public boolean estaLlena(){
        return this.fin==MAX;

    }
    public void encolar(char elem){
        this.elementos[fin]=elem;
        this.fin++;
    }
    public char desencolar(){
        char aux=elementos[frente];

        for(int i = 0; i < (fin-1); i++){
            this.elementos[i]=this.elementos[i+1];
        }
        this.fin--;
        return aux;
    }
    public char mostrar(){
        return this.elementos[frente];
    }
    public int cantidad(){
        return this.fin;
    }
}
