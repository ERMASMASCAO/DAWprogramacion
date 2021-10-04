import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String [] args ) {
        
        //Declara tus variables
        Scanner lector = new Scanner(System.in);
        double radius,length,area;
        final double PI = 3.14159;

        //Programa principal
       
        System.out.println("Enter the radius");

        radius = lector.nextDouble();
        length = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("length"+ length);
        System.out.println("area"+ area);

        lector.close();
    }
        
    }
