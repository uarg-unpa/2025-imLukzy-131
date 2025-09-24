package ClaseArreglos;
/* paso de un array como argumento de llamada a un metodo
<modificador de acceso> <tipo_retorno> <identificador> (<tipo> []){...}

public void metodoEjemplo(int numb[]){
...
}

Ejemplo de codigo:

public int [] nombreMetodo(){
	int[] num;
	.
	.
	.
	return num;
}

Recorrido for-each
Es una esctructura de control, que me permite iterar en un arreglo.

for(<tipo de datos>:<nombre del arreglo>){...} Recorre todo el arreglo, de principio a fin

se puede tener como atributo un arreglo

los arreglos se inicializan en los contructores

un metodo no puede tener mas de 2 acciones, se debe separar 1 accion por metodo
*/

public class Array {
    public static void main(String[] args) {
        
        int dim=10;
        //declaracion
        int [] elementos;
        //incializacion
        elementos = new int[dim];
        //declarar e inicializar
        int [] nums = new int[dim];

        //elementos.length para el largo del arreglo
        for(int i=0; i<nums.length;i++){

            elementos[i]=i*2;
        }

        for(int i=0; i<nums.length;i++){

            nums[i]=i*2;
        }
        for(int i=0; i<10; i++){
            System.out.println("Numero: "+nums[i]);
        }
        for (int num : nums){
            System.out.println("Num: "+num);
        }
        String texto="Hola";
        
        texto.trim();
    }
    
}
