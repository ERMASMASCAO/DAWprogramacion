import java.util.ArrayList;
import java.util.Iterator;
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

        if (this.estaDisponible(email)){
            this.email = email;
            list.add(this);
        }else{
            this.email = "Correo duplicado: " + email;
        }

        list.add(this);
    }
    //metodo para saber si un email está repetido
    private boolean estaDisponible (String email){
        //se crea boolean para decir si si o si no
        boolean resultado = true;
        //con el for each recorremos el array Usuario x el objeto usuario por el array list
        for (Usuario usuario : list) {
            //Si el email es igual a el otro email es falso
            if (email.equals(usuario.getEmail())){
                resultado = false;
                break;
            }
        }
        return resultado;
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
    
    public void eliminarUsuario(String email){
        for (Usuario item : list){
            item.email.equals(email);
            if (item.email.equals(email)){
                list.remove(item);
            break;
            }
        }
    }
    public void eliminarTodosLosDominios(String email){

        Iterator<Usuario> it = list.iterator();
         while (it.hasNext()){
            Media list = Iterator.next();

            if (list.tipo.equals(type)){
                Iterator.remove();
         }
    }
}


    public String generateXML(){
        String resultado = "";

        resultado += "<Usuario>";
        resultado += "<idGenerator>" + this.idGenerator + "</idGenerator>";
        resultado += "<email>" + this.email + "</email>";
        resultado += "<password>" + this.password + "</password>";
        resultado += "</Usuario";

        return resultado;
    }                                                                                                                                                                            //  <id>
}
