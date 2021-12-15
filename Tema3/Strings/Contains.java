package Tema3.Strings;

/*  Escribe un programa que muestre si una cadena contiene (o no) a otra.
*   Funciones a utilizar
*   String.contains()
*/

public class Contains {
    public static boolean comparar (String cadena1, String cadena2) {
        return cadena1.contains(cadena2);

        }
        public static void main(String[] args) {
            "abcdefg".contains("cd");
            "abcdefg".contains("cdz");
            
            String cadena1 = Utilidades.leerCadena("Introduce cadena 1");
		    String cadena2 = Utilidades.leerCadena("Introduce cadena 2");

            if (cadena1.contains(cadena2)) {
                System.out.println("la cadena 1 contiene otra cadena");
            } else {
                System.out.println("La cadena 1 no contiene ninguna otra cadena");
            }
        }
}
