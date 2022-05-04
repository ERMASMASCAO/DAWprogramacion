import java.io.IOException;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class EscribePrimos {
    
    public static void main(String[] args) throws IOException {
        PrintStream salida = new PrintStream(new FileOutputStream("primos.dat"));

        int desde = 2;
        int hasta = 500;
        boolean esPrimo;

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;


            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                salida.println(+ i);
        }
    }
}
}
