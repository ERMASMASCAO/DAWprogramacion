package Controles.Control03;

public class Ordenador {

    private String formato;
    private String color;
    private Teclado teclado;
    private Ordenador pcConectado = null;

    

    public Ordenador(String formato, String color, Teclado teclado) {
        this.formato = formato;
        this.color = color;
        this.teclado = teclado;
    }

    public Ordenador(){
        this.formato = "Sobremesa";
        this.color = "Blanco";
        this.teclado = new Teclado();
    }

    // getters y setters
    public String getFormato() {
        return formato;
    }
    public String getColor() {
        return color;
    }
    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public Ordenador getPcConectado() {
        return pcConectado;
    }

    //imprimir
    public void imprimir (){
        System.err.println("Formato: " + this.formato);
        System.out.println("Color: " + this.color);
        this.teclado.print();
        if (pcConectado == null){
            System.out.println("No hay ordenadores conectados");
        }else {
            System.out.println("Ordenador conectado: " + this.pcConectado);
        }
    }

    //coexion con otro pc
    public void conectar(Ordenador pcConectado) {
        if (pcConectado != null){
            this.pcConectado = pcConectado; 
        } 
    }
}