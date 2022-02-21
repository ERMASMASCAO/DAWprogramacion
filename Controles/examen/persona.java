import java.util.ArrayList;

public class persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String domicilio;
    private ArrayList<personas> personas = new ArrayList<personas>();

    public persona(String nombre,String apellido,int edad, int dni,String domicilio,ArrayList<String> personas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
        personas.add(this);
        System.out.println("nombre: " + " " + nombre + "Apellido: " + " " + apellido + "Edad: " + " " + edad + "DNI: " + " " + dni +  "Domicilio: " + " " + domicilio);
    }
    public persona(){
        nombre = "Maria";
        edad = 25;
        personas.add(this);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void eliminarPersona(nombre){
        for (Persona persona: personas){
            if(persona.getNombre().equals(nombre)){
                personas.remove(persona);
                break;
            }
        }
    }
    public void imprimir (){
        System.out.println("nombre: " + " " + nombre + "Apellido: " + " " + apellido + "Edad: " + " " + edad + "DNI: " + " " + dni +  "Domicilio: " + " " + domicilio);
    }
    @Override
    public String toString() {
        return "persona [apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", edad=" + edad
                + ", nombre=" + nombre + ", personas=" + personas + "]";
    }
    
}
