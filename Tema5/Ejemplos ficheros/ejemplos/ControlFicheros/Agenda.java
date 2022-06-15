import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class Agenda {
    
    public void pedirUsuarios(){
        try{
            BufferedWriter f_out = new BufferedWriter(new FileWriter("agenda.dat"));
            Scanner inputUsuario = new Scanner(System.in);
            System.out.println("Nombre:");
            String nombre = inputUsuario.next();
            System.out.println("Apellido:");
            String apellidos = inputUsuario.next();
            System.out.println("Email: ");
            String email = inputUsuario.next();
            System.out.println("Teléfono");
            String telefono = inputUsuario.next();
            Usuario usuario = new Usuario(nombre, apellidos, email, telefono);
            f_out.append(usuario.toString());
            f_out.close();
            inputUsuario.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
    }
<<<<<<< HEAD
=======


>>>>>>> c0cc517069770d4c9691ec705ee5f73cbd394220
    public void imprimirListadoTexto(){
        try {
        BufferedReader f_ent= new BufferedReader (new FileReader("agenda.dat"));  
       String cad = f_ent.readLine();
       System.out.println(cad);
       f_ent.close();
    } catch (Exception e) {
        //TODO: handle exception
    }
    }

    public void imprimirListadoObjetos(){


    }
}
