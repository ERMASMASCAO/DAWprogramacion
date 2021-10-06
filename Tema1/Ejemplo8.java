import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String [] args ) {

        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        short age = 0;

        //Empieza el programa
        System.out.println("Enter the age: ");
        age = lector.nextShort();

        lector.close();

        if (age >= 18) {
            System.out.println("You have the legal age");

        }
    }
}

