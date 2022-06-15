import java.io.File;
import java.io.IOException;

public class TransformarImagenTest {
    public static void main(String[] args) {
        File image = new File("./tema6/ficheros/actividades/penyagolosa.bmp");
        TransformarImagen ti = new TransformarImagen(image);
        try {
            ti.transformaNegativo();
            ti.transformaNegroBlanco();
            ti.transformaOscuro();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}