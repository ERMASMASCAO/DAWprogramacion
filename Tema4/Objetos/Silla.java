package Tema4.Objetos;
import java.awt.Point;

/*crea una clase Silla que no tiene main ni nada,
atributos de la silla son: el color,numero de patas,si tiene respaldo o no,nivel de comodidad y material (es un String)
además la clase silla tiene un punto que se ubica en una localización llamada habitación (x,y). Definir todos los atributos
como privados, pero desde la clase de test se tienen que poder modificar y acceder a su valor , en la clase de test se tiene que crear 
100 sillas aleatorias.*/

import java.awt.Point;

public class Silla {

    private static final int COORDENADA_MIN = 0;
    private static final int COORDENADA_MAX = 100;
    private static final int PATAS_MIN = 0;
    private static final int PATAS_MAX = 4;
    private static final int COMODIDAD_MIN = 0;
    private static final int COMODIDAD_MAX = 10;

    private static final String [] colores = {"azul", "rojo", "amarillo", "negro", "blanco"};
    private static final String [] materiales = {"plástico", "metal", "madera"};
    
    
    //Atributos de objetos
    private String color; //"Amarillo", "Azul"
    private String material; //"madera", "metal", "plastico"
    private int numPatas; // 0 - 4
    private boolean tieneRespaldo;
    private int comodidad; // 0 - 10
    private Point ubicacion;

    public Silla() {
        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.numPatas = Silla.numPatasAleatorio();
        this.tieneRespaldo = Silla.respaldoAleatorio();
        this.comodidad = Silla.comodidadAleatorio();
        this.ubicacion = Silla.ubicacionAleatorio();
    }

    public static Point ubicacionAleatorio() {
        Point punto = new Point();

        int min = Silla.COORDENADA_MIN;
        int max = Silla.COORDENADA_MAX;

        int x = (int) (Math.random() * (max - min + 1) + min);
        int y = (int) (Math.random() * (max - min + 1) + min);

        punto.setLocation(x, y);

        return punto;
    }

    public static boolean respaldoAleatorio() {
        int min = 0;
        int max = 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        if (aleatorio == 0){
            return false;
        }
        else{
            return true;
        }

    }

    public static int numPatasAleatorio() {
        int min = Silla.PATAS_MIN;
        int max = Silla.PATAS_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public static int comodidadAleatorio() {
        int min = Silla.COMODIDAD_MIN;
        int max = Silla.COMODIDAD_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public Silla(String color, String material,int numPatas, boolean tieneRespaldo, int comodidad, Point ubicacion) {
        this.color = color;
        this.material = material;
        this.numPatas = numPatas;
        this.tieneRespaldo = tieneRespaldo;
        this.comodidad = comodidad;
        this.ubicacion = ubicacion;
    }

    public static String colorAleatorio() {
        int min = 0;
        int max = colores.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
	}

    public static String materialAleatorio() {
        int min = 0;
        int max = materiales.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return materiales[aleatorio];
	}

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    public boolean isTieneRespaldo() {
        return tieneRespaldo;
    }
    public void setTieneRespaldo(boolean tieneRespaldo) {
        this.tieneRespaldo = tieneRespaldo;
    }
    public int getComodidad() {
        return comodidad;
    }
    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }
    public Point getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }

    
}