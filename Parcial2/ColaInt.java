package Parcial2;

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
    //Tema 1. Lucas Ariel Fernandez
    public boolean masElementos(ColaInt q2){
        ColaInt auxColaInt = new ColaInt(); //Cola auxiliar para recuperar el orden original de ambas
        int contador1=0, contador2=0;       //Contadores en 0
        while(!estaVacia()){                //Cuenta los elementos de la cola inicial
            auxColaInt.encolar(this.desencolar());
            contador1++;
        }
        while(!auxColaInt.estaVacia()){     //Recupera los elementos
            this.encolar(auxColaInt.desencolar());
        }
        while(!q2.estaVacia()){             //Cuenta los elementos de la cola q2
            auxColaInt.encolar(q2.desencolar());
            contador2++;
        }
        while(!auxColaInt.estaVacia()){     //Recupera los elementos de q2
            q2.encolar(auxColaInt.desencolar());
        }
        if(contador1>contador2){            //Compara la cantidad de elementos contados
            return true;
        }else
            return false;
    }
    

}
