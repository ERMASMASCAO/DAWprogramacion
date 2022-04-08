import java.io.IOException;

import java.io.FileReader;

public class Ejemplo7 {
    public static void main(String[] args) throws IOException {
        
        FileReader f_in = new FileReader("f1.txt");
        int c = f_in.read();
        while (c != -1) {
            System.out.println((char)c);
            c = f_in.read();
        }
        f_in.close();
    }
}
