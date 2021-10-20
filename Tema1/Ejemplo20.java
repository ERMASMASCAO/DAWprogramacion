import java.util.Scanner;
public class Ejemplo20 {

    public static void main(String [] args ) {
    
        //DECLARACIÓN DE VARIABLES
        Scanner lector;
        lector = new Scanner(System.in);
        double precio;
        double descuento;
        lector.close();


        //INICIO DEL PROGRAMA
        System.out.println("Introduce el precio");
        precio = lector.nextDouble();
        //Si el precio es menor de 6€ no se aplica ningún descuento
        if (precio < 6) {
            descuento = 0;
        System.out.println(descuento);
        //Si es mayor o igual a 6 euros  y menos de 60 €, se aplica un 5% de descuento
        }else if ((precio >= 6) && (precio <= 60)){
            descuento = (precio - 0.05f);
            System.out.println(descuento);
        //si es mayor o igual a 60 € se aplica  un 10% de descuento
        }else if (precio >= 60){
            descuento = (precio - 0.1f);
            System.out.println(descuento);


        }
    }
}
