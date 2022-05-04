import java.io.FileReader;
import java.io.IOException;

public class LeePrimos {
    
    public static void main(String[] args) throws IOException {

        FileReader lectorDeArchivo = new FileReader("primos.dat");
        char [] buffer = new char [30];
        int n = lectorDeArchivo.read(buffer);
        while (n != -1){
            for (int i = 0; i <n; i++) 
                System.out.println(buffer[i]);
            System.out.println("");
            n = lectorDeArchivo.read(buffer);
        }
        lectorDeArchivo.close();
    }
}
