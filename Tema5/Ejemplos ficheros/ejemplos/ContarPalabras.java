import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ContarPalabras {
    
    public static void main(String[] args) throws IOException {
            System.out.println("Uso del programa: ContarPalabras FICHERO PalabrasContar");
        try {
            BufferedReader br = new BufferedReader(new FileReader("PalabrasContar.txt"));
            String palabra = "Hola";
            String parrafo = "";
            int i = 0;
            int repetidas = 0;

            while ((parrafo = br.readLine()) != null ){
                while ((i = parrafo.indexOf(palabra)) != -1) {
                    parrafo = parrafo.substring(i + palabra.length(), parrafo.length());
                    repetidas++;
                }     
            }
            br.close();
            System.out.println("La palabra " + palabra + " aparece " + repetidas + " veces en el fichero.");
        } catch (Exception ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
