package tp5;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num, num2, cont=1;
        int [] numeros = new int[5];
        int [] vacio = new int[1];
        int [] negativos = {1, -3, 4, -5, 4};

        //Sumar los numero pares
        System.out.print("Ingrese el numero final, para sumar los pares: ");
        num=sc.nextInt();
        System.out.print("Resultado: "+SumarPares.pares(num));
        System.out.println();

        //Potencia de un numero
        System.out.print("Base: ");
        num=sc.nextInt();
        System.out.print("Exponente: ");
        num2=sc.nextInt();
        System.out.println(num+"^"+num2+"= "+Potencia.elevado(num, num2));

        //Contar negativos
        System.out.println("Negativos: "+ContarNegativos.negativos(negativos, 0));

        //Sumar los digitos de un numero entero
        System.out.print("Ingrese un numero entero: ");
        num=sc.nextInt();
        System.out.println("La suma de los digitos es: "+SumarDigitos.sumaDigitos(num));

         //Sumar numeros de un vector
        for(int i=0; i<numeros.length; i++){
            //numeros[i]=cont;
            numeros[i]=(int) (Math.random() * 9) + 1;
            cont=cont+1;
        }
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" | ");
        }
        System.out.println();
        System.out.println("La suma de los elementos es: "+SumarEnteros.sumarVector(numeros, 0));

        //Producto de los digitos de un vector
        vacio[0]=1;
        System.out.println("Vacio: "+SumarEnteros.productoVector(vacio, 0));
        vacio[0]=0;
        System.out.println("Vacio: "+SumarEnteros.productoVector(vacio, 0));
        System.out.println("Numeros: "+SumarEnteros.productoVector(numeros, 0));

        //Mayor elemento en el vector
        System.out.println("El mayor elemento de numeros es: "+MayorElemento.mayor(numeros, 0));
        
        //Factorial
        System.out.println();
        System.out.print("Factorial de: ");
        num=sc.nextInt();
        System.out.println("Es: "+Factorial.fact(num));

        //Puzzle tp1
        System.out.println("Puzzle de: ");
        System.out.print("Base: ");
        num=sc.nextInt();
        System.out.print("Limite: ");
        num2=sc.nextInt();

        System.out.println("Resultado 1: "+puzzle.rompecabezas(num, num2));

        System.out.println("2: "+puzzle.rompecabezas(14, 10));
        System.out.println("3: "+puzzle.rompecabezas(4, 7));
        System.out.println("4: "+puzzle.rompecabezas(0, 0));


        
        sc.close();
        
        
    }
    
}
