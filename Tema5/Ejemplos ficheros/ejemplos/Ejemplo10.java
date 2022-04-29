import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo10 {
    public static void main(String[] args) throws IOException {
        FileWriter f_out = null;
        String text = "Contenido para el fichero, sin miedo a los caracteres raros: á ç ñ";
        
        try{
            f_out = new FileWriter("f6.txt");
            for (int i = 0; i < text.length(); i++){
                f_out.write(text.charAt(i));
            }

        }finally{
            if (f_out != null){
                f_out.close();
            }
        }
    }
}
