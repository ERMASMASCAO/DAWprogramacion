import java.util.Scanner;
public class Ejemplo22 {

    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        int contador, numero, positivos;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        contador = 0;
        positivos = 0;

        //INICIO DEL PROGRAMA
        
         while(contador < 10){
            System.out.println("Escribe me 10 numeros enteros positivos o negativos");
             numero = valorEntrante.nextInt();
             if(numero >=0 ){
                 positivos = positivos + 1;
             }
            contador = contador + 1;
        }
        System.out.println("Hay" + positivos + " numeros positivos ");
        valorEntrante.close();
    }
}
