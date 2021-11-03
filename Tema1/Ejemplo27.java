import java.util.Scanner;
public class Ejemplo27 {
    
    public static void main(String [] args ){

        //DECLARACIÓN DE VARIABLES
        int numero;
        Scanner n;
        n = new Scanner(System.in);

        //EMPIEZA EL PROGRAMA
        System.out.println("Introduce un numero");
        numero = n.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        n.close();
    }
}