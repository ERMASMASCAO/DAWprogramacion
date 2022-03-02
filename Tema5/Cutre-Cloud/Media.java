import java.util.ArrayList;
import java.util.Iterator;
public class Media {

    //Atributos de clase:

    private Integer id;
    private String nombre;
    private String contenido;
    private MediaType tipo; //audio video o imagen
    private int usuario;

    public static ArrayList<Media> list = new ArrayList<>();
    private static int idGenerator = 0;

    //Constructor
    public Media (Integer id, String nombre, String contenido, MediaType tipo, int usuario){
        this.id = idGenerator++;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;
        list.add(this);

        if (this.esNombreDisponible(nombre)){
            this.nombre = nombre;
            list.add(this);
        }else{
            this.nombre = "Nombre duplicado: " + nombre;
        }
        list.add(this);
    }

    private boolean esNombreDisponible(String nombre){
        boolean resultado = true;

        for (Media media : list){
            if(nombre.equals(media.getNombre())){
                resultado = false;
                break;
        }
    }
        return resultado;
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

    public void eliminarUnMedia(String nombre){
        for (Media item : list){
            item.nombre.equals(nombre);
            if (item.nombre.equals(nombre)) {
                list.remove(item);
            break;
            }
        }
    }

    public void eliminartodosMedia(MediaType tipo){
        Iterator <Media> it = list.iterator();  //it es iterator
        while(it.hasNext()) {
            Media medias = it.next();
            if(medias.getTipo().equals(tipo)) {
                it.remove();
            }
        }
    }
    public String generateXML(){
        String resultado = "";

        resultado += "<Media>";
        resultado += "<nombre>" + this.nombre + "</nombre>";
        resultado += "<contenido>" + this.contenido + "</contenido>";
        resultado += "<tipo>"  + this.tipo + "</tipo";
        resultado += "<usuario"  + this.usuario + "</usuario>";
        resultado += "</Usuario>";

        return resultado;
    }
}