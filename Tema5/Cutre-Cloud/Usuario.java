import java.util.ArrayList;

public class Usuario {
    
    //Atributos de la clase:

    private Integer id;
    private String email;
    private String password;

    //Lista de usuarios
    public static ArrayList<Usuario> list = new ArrayList<>();
    private static int idGenerator = 0;
    
    //Constructor
    public Usuario (String email, String password){
        this.id = idGenerator++;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
