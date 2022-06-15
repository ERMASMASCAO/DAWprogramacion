import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersistenciaCliente2 {
    private List<Cliente> listado;

    public PersistenciaCliente2(List<Cliente> listado) {
        this.listado = listado;
    }

   
    public List<Cliente> getlistado() {
        return listado;
    }

   
    public void write() throws IOException {
       
        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("controles/control04/CLIENTES2.dat"));
                ObjectOutputStream salida = new ObjectOutputStream(writer)) {

            for (int i = 0; i < listado.size(); i++) {
                salida.writeObject(listado.get(i));
            }

            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void read() throws IOException, ClassNotFoundException {
        DataInputStream f = new DataInputStream(new FileInputStream(
                "controles/control04/CLIENTES2.dat"));
        ObjectInputStream entrada = new ObjectInputStream(f);

        while (f.available() > 0) {
            System.out.println(entrada.readObject());
        }
        f.close();
    }
}