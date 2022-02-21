import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        // entrada de una cadena
        System.out.println("Escribe dos cadenas de texto");

        System.out.println("Introduce la primera");
        String cadenaTexto1 = lector.nextLine();

        System.out.println("Introduce la segunda");
        String cadenaTexto2 = lector.nextLine();

        StringBuilder cadena = new StringBuilder(cadenaTexto1);
        StringBuilder cadena2 = new StringBuilder(cadenaTexto2);

        cadenaTexto1 = cadena.reverse().toString();
        cadenaTexto2 = cadena2.reverse().toString();

        System.out.println(cadenaTexto2 + cadenaTexto1);
        
    }
}
