package Controles;
import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {
        //Declaración de variables
        double area,radio,largo;
        final double PI = 3.14159;
        Scanner valor = new Scanner(System.in);
        
        //Empieza el programa
        System.out.println("Introduce el radio del circulo");
        radio = valor.nextDouble();
        largo = 2* PI * radio;
        area = PI * radio * radio;

        System.out.println ("Perímetro " + largo);
        System.out.println ("Área " + area);

        valor.close();
    }
}