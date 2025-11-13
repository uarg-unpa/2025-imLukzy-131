package tp4.temas;
import java.util.Scanner;

public class MainReproductor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titulo, interprete, genero;
        int anio, duracion;

        Cancion song = new Cancion("One Step Closer", "Linkin Park", "Nu Metal", 2000, 159);
        ListaDeReproduccion lista = new ListaDeReproduccion();

        System.out.println("Cancion: "+song.toString());
        int opcion;

        do{
            System.out.println();
            System.out.println("=== MENU: LISTA DE REPRODUCCION ===");
            System.out.println("1. Agregar cancion.");
            System.out.println("2. Reproducir cancion.");
            System.out.println("3. Siguiente en la lista");
            System.out.println("4. Mostrar estado de la lista.");
            System.out.println("0. Salir del menu.");

            opcion=sc.nextInt();
            
            switch (opcion) {

                case 1:

                    if(lista.estaLlena()){
                        System.out.println("La lista esta llena.");
                    }else{
                        sc.nextLine(); // Limpia el buffer

                        System.out.println("Ingrese el titulo: ");
                        titulo=sc.nextLine();

                        System.out.println("Ingrese el interprete: ");
                        interprete=sc.nextLine();

                        System.out.println("Ingrese el genero musical: ");
                        genero=sc.nextLine();

                        System.out.println("Ingrese el año de lanzamiento: ");
                        anio=sc.nextInt();

                        System.out.println("Ingrese la duracion en segundos: ");
                        duracion=sc.nextInt();

                        Cancion nuevaCancion = new Cancion(titulo, interprete, genero, anio, duracion);

                        lista.encolar(nuevaCancion);
                    }
                break;

                case 2:
                    if(lista.estaVacia()){
                        System.out.println("Error. La lista esta vacia.");
                    }else{
                        System.out.print("Reproduciendo: "+lista.desencolar()); //el metodo toString() es llamado automaticamente
                        /*Cancion aux = lista.desencolar();
                         * System.out.print("Reproduciendo: "+aux.toString());
                         * //Se usaria esa forma si tendria otro nombre el metodo de mostrar la info
                         */
                    }
                break;

                case 3:
                    if(lista.estaVacia()){
                        System.out.println("Error. La lista esta vacia.");
                    }else{
                        System.out.print("Siguiente cancion en la lista: ");
                        Cancion elem = lista.peek();
                        System.out.println(elem.toString());
                    }
                break;

                case 4:
                    if(lista.estaLlena()){
                        System.out.println("La lista esta llena.");
                    }
                    if(lista.estaVacia()){
                        System.out.println("La lista esta vacia.");
                    }
                break;

                case 0:
                    System.out.println("Saliendo de la lista...");
                break;
            
                default:
                    System.out.println("Error, opcion invalida.");
                break;
            }

        }while(opcion!=0);
     
        sc.close();
    }
    
}
