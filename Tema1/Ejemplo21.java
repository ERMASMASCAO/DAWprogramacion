import java.util.Scanner;
public class Ejemplo21 {

    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        Scanner lector;
        lector = new Scanner(System.in);
        int ano;
        boolean añoBisiesto;
        

        //INICIO DEL PROGRAMA

        //Introducimos el año para verificar si es bisiesto o no.
        System.out.println("Introduce la fecha del año para saber si es bisiesto o no");
        ano = lector.nextInt();
        lector.close();

        //Comprobamos si el año es bisisesto o no.
        if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0 )){
            añoBisiesto = true;
        
        //Imprimimos si es bisiesto o no.
            if (añoBisiesto){
            System.out.println("Es bisiesto");
        }else {
            System.out.println("No es bisiesto");
            
            }


        }
    }
}
