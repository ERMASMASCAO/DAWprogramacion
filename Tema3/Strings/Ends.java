package Tema3.Strings;

/* Escribe un programa que compruebe si una cadena acaba con el contenido de otra.
*    Funciones a utilizar
*    String.endsWith()
*/

public class Ends {
    public static boolean comprobar (String cadena1, String cadena2) {
        return cadena1.endsWith(cadena2);
    }
    public static void main(String[] args) {

        String cadena1 = Utilidades.leerCadena("Introduce cadena 1");
		String cadena2 = Utilidades.leerCadena("Introduce cadena 2");

        if (comprobar(cadena1, cadena2)) {
            System.out.println("Esta cadena acaba con el contenido de otra");
        } else {
            System.out.println("Esta cadena no acaba con el contenido de otra");
        }
    }
}
