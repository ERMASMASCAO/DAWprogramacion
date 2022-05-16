public import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RecuperacionDatosEmpleados2 {
    
    public static void main(String[] args) throws IOException{

        RandomAccessFile f = new RandomAccessFile("Empleados.dat","r");

            f.seek(56);
            System.out.println("Número: "+ f.readInt());
            System.out.println("Nombre: "+ f.readUTF());
            System.out.println("Departamento: "+ f.readInt());
            System.out.println("Edad: "+ f.readInt());
            System.out.println("Sueldo: "+f.readDouble());
            System.out.println();
            f.close();
    }
}
