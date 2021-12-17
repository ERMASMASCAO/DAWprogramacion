package Tema3.Strings;

/*  Escribe un programa que devuelva la posición de una cadena en otra
    Funciones a utilizar
    String.indexOf()
*/

public class IndexOf {
    public static int devolverPosicionCadenaEnOtra (String cadena1, String cadena2) {
        return cadena1.indexOf(cadena2);
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una frase");
        String segundaCadena = Utilidades.leerCadena("Introduce una segunda frase");
        
        System.out.println(devolverPosicionCadenaEnOtra(cadena, segundaCadena));

    }
}
