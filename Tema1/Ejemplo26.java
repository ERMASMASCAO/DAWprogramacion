import java.util.Scanner;
public class Ejemplo26 {


    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        int multipicador;
        Scanner numeroMultiplicado;
        numeroMultiplicado = new Scanner(System.in);

        //EMPIEZA EL PROGRAMA
        System.out.println("Introduce un número entero");
        multipicador = numeroMultiplicado.nextInt();
        System.out.println("Table del " + multipicador);
        for (int i = 1; i <= 10; i++) {
            System.out.println(multipicador + " * " + i + " = " + multipicador * i);
                numeroMultiplicado.close();
        }        
    }
}