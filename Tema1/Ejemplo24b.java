import java.util.Scanner;

public class Ejemplo24b {

	public static void main(String[] args) {

        //DECLARACIÓN DE VARIABLES
        int nota;
        Scanner valorNota;
        valorNota = new Scanner(System.in);


        //EMPEZAMOS EL PROGRAMA

        System.out.println("INTRODUCE LAS NOTAS Y PULSE -1 PARA CERRAR EL PROGRAMA");
        nota = valorNota.nextInt();

        while (nota != -1) {
            
            System.out.println("INTRODUCE LAS NOTAS Y PULSE -1 PARA CERRAR EL PROGRAMA");
            nota = valorNota.nextInt();
            valorNota.close();
        }
    }
}