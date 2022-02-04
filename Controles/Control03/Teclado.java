/*
En vuestro repositorio en la carpeta controles un archivo llamado control03, crea un clase teclado con los siguientes atributos
privados (color,numero de teclas,conectividad que indica si el teclado es inalambrico o va por cable, idioma representado que marca
el codigo del país,formato que puede tener dos valores que son compacto o extendido).Crea los getters y los setters apropiados teniendo
en cuenta que una vez creado un objeto de tipo teclado no se puede modificar sus atributos, pero si se pueden leer, crea también un contador
que te deje saber cuantos teclados se han creado.Crea una classe ordenador con los siguientes atributos privados (formato que puede tomar los valores
"sobre mesa o portatil",color,y teclado de la clase anterior) crea los getters y setters pertinentes teniendo en cuenta que solo el teclado puede ser 
modificado después de crear ordenador.para las dos clases debes crear dos constructores uno sin parametros y otro en el que si que se especifican
unos valores en concreto. EXTRA --> en la clase ordenador crear un metodo que se llame conectar y que recibe por parametro otro ordenador de manera
que un ordenador puede estar conectado a otro.
*/

public class Teclado{

    private static int totalTeclados = 0;

    private String color;
    private int numTeclas = 100;
    private String conectividad;
    private String formato;
    private String idioma;

    public Teclado(String color,int numTeclas,String connectividad,String formato, String idioma){
        this.color=color;
        this.numTeclas=numTeclas;
        this.conectividad=connectividad;
        this.formato=formato;
        this.idioma=idioma;
        totalTeclados++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getNumTeclas(){
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas){
        this.numTeclas = numTeclas;
    }

    public String formato (){
        return formato;
    }

    public void setformato (String formato ){
        this.formato = formato;
    }

    public String idioma(){
        return idioma;
    }

    public void setidioma (String idioma){
        this.idioma = idioma;
    }

    public String connectividad(){
        return conectividad;
    }

    public void setConnectividad(){
        this.conectividad = conectividad;
    }

    public Teclado (){
        color = "verde";
        numTeclas = 100;
        conectividad = "inalambrico";
        formato = "compacto";
        idioma = "ES";
        totalTeclados++;
    }
    public Teclado1 (){

    }
}
