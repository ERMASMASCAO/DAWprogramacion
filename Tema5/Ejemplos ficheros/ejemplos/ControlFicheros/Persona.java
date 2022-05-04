public class Persona {
    
    //Zona atributos de objeto
    
    protected String nif;
    protected String nombre;
    protected String apellidos;
    
    //Zona de constructor
    public Persona (String numeroIdentificacionFiscal, String nombrePersona, String apellidosPersonas) {
        nif = numeroIdentificacionFiscal;
        nombre = nombrePersona;
        apellidos = apellidosPersonas;

        
    }

    //Zona de getters y setteres
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

    //Varios
    public static void main (String[] ar){
        Persona persona1 = new Persona("20912114P", "Daniel", "Prieto Cano");
        System.out.println(persona1);
    }
    public String toString(){
        return  "\t\n- Nombre:  " + nombre + "\t\n- Apellidos:  " + apellidos + "\t\n- NIF:  " + nif;
    }

}
