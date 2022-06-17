import java.util.ArrayList;

public class Cliente extends Persona{

    private int id;
    private String email;

    private static int GenerarID = 0;

    public static ArrayList<Cliente> list = new ArrayList<>();

    public Cliente(String nombre, String nif, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.id = GenerarID++;
        this.email = email;
        list.add(this);
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

    public void imprimir(){
        super.imprimirDatos();
        System.out.println("Id:" + "/n" + id);
        System.out.println("Email:" + "/n" + email);
    }
    
}