import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mezcla {
    
    public static void main(String[] args) {
        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader reader1;
        BufferedReader reader2;

        FileWriter f_out;

        try {
            fileReader1 = new FileReader("mezcla1.txt");
            fileReader2 = new FileReader("mezcla2.txt");

            reader1 = new BufferedReader(fileReader1);
            reader2 = new BufferedReader(fileReader2);

            f_out = new FileWriter("finalMezcla.txt");

            String pirmeraLinea = reader1.readLine();
            String segundaLinea = reader2.readLine();

            while (pirmeraLinea != null || segundaLinea != null) {
                if (pirmeraLinea != null) {
                    f_out.write(pirmeraLinea + "\n");
                    pirmeraLinea = reader1.readLine();
                }
                if (segundaLinea != null) {
                    f_out.write(segundaLinea + "\n");
                    segundaLinea = reader2.readLine();
                }
            }
            f_out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
       
    }
}
