package Tema4.Objetos;
import java.awt.Point;

public class SillaTest{

    public static void main (String[] args){

        //Creas una nueva silla llamada s1
        Silla s1 = new Silla();

        //Getters
        System.out.println(s1.getComodidad());

        //Setters
        s1.setComodidad(10);;
        s1.setColor("Rojo");
        s1.setPatas(4);
        s1.sethabitacion(new Point(0,1));
        s1.setmaterial("Madera");
        s1.setrespaldo(true);

        //Creas una nueva silla llamada s2
        Silla s2 = new Silla ();

        //Getter
        System.out.println(s2.getComodidad());


        //Setters
        s2.setComodidad(5);;
        s2.setColor("Amarillo");
        s2.setPatas(2);
        s2.sethabitacion(new Point(0,2));
        s2.setmaterial("Metal");
        s2.setrespaldo(false);

        //Creas una nueva silla llamada s3
        Silla s3 = new Silla ();

        //Getters
        System.out.println(s1.getComodidad());


        //Setters
        s3.setComodidad(7);;
        s3.setColor("Verde");
        s3.setPatas(10);
        s3.sethabitacion(new Point(0,3));
        s3.setmaterial("Plástico");
        s3.setrespaldo(true);

    }
}