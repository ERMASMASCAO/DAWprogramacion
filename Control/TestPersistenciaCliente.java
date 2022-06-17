import java.util.ArrayList;

public class TestPersistenciaCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("6541651p", "Dani", "Prieto", "4");
        Cliente c2 = new Cliente("984621l", "Pepe", "Cano", "5");
        Cliente c3 = new Cliente("9632199ñ", "Raul", "Sanchez", "7");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        PersistenciaCliente persistencia = new PersistenciaCliente();
        persistencia.write(clientes);
        clientes = persistencia.read("clientes.dat");
    }
}