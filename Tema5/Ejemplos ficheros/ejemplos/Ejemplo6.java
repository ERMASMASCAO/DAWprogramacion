import java.io.FileInputStream;
import java .io.FileOutputStream;
import java.io.IOException;

public class Ejemplo6 {
    
    public static void main(String[] args) throws IOException{
        FileInputStream f_in = new FileInputStream("./archivos de ejemplo/f3.txt");
        FileOutputStream f_out = new FileOutputStream("./archivos de ejemplo/f5.txt");

        byte[] buffer = new byte [30];
        int num= f_in.read(buffer);
        while (num != -1) {
            f_out.write(buffer,0,num);
            num= f_in.read(buffer);
        }
        f_in.close();
        f_out.close();
    }
}
