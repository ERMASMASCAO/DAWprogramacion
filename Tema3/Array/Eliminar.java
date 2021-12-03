package Tema3.Array;
import java.util.Arrays;
/**
 * Escribid un programa Java para eliminar de un array un elemento específico
 * (índice) introducido por el usuario (moviéndolo al final del mismo). Si el
 * índice es mayor que el tamaño del array, debe decírselo al usuario y volver a
 * pedírselo.
 * 
 * @author victor
 *
 */
public class Eliminar {
	public static void eliminarElemento(int[] numeros, int removeIndex) {
		// Hacemos una copia del elemento a eliminar antes de empezar a mover
		int numeroAMover = numeros[removeIndex];
		for (int i = removeIndex; i < numeros.length - 1; i++) {
			// Ahora movemos una posición hacia la izquierda todos los elementos a partir de
			// removeIndex
			// Por ejemplo, si removeIndex = 3;
			// my_array[3] = my_array[4];
			// my_array[4] = my_array[5];
			// y así sucesivamente hasta llegar al penúltimo
			numeros[i] = numeros[i + 1];
		}
		// Y ahora ponemos el número a mover en la última posición
		numeros[numeros.length - 1] = numeroAMover;
	}

	public static void main(String[] args) {
		int[] misNumeros = new int[20];
		Utilidades.rellenaArray(misNumeros, -30, 30);

		System.out.println("Original Array : " + Arrays.toString(misNumeros));

		int removeIndex = -1;
		do {
			removeIndex = Utilidades.leerEntero("Introduce un índice entre 1 y " + misNumeros.length + ":");
			if ((removeIndex < 1) || (removeIndex > (misNumeros.length))) {
				System.out.println("El índice debe estar comprendido entre 1 y " + misNumeros.length + ":");
			}
		} while ((removeIndex < 1) || (removeIndex > misNumeros.length));

		//removeIndex empieza en 1 no en cero porque el usuario no sabe que los arrays empiezan en 0
		eliminarElemento(misNumeros, removeIndex - 1);

		// No podemos alterar el tamaño del array,
		// por lo tanto el último y el penúltimo elementos son iguales
		System.out.println("Después de eliminar el " + removeIndex + " elemento: " + Arrays.toString(misNumeros));
    }
}
