import java.util.ArrayList;

public class BaseDeDatos {

    //Usuario
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void añadirUsuario(Usuario usuario1){
        usuarios.add(usuario1);
    }

    //Media:
    ArrayList<Media> medias = new ArrayList<>();

    public void añadirMedias(Media media1){
        medias.add(media1);
    }

    //General:

    public interface ParserXML {
        public void generateXML();
    }




    
}
