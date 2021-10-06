import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String [] args ) {

        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        double precio, precioRebajado, descuento;

        //Empieza el programa
        System.out.println("Introduce el precio real");
        precio = lector.nextDouble();

        System.out.println("Introduce el precio rebajado");
        precioRebajado = lector.nextDouble();

        descuento = (precio - precioRebajado)/precio * 100;
        System.out.println("descuento " + descuento);


        lector.close();
    }
}