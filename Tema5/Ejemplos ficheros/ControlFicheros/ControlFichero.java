import java.util.ArrayList;
import java.util.List;

/*Crea una aplicacion con las siguientes caracteristicas:
    Una clase PERSONA con los atributos: NIF, NOMBRE Y APELLIDOS
        Estos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases
        El acceso a esos atributos se hace desde los setters y getters adecuados
    Una clase CLIENTE que hereda de PERSONA, con los atributos: ID, NOMBRE, APELLIDOS, NIF, EMAIL
        Dichos atributos no deben ser accedsibles desde fuera de la clase
        Dicho acceso se realizara desde los getters y setters apropiados
    Sobreescribe el metodo toString para mostrar los atributos de forma tabulada
    Crea una clase llamada PERSISTENCIA CLIENTE, con un método write que recibe un arrayList de clientes de 
    tal forma que escribe en un fichero (CLIENTES.DAT) todos los clientes recibidos en el arrayList, cada cliente 
    se escribe en una linea con los atributos separados por , (comas)
    Creamos un metodo llamado READ que recibe el nombre del fichero a leer/cargar y devuleve un arrayList con los 
    clientes que ha conseguido leer.    
*/

public class controlFicheros {
    public static void main(String[] args) {
        List<Cliente> listado = new ArrayList<>();

        Cliente cliente1 = new Cliente("Carmen", "pepa ", "65498496p", "carmen@gmail.com");
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("Marta", "Lopez ", "20452679J", "marta@gmail.com");
        System.out.println(cliente2);

        Cliente cliente3 = new Cliente("Carla", "Caca ", "20782659J", "carla@gmail.com");
        System.out.println(cliente3);

        listado.add(cliente1);
        listado.add(cliente2);
        listado.add(cliente3);

        PersistenciaCliente pCliente1 = new PersistenciaCliente(listado);
        try {
            pCliente1.write();
            pCliente1.read();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getLocalizedMessage());
        }
    }
}