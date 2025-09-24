package Pilas;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
        // Inicializar cima
        cima=0;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        // Devuelve true si cima indica que la pila está vacía
        return cima==0;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
        return cima==MAX-1;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
              // Completar: incrementar cima y asignar el elemento
        this.elementos[cima]=elem;
        cima++;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
            
            cima--;
        return elementos[cima];

         }
    
}
