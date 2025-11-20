package tp4.niveles;

public class PilaNiveles {

    private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaNiveles() {
        elementos = new int[MAX]; // Crear el array
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
    public void meter(int elem) { // Completar: incrementar cima y asignar el elemento
        cima++;
        this.elementos[cima]=elem;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() { // Guarda el elemento de la cima, decrementa cima y lo devuelve
        int elem = elementos[cima];    
        cima--;
        return elem;
    }
    public int cantidad(){
        return (this.cima+1);
    }

    public int ultimoElemento(){ // Mostrar el tope de la pila (peek) 
        return elementos[cima];
    }

    public int contarOcurrencias(int elem){ //Contador de niveles de la pila, usando estructura LIFO
        PilaNiveles auxNiveles = new PilaNiveles();
        int ocurrencias=0;
        while(!this.estaVacia()){ //Sacar los elementos de la PilaNiveles y contar el nivel enviado por parametro
            int sacado=this.sacar();
            if(sacado==elem) //Si el elemento es igual al enviando, suma 1.
                ocurrencias++;

            auxNiveles.meter(sacado); //Solo mete el elemento
        }
        
        while(!auxNiveles.estaVacia()){ //Devuelve los elementos de la pila auxiliar a la PilaNiveles
            this.meter(auxNiveles.sacar());
        }
        return ocurrencias; //Devuelve la cantidad de elementos iguales que habia en la pila.
    }
    
}
