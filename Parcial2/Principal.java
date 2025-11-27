package Parcial2;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaInt q1 = new ColaInt();
        ColaInt q2 = new ColaInt();

        //Cola 1
        q1.encolar(1);
        q1.encolar(2);
        q1.encolar(3);
        //q1.encolar(4);

        //Cola 2
        q2.encolar(1);
        q2.encolar(2);
        q2.encolar(3);
        q2.encolar(4);

        if(q1.masElementos(q2)){
            System.out.println("Cola q1 tiene mas elementos");
        }else{
            System.out.println("Cola q2 tiene mas elementos");
        }

        //PilaChar

        PilaChar p = new PilaChar();
        PilaChar aux = new PilaChar();
        int cantidadVocales=0;

        p.meter('a');
        p.meter('b');
        p.meter('E');
        p.meter('c');

        if(p.estaVacia()){
            System.out.println("Error la pila esta vacia.");
        }else{
            char elemento;
            while(!p.estaVacia()){
                elemento=p.sacar();
                if(elemento=='a'||elemento=='e'||elemento=='i'||elemento=='o'||elemento=='u'||elemento=='A'||elemento=='E'||elemento=='I'||elemento=='O'||elemento=='U'){
                    cantidadVocales++;
                }
                aux.meter(elemento);
            }
            while(!aux.estaVacia()){
                p.meter(aux.sacar());
            }
            if(cantidadVocales==0){
                System.out.println("No hay vocales");
            }else{
                System.out.println("Hay "+cantidadVocales+" vocales en la pila");
            }

        }



      
        sc.close();
    }
    
}
