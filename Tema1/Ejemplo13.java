import java.util.Scanner;
public class Ejemplo13 {
    public static void main(String [] args ) {

        //Declaración de variables
        Scanner lector = new Scanner(System.in);
        double x,y;
        int opcion;

        //Empieza el programa
        System.out.println("x: ");
        x = lector.nextDouble();

        System.out.println("y: ");
        y = lector.nextDouble();

        System.out.println("Opción ascendente 1 o descendente 2:");
        opcion = lector.nextInt();

        lector.close();

        if (opcion == 1){
            //Imprimir en orden ascendente
            if ( x >= y){
                System.out.println();
                
            }
            
        }else if (opcion == 2) {
            //Imprimir en orden descendente
        }
    }
}