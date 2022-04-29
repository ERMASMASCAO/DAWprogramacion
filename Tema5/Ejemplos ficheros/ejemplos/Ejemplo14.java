import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ejemplo14 {
    public static void main(String[] args)throws IOException {
        BufferedReader f_ent = new BufferedReader(new FileReader("f3.txt"));
        PrintWriter f_sal = new PrintWriter(new OutputStreamWriter(new FileOutputStream("f3_ISO.txt"),"ISO-8859-1"));

        String cad = f_ent.readLine();
        while (cad != null){
            f_sal.println(cad);
            cad = f_ent.readLine();
        }
        f_sal.close();
        f_ent.close();
    }
}