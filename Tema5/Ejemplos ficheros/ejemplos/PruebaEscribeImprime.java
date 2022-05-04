import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class PruebaEscribeImprime {
    
    public static void main(String[] args) throws IOException {
        PrintStream salida = new PrintStream(new FileOutputStream("PruebaEscribeImprime.txt"));

        int a = 10;
        int b = 2;
        salida.println("Suma = " +( a + b));
        salida.println("Resta = " + (a - b));
        salida.println("Multiplicacion = " + (a * b));
        salida.println("Division = " + (a/b));
        salida.println(10 + a);
        salida.close();
    }
}
