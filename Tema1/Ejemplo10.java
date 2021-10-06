import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String [] args ) {
        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        double numero;

        //Empieza el programa
        System.out.println("Enter the age: ");
        numero = lector.nextDouble();

        lector.close();

        if (numero >= 0) { 
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }
    }
}