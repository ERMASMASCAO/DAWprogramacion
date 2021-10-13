public class WhileFor {

    //DECLARACIÓN DE VARIABLES

    public static void main(String argv[]){
        
        int i;
        //Estructura PARA
        for (i = 0; i < 10; i++) {
            System.out.println("hola:" + 1);
        }
        //Estructura MIENTRAS
        i= 0;

        while(i < 10){
            System.out.println("hola:" + 1);
            i++;
        }
        //Estructura HASTA

        i= 0;

        do {

            System.out.println("Hola:" + i);
            i++;
        }while(i < 10);
   }
}