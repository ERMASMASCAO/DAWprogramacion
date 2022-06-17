import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class PersistenciaCliente {

    private static final String nombreFichero = "clientes.dat";
    public void write(ArrayList<Cliente> clientes){
        FileWriter escrituraFichero;
        BufferedWriter escribir;
        try {
            escrituraFichero = new FileWriter(nombreFichero);
            escribir = new BufferedWriter(escrituraFichero);
            for (Cliente cliente : clientes) {
                String linea = cliente.getId() + "," +
                                cliente.getNif() + "," +
                                cliente.getNombre() + "," +
                                cliente.getApellidos() + "," +
                                cliente.getEmail() + "\n";
                escribir.write(linea);
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Cliente> read(){
        ArrayList<Cliente> resultado = new ArrayList<>();
        FileReader lectorFichero;
        BufferedReader lector;
        try {
            lectorFichero = new FileReader(nombreFichero);
            lector = new BufferedReader(lectorFichero);
            String linea;
            while ((linea = lector.readLine())!=null){
                String [] parte = linea.split(",");
                Cliente cliente = new Cliente(parte[1], parte[2], parte[3], parte[0]);
                resultado.add(cliente);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}