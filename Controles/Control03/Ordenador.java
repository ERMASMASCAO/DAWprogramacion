public class Ordenador {

    public Ordenador (char formato, char color,Teclado teclado){
        this.formato=formato;
        this.color=color;
        this.teclado = teclado;

    }
    private char formato;
    public char getFormato() {
        return formato;
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    private char color;
    private Teclado teclado;
    
}
