import java.util.Scanner;
public class Ejemplo24{

    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        int nota, notaMedia, acumulador;
        Scanner valorNota;
        valorNota = new Scanner(System.in);
        boolean HayUnDiez = false;

        //EMPIEZA EL PROGRAMA

        System.out.println("Introduce las notas y pulse -1 para acabar");

        nota = 0;
        acumulador = 0;
        notaMedia = 0;

        do{
            nota = valorNota.nextInt();

            if (nota != -1){
                acumulador = nota;
                notaMedia ++;
            }

            if (nota == 10){
                HayUnDiez = true;
            }

        }while(nota != -1);

        System.out.println("La nota media es " + acumulador / notaMedia);

        if (HayUnDiez){
            System.out.println("Hay un Diez");
                
        }else{
            System.out.println("No hay ningún Diez");
        }

        valorNota.close();
    }
} 

