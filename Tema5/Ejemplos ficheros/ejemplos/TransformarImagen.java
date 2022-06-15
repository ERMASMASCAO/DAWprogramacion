import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransformarImagen {
    File f = null;
    public TransformarImagen(File fEnt) {  
        
        if(!fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                
        }
        else {

            f = fEnt;
        }
    }
    public void transformaNegativo() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoNeg.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        int c = 0;
        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write(((char)(255 - c)));
            c = reader.read();
        }

        reader.close();
        writer.close();
    }

    public void transformaOscuro() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoOsc.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        
        int c = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write((char)c/2);
            c = reader.read();
        }

        reader.close();
        writer.close();
    }
    public void transformaNegroBlanco() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File f_Out = new File("./tema6/ficheros/fotos/ficheroFotoBlanNeg.bmp");
        FileOutputStream writer = new FileOutputStream(f_Out);

        byte[] cabecera = new byte[54];
        
        int r = 0;
        int g = 0;
        int b = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        r = reader.read();
        while(r != -1) {
            g = reader.read();
            b = reader.read();

            int media = (r+g+b)/3;

            writer.write((char)media);
            writer.write((char)media);
            writer.write((char)media);

            r = reader.read();
        }

        reader.close();
        writer.close();
        
    }
}