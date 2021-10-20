import java.util.Scanner;
public class Ejemplo23 {

    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        int numero, positivos;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        //INICIO DEL PROGRAMA
        System.out.println("Introduce numeros y pulse 0 para acabar");
        
        positivos = 0;
        do{
            numero = valorEntrante.nextInt();
            if (numero > 0){
                positivos++;
            }
        }while (numero !=0);

        valorEntrante.close();
        System.out.println(".................");
        System.out.println("Total de numeros positivos:" + positivos);

    }
}