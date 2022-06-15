import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Crea un programa que analice un fichero de texto plano y que muestre las
 * siguientes estadisticas:
 * nº de letras, nº de palabras, nº de lineas, % de vocales, % de consonantes, %
 * espacios y % de tabuladores.
 */

public class EstadisticasTexto {
    public static void main(String[] args) throws IOException {
        // Contadores y atributos
        int contadorLetras = 0;
        int contadorPalabras = 0;
        int contadorLineas = 0;
        int contadorVocales = 0;
        double porcentajeVocales;
        int contadorConsonantes = 0;
        double porcentajeConsonantes;
        int contadorEspacios = 0;
        double porcentajeEspacios;
        int contadorTabuladores = 0;
        double porcentajeTabuladores;

        boolean palabra = false;

        // Lector del fichero
        BufferedReader lectorFich = new BufferedReader(new FileReader("tema6/ficheros/actividades/fichero.txt"));
        String cadena = lectorFich.readLine().toLowerCase();

        int finDeLinea = cadena.length() - 1;

        try {
            while (cadena != null) {
                // CONTADOR LINEAS
                contadorLineas++;
                // recorremos la cadena para analizarla y poder contar
                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);
                    // CONTADOR LETRAS
                    if (Character.isLetter(cadena.charAt(i))) {
                        contadorLetras++;
                    }
                    // CONTADOR VOCALES Y CONSONANTES
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        contadorVocales++;
                    } else if (caracter != ' ' || caracter != 'a' || caracter != 'e' || caracter != 'i'
                            || caracter != 'o' || caracter != 'u') {
                        contadorConsonantes++;
                    }
                    // CONTADOR ESPACIOS
                    if (caracter == ' ') {
                        contadorEspacios++;

                    }

                    // CONTADOR DE PALABRAS
                    if (Character.isLetter(cadena.charAt(i)) && i != finDeLinea) {
                        palabra = true;
                        // Si el char no es una letra y aún hay más letras,
                        // el contador continua.
                    } else if (!Character.isLetter(cadena.charAt(i)) && palabra) {
                        contadorPalabras++;
                        palabra = false;
                        // última palabra de la cadena; si no termina con una no letra ,
                    } else if (Character.isLetter(cadena.charAt(i)) && i == finDeLinea) {
                        contadorPalabras++;
                    }

                    // CONTADOR DE TABS
                    if (caracter == '\t') {
                        contadorTabuladores++;
                    }

                }
                cadena = lectorFich.readLine();
            }
            // CALCULAMOS PORCENTAJES:
            porcentajeVocales = (contadorVocales * contadorLetras) / 100;
            porcentajeConsonantes = (contadorConsonantes * contadorLetras) / 100;
            porcentajeEspacios = (contadorEspacios * contadorLetras) / 100;
            porcentajeTabuladores = (contadorTabuladores * contadorLetras) / 100;

            // IMPRESION FINAL
            System.out.println("===========================\n"
                    + "ESTADISTICAS DE TU FICHERO:\n"
                    + "===========================\n"
                    + "Letras:\t\t" + contadorLetras + " \n"
                    + "Palabras:\t" + contadorPalabras + " \n"
                    + "Lineas:\t\t" + contadorLineas + " \n"
                    + "Vocales:\t" + porcentajeVocales + "% \n"
                    + "Consonantes:\t" + porcentajeConsonantes + "% \n"
                    + "Espacios:\t" + porcentajeEspacios + "% \n"
                    + "Tabuladores:\t" + porcentajeTabuladores + "% \n");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
        lectorFich.close();

    }

}