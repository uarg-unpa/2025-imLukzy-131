package tp4.ColaPromedio;

public class ColaInt {

    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaInt() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    public boolean estaLlena() {
        return (fin + 1) % MAX == frente;
    }

    public void encolar(int elem) {
        elementos[fin] = elem;
        fin = (fin + 1) % MAX;
    }

    public int desencolar() {
        int aux = elementos[frente];
        frente = (frente + 1) % MAX;
        return aux;
    }

    public int peek() {
        return elementos[frente];
    }
    public double calcularPromedio(){
        ColaInt auxColaInt = new ColaInt();
        int cantidad=0, elementos=0, aux;
        double promedio;
        while(!estaVacia()){
            aux=desencolar();
            auxColaInt.encolar(aux);
            elementos=elementos+aux;
            cantidad++;
        }
        while(!auxColaInt.estaVacia()){
            encolar(auxColaInt.desencolar());
        }
        promedio=(double)elementos/cantidad;
        return promedio;
    }
    
}
