import java.util.Scanner;

public class Ejemplo17 {
    
    
    
    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        Scanner lector = new Scanner(System.in);
        int mes;
        mes = lector.nextInt();

        //EMPIEZA EL PROGRAMA
        lector.close();
        
        switch (mes){
        // TODOS ESTOS CASOS QUIERE DECIR QUE TIENEN 31 DÍAS
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 días  :  ");
                break;
        // TODOS ESTOS CASOS QUIERE DECIR QUE TIENEN 28 DÍAS
            case 2:
                System.out.println("Este mes tiene 28 días  :  ");
                break;
        // TODOS ESTOS CASOS QUIERE DECIR QUE TIENEN 30 DÍAS
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 días  :  ");
                break;

        }
        
    }
        
}
