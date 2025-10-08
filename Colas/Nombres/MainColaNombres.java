package Colas.Nombres;
import java.util.Scanner;

public class MainColaNombres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ColaNombres cola = new ColaNombres();

        String nombre;

        //Encolar nombres ingresado por el usuario

        System.out.println("Ingrese un nombre: ");
        nombre=sc.nextLine();
        cola.encolar(nombre);

        System.out.println("Ingrese un nombre: ");
        nombre=sc.nextLine();
        cola.encolar(nombre);

        //Desencolar y mostrar nombre
        if (cola.estaVacia())
            System.out.println("No hay nombres en la cola");
        else 
            System.out.println("Nombre desencolado: "+cola.desencolar());
        
        //Mostrar el nombre del frente
        if(cola.estaVacia())
            System.out.println("No hay nombres en la cola");
        else   
            System.out.println("Primer nombre encolado: "+cola.mostrar());
        
        //Mostrar estado de la cola (vacio o llena)
        if (cola.estaLLena())
            System.out.println("La cola esta llena");
        else if (cola.estaVacia())
                System.out.println("La cola esta vacia");
        



    }
    
}
