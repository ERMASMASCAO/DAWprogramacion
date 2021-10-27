package Tema2;
public class ArgumentosSuma {

      public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("Argumentos: " + args.length);
        System.out.println("==============");

        //DECLARACIÓN DE VARIABLES
        int sumar = 0;
          //EMPIEZA EL PROGRAMA

        for (int i = 0; i < args.length; i++) {
            int temp = Integer.parseInt(args [i]);
            sumar = sumar + temp;
        }
        System.out.println(sumar);
    }
}