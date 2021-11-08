import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {
        
        //DECLARACIÓN DE VARIABLES

        int contador,numero;
        char [] mi_matriz = new char [21];
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        mi_matriz [0] = 100;
        mi_matriz [1] = 100;
        mi_matriz [2] = 100;
        mi_matriz [3] = 100;
        mi_matriz [4] = 100;
        mi_matriz [5] = 100;
        mi_matriz [6] = 100;
        mi_matriz [7] = 100;
        mi_matriz [8] = 100;
        mi_matriz [9] = 100;
        mi_matriz [10] = 100;
        mi_matriz [11] = 100;
        mi_matriz [12] = 100;
        mi_matriz [13] = 100;
        mi_matriz [14] = 100;
        mi_matriz [15] = 100;
        mi_matriz [16] = 100;
        mi_matriz [17] = 100;
        mi_matriz [18] = 100;
        mi_matriz [19] = 100;
        mi_matriz [20] = 100;

        //EMPIEZA EL PROGRAMA

        while (contador < 9){
            System.out.println("Introduce los números de su dni para calcular la letra de su DNI");
            numero = valorEntrante.nextInt();
            
        }
        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("La letra de su DNI es " + i + " = " + mi_matriz[i]);
            valorEntrante.close();
            
        }


    }
    
}
