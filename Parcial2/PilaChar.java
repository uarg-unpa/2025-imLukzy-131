package Parcial2;

public class PilaChar {

    private char[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaChar() {
        elementos = new char[MAX]; // Crear el array
        // Inicializar cima
        cima=-1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        // Devuelve true si cima indica que la pila está vacía
        return cima==-1;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
        return cima==(MAX-1);
    }

    // Agrega un elemento en la cima (push)
    public void meter(char elem) { // Completar: incrementar cima y asignar el elemento
        cima++;
        this.elementos[cima]=elem;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public char sacar() { // Guarda el elemento de la cima, decrementa cima y lo devuelve
        char elem = elementos[cima];    
        cima--;
        return elem;
    }
    public int cantidad(){
        return (this.cima+1);
    }

    public char ultimoElemento(){ // Mostrar el tope de la pila (peek) 
        return elementos[cima];
    }
    
}
