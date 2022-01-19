package Tema4.Objetos;
import java.awt.Point;

/*crea una clase Silla que no tiene main ni nada,
atributos de la silla son: el color,numero de patas,si tiene respaldo o no,nivel de comodidad y material (es un String)
además la clase silla tiene un punto que se ubica en una localización llamada habitación (x,y). Definir todos los atributos
como privados, pero desde la clase de test se tienen que poder modificar y acceder a su valor , en la clase de test se tiene que crear 
100 sillas aleatorias.*/

class Silla{

    // Zona de atributos de las sillas

    private static int totalSillas = 0;     //Cantidad de sillas.

    //Zona de atributos de los objetos.

    private String color;                   //"Amarillo","Rojo".
    private int patas;                      //0 - 100.
    private boolean respaldo;               // "si" o "no".
    private int comodidad;                 // 0 - 10.
    private String material;                //"Madera","Metal","Plastico".
    private Point habitacion;

    //Getters ----> Esto es para que luego en el test podamos utilizar los atributos de los objetos que sean privados.

    public int getComodidad(){
        return comodidad;
    }
    public String getColor(){
        return color;
    }
    public int getPatas(){
        return patas;
    }
    public boolean getRespaldo(){
        return respaldo;
    }
    public String getMaterial(){
        return material;
    }
    public Point getHabitacion(){
        return habitacion;
    }

    //Setters ---> Esto se utiliza para poder modificar los parametros y el this. se utiliza para referirse
    //             al propio objeto y evitar ambigüedades.

    public void setComodidad(int comodidad){
        this.comodidad = comodidad;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }
    public void setrespaldo(boolean respaldo){
        this.respaldo = respaldo;
    }
    public void setmaterial(String material){
        this.material = material;
    }
    public void sethabitacion(Point habitacion){
        this.habitacion = habitacion;
    }

    //Zona de métodos.

    public Silla (String colorSilla, int numeroPatas, Boolean respald, byte lvlComodidad, String tipoMaterial, Point habitación){
        color = colorSilla;
        patas = numeroPatas;
        respaldo = respald;
        comodidad = lvlComodidad;
        material = tipoMaterial;
        habitación = new Point (0,1);

        totalSillas++;
    }
    public Silla(){
        //Crear silla aleatoria
    }
}

