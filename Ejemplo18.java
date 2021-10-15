import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String [] args ) {

        //DECLARACIÓN DE VALORES
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        Scanner lector;
        lector = new Scanner(System.in);

        //INICIO DEL PROGRAMA
        System.out.println("Introduce la hora");
        horas = lector.nextInt();

        System.out.println("Introduce los minutos");
        minutos = lector.nextInt();

        System.out.println("Introduce los segundos");
        segundos = lector.nextInt();

        //Si segundos llega a 60 que se ponga a 0 y aumente 1 minuto
        segundos = segundos + 1;
        if (segundos == 60){
            segundos = 0;
            minutos = minutos + 1;
        }

        //Si minutos llega a 60 que se ponga a 0 y aumente 1 hora
        if (minutos == 60){
            minutos = 0;
            horas = horas + 1;
        }

        //Si horas llega a 12 que se ponga a 00
        if (horas == 24){
            horas = 0;
        
        System.out.println("Són las:  %d: %d: %d: \n,horas,minutos,segundos");

        }

    }
}
