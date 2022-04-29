import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejemplo13 {
    public static void main(String[] args)throws IOException {
        InputStreamReader f_ent = new InputStreamReader(new FileInputStream("f3.txt"));
        OutputStreamWriter f_sal = new OutputStreamWriter(new FileOutputStream("f3_ISO.txt"),"Iso-8859-1");

        int car = f_ent.read();
        while (car != -1){
            f_sal.write(car);
            car = f_ent.read();
        }
        f_sal.close();
        f_ent.close();
    }
}
