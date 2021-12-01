package Tema3.Array;

public class Iguales {
    
    public static void main(String[] args) {
        int [] primero = {1,2,3,4,5,6,7};
        int [] segundo = {1,2,3,4};
        boolean iguales = true;

        if (primero == segundo){
            System.out.println("Son iguales");
        }else{
            for (int i = 0; i < segundo.length; i++) {
                if (primero[i] != segundo[i]) {
                    iguales = false;
                    break;
                }
            }
            if (iguales) {
                System.out.println("Son iguales");
            }else{
                System.out.println("No son iguales");
            }
        }
    }
}
