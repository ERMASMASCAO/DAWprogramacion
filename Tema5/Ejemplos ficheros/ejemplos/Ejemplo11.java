import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Ejemplo11 {
    public static void main(String[] args) throws IOException {
        
        PrintStream f_out = new PrintStream(new FileOutputStream("f7.txt"));

        float a = (float) 5.25;
        String b = "Hola.";
        f_out.println(b);
        f_out.println("¿Qué tal?");
        f_out.println (a + 3);
        f_out.printf("El número %d en hexadecimal es %x", 27, 27);

        f_out.close();
    }
}
