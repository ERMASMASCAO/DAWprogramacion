import java.util.ArrayList;

public class Media {

    //Atributos de clase:

    private Integer id;
    private String nombre;
    private String contenido;
    private MediaType tipo; //audio video o imagen
    private int usuario;

    public static ArrayList<Media> list = new ArrayList<>();
    private static int idGenerator = 0;

    public Media (Integer id, String nombre, String contenido, MediaType tipo, int usuario){
        this.id = idGenerator++;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;
        list.add(this);
    }
    
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
