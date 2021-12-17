package Tema3.Strings;

/*  Escribe un programa que pida una cadena y dos caracteres y debe reemplazar todas las ocurrencias de un carácter por el otro.
*   Es decir, si la cadena es hola y los caracteres son a y o, debe devolver holo
*   Funciones a utilizar
*   String.replace()
*/

public class Reemplazar {
    public static String reemplazarCaracter (String cadena, char original, char finalizado) {
        return cadena.replace(original,finalizado);
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce la frase");
		char original = Utilidades.leerCaracter("Introduce los carácteres que quieras cambiar");
        char finalizado = Utilidades.leerCaracter("Introduce los carácteres a los que quieres cambiar la frase");
        System.out.println();
        System.out.println("Al cambiar los carácteres de esta frase se queda de la siguiente manera :  ");
        System.out.println(reemplazarCaracter(cadena, original, finalizado));
    }
}