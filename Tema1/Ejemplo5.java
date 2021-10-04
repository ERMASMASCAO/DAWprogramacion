import java.util.Scanner;
public class Ejemplo5 {
public static void main(String[] args) {

    //Declara tus variables
    Scanner lector = new Scanner(System.in);
    int x,y;
    int sum, sub, mult, div;

    //Inicio del programa
    System.out.println("Enter number 1");
    x = lector.nextInt();
    System.out.println("Enter number 2");
    y = lector.nextInt();

    lector.close();

    sum = x+y;
    sub = x-y;
    mult = x*y;
    div = x/y;

    System.out.println("sum: " + sum);
    System.out.println("sub: " + sub);
    System.out.println("mult: " + mult);
    System.out.println("div: " + div);

    }
}