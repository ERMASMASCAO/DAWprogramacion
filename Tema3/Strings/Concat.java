package Tema3.Strings;

/*   Realiza un programa que concatene dos Strings en un tercer String.
*    Funciones a utilizar
*    String.concat()
*/

public class Concat {
    
    public static String concatenar (String cadena1, String cadena2) {

        /* Ahora estamos concatenando 3 arrays y hay dos maneras diferentes de hacerlas:
        return cadena1.concat(cadena2).concat(cadena3);
        String primeraConcatenacion =  cadena1.concat(cadena2);
        return primeraConcatenacion;
        */
        return cadena1.concat(cadena2);
    }
        public static void main(String[] args) {
            String cadena1 = Utilidades.leerCadena("Introduce cadena1");
		    String cadena2 = Utilidades.leerCadena("Introduce cadena2");
            System.out.println();
            String resultado = concatenar(cadena1, cadena2);
            System.out.println(resultado);
        }
}