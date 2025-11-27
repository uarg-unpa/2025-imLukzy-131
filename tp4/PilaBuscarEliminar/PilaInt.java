package tp4.PilaBuscarEliminar;


public class PilaInt {

    private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila
    private int contador;

    // Constructor: inicializa el array y la cima
    public PilaInt() {
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
        // Devuelve true si cima está en el límite del array
        return cima==(MAX-1);
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        cima++;
        this.elementos[cima]=elem;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        // Guarda el elemento de la cima, decrementa cima y lo devuelve
        int elem = elementos[cima];    
        cima--;
        return elem;
    }
    public int cantidadDeMovidos(){
        return this.contador;
    }

    public int ultimoElemento(){
        return elementos[cima];
    }
    public boolean buscarElemento(int elem){
        PilaInt auxEnteros = new PilaInt();
        boolean encontrado=false;
        this.contador=0;
        while(!this.estaVacia()&&!encontrado){
            int sacado = this.sacar();
            if (sacado!=elem){
                auxEnteros.meter(sacado);
                this.contador++;
            }else
                encontrado=true;
        }
        while(!auxEnteros.estaVacia()){
            this.meter(auxEnteros.sacar());
        }
        return encontrado;
    }

    
}
