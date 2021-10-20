import java.util.Scanner;
    public class Ejemplo16 {

        //DECLARACIÓN DE VARIABLES
        public static void main(String argv[]){
            Scanner lector = new Scanner(System.in);
            int x,y;
            int sum,sub,mult,div;

        //EMPIEZA EL PROGRAMA
            System.out.println("Introduce el primer numero");
                x = lector.nextInt();
            System.out.println("Introduce el segundo numero");
                y = lector.nextInt();

            sum = x+y;
            sub = x-y;
            mult = x*y;
            div = x/y;

        String cadena; 
        //Leer la entrada como String
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Dime la operación: ");
        cadena = miScanner.next();
        lector.close();
        miScanner.close();

        char letra = cadena.charAt(0);

        if (letra == '+'){
            System.out.println("sum: " + sum);
        
        }else if (letra == '-'){
            System.out.println("sub: " + sub);
        }else if (letra == '*'){
            System.out.println("mult: " + mult);
        }else if (letra == '/'){
            System.out.println("div: " + div);

        
        }
    }
}
