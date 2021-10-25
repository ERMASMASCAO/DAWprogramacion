import java.util.Scanner;
public class Ejemplo25 {


    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        int numero,factorial = 1;
        Scanner lectoScanner;
        lectoScanner = new Scanner(System.in);

        //EMPEZAMOS EL PROGRAMA
        System.out.println("Introduce un número");
        numero = lectoScanner.nextInt();

        for (int i = 2; i <= numero; i++) {
            factorial = factorial * i;
        }
        lectoScanner.close();



    }
}
