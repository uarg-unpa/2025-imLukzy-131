package Pilas.PilaEnteros;

import java.util.Scanner;

public class MenuPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaEnteros pila = new PilaEnteros();
        PilaEnteros pila2= new PilaEnteros();
        int opcion, elemento;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Meter elemento");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Mostrar ultimo elemento");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("5. Buscar y borrar elemento en la pila MAIN");
            System.out.println("6. Buscar y borrar elemento en la pila METODO");
            System.out.println("7. Sacar los elementos y mostrarlos en terminal");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un número: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Elemento " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (pila.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        elemento = pila.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;
                case 3: //Mostrar ultimo elemento
                    if (pila.estaVacia()){
                        System.out.println("No hay ultimo elemento.");
                    }else{
                        System.out.println("Ultimo elemento: "+pila.ultimoElemento());
                    }
                    break;

                case 4: // Verificar estado
                    if(pila.estaVacia())
                        System.out.println("La pila esta vacia.");
                    else
                        System.out.println("Hay "+pila.cantidad()+" elemento(s) en la pila");
                    if(pila.estaLlena())
                        System.out.println("La pila esta llena.");
                    break;
                
                case 5: //Buscar elemento en la pila usando pila.sacar() y una pila2 
                    System.out.print("Ingrese el elemento a sacar: ");
                    elemento = sc.nextInt();
                    if (pila.estaVacia()){
                        System.out.println("Error. La pila esta vacia");
                    } 
                    else {
                        int sacado;
                        boolean encontrado=false;
                        do{
                            sacado=pila.sacar();
                            if(sacado==elemento)
                                encontrado=true;
                            else
                                pila2.meter(sacado);
                        }while(!pila.estaVacia());

                        if(encontrado)
                            System.out.println("Numero: "+elemento+" quitado: ");
                        else
                            System.out.println("Numero: "+elemento+" no encontrado");
                        while(!pila2.estaVacia()){
                            pila.meter(pila2.sacar());
                        }
                    }
                    break;

                case 6: //Buscar elemento en la pila con pila auxEnteros
                    System.out.print("Ingrese el numero a eliminar de la pila: ");
                    elemento = sc.nextInt();

                    if (pila.estaVacia()){
                        System.out.println("Error, la pila esta vacia.");
                    }else{
                        if(pila.buscarElemento(elemento))
                            System.out.println("Numero: "+elemento+" encontrado y eliminado");
                        else
                            System.out.println("Numero: "+elemento+" no encontrado");
                    }break;
                case 7: //Imprimir la pila
                    while(!pila.estaVacia()){
                        System.out.println("| "+pila.sacar()+" |");
                    }
                    break;
                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);


        sc.close();
    }
    
}