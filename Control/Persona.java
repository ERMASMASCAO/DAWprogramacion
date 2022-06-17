public class Persona {
    private String nif;
    private String nombre;
    private String apellidos;
    
    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void imprimir(){
        System.out.println("Nif:" + "/n" + nif);
        System.out.println("Nombre:" + "/n" + nombre);
        System.out.println("Apellidos:" + "/n" + apellidos);
    }

    
}