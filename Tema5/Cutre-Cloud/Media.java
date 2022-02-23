public class Media {

    //Atributos de clase:

    private Integer id;
    private String nombre;
    private String contenido;
    private String tipo; //audio video o imagen
    private String usuario;

    public void Media (Integer id, String nombre, String contenido, String tipo, String usuario){
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario = usuario;
    }
    
}
