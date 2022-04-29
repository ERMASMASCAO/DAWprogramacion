public class Cliente extends Persona{
    

    //Zona atributos de objeto
    private int id;
    private String email;

    public Cliente (int identificador,String emailCliente,String nif,String nombre,String apellidos) {
        super(nif, nombre, apellidos);
        id  = identificador;
        email = emailCliente;

        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main (String[] ar){
        Persona persona2 = new Cliente(12, "alupri0338@ieselcaminas.org", "20912114P", "Daniel", "Prieto acano" );
        System.out.println(persona2);
    }
    public String toString(){
        return super.toString() + "\t\n- ID: " + id + "\t\n- Email: " + email;
    }
}
