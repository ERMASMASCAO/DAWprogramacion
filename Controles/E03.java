package Controles;
import java.util.Scanner;

public class E03 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        float notas,acumulador;
        Scanner lector;
        lector = new Scanner(System.in);
        
        //Empieza el programa
        System.out.println("Introduce las diferentes notas para saber su promedio");

        notas = 0;
        acumulador = 0;

        System.out.print("Primera nota = ");
        notas = lector.nextInt();
        acumulador = notas + acumulador;

        System.out.print("Segunda nota = ");
        notas = lector.nextInt();
        acumulador = notas + acumulador;

        System.out.print("Tercera nota = ");
        notas = lector.nextInt();
        acumulador = notas + acumulador;

        System.out.print("Cuarta nota = ");
        notas = lector.nextInt();
        acumulador = notas + acumulador;

        System.out.println("La nota promedio es = " + acumulador / 4);
        lector.close();
    }
}
       