public class Media {

    //Atributos de clase:

    private Integer id;
    private String nombre;
    private String contenido;
    private String tipo; //audio video o imagen
    private String usuario;

    private static int idGenerator = 0;

    public Media (Integer id, String nombre, String contenido, String tipo, String usuario){
        this.id = idGenerator++;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
