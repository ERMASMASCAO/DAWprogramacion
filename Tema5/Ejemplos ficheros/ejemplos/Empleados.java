import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Empleados {
    
    public static void main(String[] args)throws IOException {

        DataOutputStream f = new DataOutputStream(new FileOutputStream("Empleados.dat"));

        String [] nombres = {"Andreu","Bernat","Claudia","Damián"};
        int[] departamentos = {10,20,10,10};
        int [] edades = {32,28,26,40};
        double[] sueldos = {1000.0,1200.0,1400.0,1300.0};

        for (int i = 0; i < 4; i++) {
            f.writeInt(i+1);
            f.writeUTF(nombres[i]);
            f.writeInt(departamentos[i]);
            f.writeInt(edades[i]);
            f.writeDouble(sueldos[i]);
        }
        f.close();
    }
}
