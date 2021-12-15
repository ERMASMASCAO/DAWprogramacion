package Tema3.Strings;

/*
 * Realiza un programa que diga si una cadena es mayor, menor o igual que otra cadena. 
 * Ambas cadenas se deben leer desde el teclado con Scanner.
 */
public class Comparar {
	public static int comparar(String cadena1, String cadena2) {
		return cadena1.compareTo(cadena2);
	}
	public static void main(String[] args) {
		
		String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		String cadena2 = Utilidades.leerCadena("Introduce cadena2");

		/*se le define que el resultado al empezar tiene valor 0 para evitar problemas en el programa, pero también hay diferentes maneras
		por ejemplo la siguiente:
		--> int resultado = comparar (cadena1, cadena2);
		*/
		
		int resultado = 0;
		resultado = comparar(cadena1, cadena2);
		
		if (0 == resultado){
			System.out.println("Las cadenas son iguales");
		}
		else if (resultado > 0){
			System.out.println("'" + cadena1 + "' es mayor que '" + cadena2 + "'");
		}
		else {
			System.out.println("'" + cadena2 + "' es mayor que '" + cadena1 + "'");
		}
	}
	

}