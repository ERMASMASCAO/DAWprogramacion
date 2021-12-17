package Tema3.Strings;

/*  Realiza un programa que extraiga de una cadena la cadena comprendida entre dos posiciones.
*   Funciones a utilizar
*   String.substring();
*/

public class SubString{
    public static String entreCadenas (String cadena, int comienzo, int ultimo) {
        return cadena.substring(comienzo,ultimo);
    }
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Introduce una frase par comenzar el programa");
        int inicioCadena = Utilidades.leerEntero("Introduce la posicion en la que quieres empezar");
        int finalCadena = Utilidades.leerEntero("Introduce la posicion en la que quieres acabar");
        System.out.println();
        System.out.println("El resultado es el siguiente: ");
        System.out.println(entreCadenas(cadena1,inicioCadena ,finalCadena));
    }
}