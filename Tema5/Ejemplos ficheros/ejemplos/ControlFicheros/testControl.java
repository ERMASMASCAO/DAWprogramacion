import java.io.IOException;

public class testControl {
    public static void main(String[] args) throws IOException {
       Agenda agenda = new Agenda();
       agenda.pedirUsuarios();
       agenda.imprimirListadoTexto();
    }
}
