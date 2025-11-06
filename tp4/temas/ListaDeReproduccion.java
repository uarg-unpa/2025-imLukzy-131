package tp4.temas;

public class ListaDeReproduccion {

    private Cancion[] lista;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ListaDeReproduccion() {
        this.lista = new Cancion[MAX];
        this.frente = 0;
        this.fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    //Usando el modulo de fin
    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(Cancion elem) {
        this.lista[fin] = elem;
        fin = (fin + 1) % MAX;
    }

    public Cancion desencolar() {
        Cancion aux = lista[frente];
        frente = (frente + 1) % MAX;
        return aux;
    }

    public Cancion peek() {
        return lista[frente];
    }

    
}
