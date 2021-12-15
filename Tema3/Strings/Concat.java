package Tema3.Strings;

/*   Realiza un programa que concatene dos Strings en un tercer String.
*    Funciones a utilizar
*    String.concat()
*/

public class Concat {
    
    public static String concatenar (String cadena1, String cadena2,String cadena3) {

        /* Ahora estamos concatenando 3 arrays y hay dos maneras diferentes de hacerlas:
        return cadena1.concat(cadena2).concat(cadena3);
        String primeraConcatenacion =  cadena1.concat(cadena2);
        return primeraConcatenacion.concat(cadena3);
        */
        return cadena1.concat(cadena2).concat(cadena3);
    }
        public static void main(String[] args) {
            String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		    String cadena2 = Utilidades.leerCadena("Introduce cadena2");
            String cadena3 = Utilidades.leerCadena("Introduce cadena3");
            System.out.println();
            System.out.println(concatenar(cadena1, cadena2, cadena3));
        }
}