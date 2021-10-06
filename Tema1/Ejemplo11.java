import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String [] args ) {

        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        double x,y;

        //Empieza el programa
        System.out.println("x: ");
        x = lector.nextDouble();

        System.out.println("y: ");
        y = lector.nextDouble();

        lector.close();

        if (x <= y) {
            System.out.println(x + " " + y);
        }
        else{
            System.out.println(y + " " + y);
        }
    }
}