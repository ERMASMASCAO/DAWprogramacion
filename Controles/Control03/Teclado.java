package Controles.Control03;

public class Teclado {
    // Crea una clase teclado con los siguientes atributos privados color numero de teclas conectividad que indica si el teclado es inalambrico o no, idioma representado por dos letras que representan el nombre del pais, formato se toman los valores compacto o exendido. Crea los gettesr y los setters apropiados teniendo en cuenta que una vez creado un teclado no se pueden modificar sus atributos, pero si se pueden leer. Crea tambien un contador que cuente los teclados que se han ido creando en el sistema, crea una clase ordenador con los siguientes atributos privados formato que puede tomar los valores sobremesa o portatil, color y teclado entendiendo por teclado la clase anterior cerar getters y seters teniendo en cuenta que solo el teclado puede ser modificado despues de crear el ordenador. para las dos clases hay que hacer dos constructores de cada clase uno vacio que pone valores por defecto y otro que edite cada atributo que tu pongas. extra: en la clase ordenador crear un metodo que se llame conectar y que recibe como parametro otro ordenador de manera que un ordenador puede estar conectado a otro.

    private String color;
    private int nTeclas;
    private String conectividad;
    private String idioma;
    private String formato;
    private static int nTecladosCreados;


    public Teclado(String color, int nTeclas, String conectividad, String idioma, String formato) {
        this.color = color;
        this.nTeclas = nTeclas;
        this.conectividad = comprobarConectividad(conectividad);
        this.idioma = comprobarIdioma(idioma);
        this.formato = comprobarFormato(formato);
        contador();
    }

    // Teclado predeterminado
    public Teclado(){
        this.color = "Gris";
        this.nTeclas = 88;
        this.conectividad = "Cable";
        this.idioma = "es";
        this.formato = "Extendido";
        contador();
    }

    //getters

    public String getColor() {
        return color;
    }

    public int getnTeclas() {
        return nTeclas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getFormato() {
        return formato;
    }

    public int getnTecladosCreados() {
        return nTecladosCreados;
    }

    //contador de teclado 

    public static void contador(){
        nTecladosCreados++;
    }
    
    // imprimir atributos 
    public void print(){
        System.out.println("Color: "+ this.color);
        System.out.println("Numero de teclas: " + this.nTeclas);
        System.out.println("Conectividad: " + this.conectividad);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Formato: " + this.formato);
        System.out.println("Numero de teclados creados: " + Teclado.nTecladosCreados);
    }

    // comprobar valores 

    private String comprobarConectividad (String conectividad){
        if (conectividad.equalsIgnoreCase("inalambrico") || conectividad.equalsIgnoreCase("cable")){
            return conectividad;
        }else{
            return "cable";
        }
    }

    private String comprobarIdioma (String idioma){
        if (idioma.length() == 2){
            return idioma;
        }
        else{
            return "Es";
        }
    }

    private String comprobarFormato (String formato){
        if (formato.equalsIgnoreCase("compacto") || formato.equalsIgnoreCase("extendido")){
            return formato;
        }else{
            return "extendido";
        }
    }
}