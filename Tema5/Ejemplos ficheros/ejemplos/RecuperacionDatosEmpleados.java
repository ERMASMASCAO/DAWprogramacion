import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RecuperacionDatosEmpleados {
    
    public static void main(String[] args) throws IOException{

        DataInputStream f = new DataInputStream (new FileInputStream("Empleados.dat"));

        while (f.available()>0) {
            System.out.println("Número: "+ f.readInt());
            System.out.println("Nombre: "+ f.readUTF());
            System.out.println("Departamento: "+ f.readInt());
            System.out.println("Edad: "+ f.readInt());
            System.out.println("Sueldo: "+f.readDouble());
            System.out.println();
        }
        f.close();
    }
}
