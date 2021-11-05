package Controles;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        

        //Declaración de variables
        Scanner nombreIntroducido = new Scanner(System.in);
        String nombre;

        //Empieza el programa
        System.out.println("Introduce tu nombre para ser saludado por el programa");
        nombre = nombreIntroducido.next();
        System.out.println("Hola" + nombre);
        nombreIntroducido.close();
    }
}
