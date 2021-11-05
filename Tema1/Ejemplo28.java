import java.util.Scanner;

public class Ejemplo28 {
    
public static void main(String [] args ){

    //DECLARACIÓN DE VARIABLES
    int contador,I;
    Scanner lector = new Scanner(System.in);
    System.out.println("Introduce un numero para saber si es primo o no");
    int numeroIntroducido = lector.nextInt();

    //EMPIEZA EL PROGRAMA
    
    contador = 0;
    for (I = 1; I <= numeroIntroducido; I++)
    {
        if ((numeroIntroducido % I ) == 0)
        {
        contador++;
        }
    }
    if (contador <=2)
    {
        System.out.println("Es un numero primo");
    }else{
        System.out.println("No es un numero primo");
    }
}
}