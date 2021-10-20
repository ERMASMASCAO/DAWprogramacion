import java.util.Scanner;
public class Ejemplo19 {

    public static void main(String [] args ) {

        //DECLARACIÓN DE VARIABLES
        Scanner lector;
        lector = new Scanner(System.in);
        int horas;
        double precio;
        double bruto;
        double impuestos;

        //INICIO DEL PROGRAMA
        
        System.out.println("Introduce el precio por hora ");
        precio = lector.nextInt();

        System.out.println("Introduce el número de las horas ");
        horas = lector.nextInt();
        lector.close();
       

        if (horas <= 35) {
            bruto = horas * precio;
        } else {
            //Las primeras 35 se pagan normal
            bruto = 35 * precio;
            //Las siguientes horas se pagan a 1,5 veces el precio
            bruto = bruto + ((horas - 35) * precio * 1.5);
            //Los primeros 500 € son libres de impuestos.
        }

        if (bruto <= 500){
            impuestos = (bruto - 500) * 0.25f;
            System.out.println(impuestos);
        //Si cobra hasta 900 tiene un impuesto de el 25% si sobre pasa los 900 el resto tiene un impuesto del 45%
        }else {
            impuestos = (400 * 0.25f) + (bruto - 900) * 0.45f;
        }
            
    }
}

