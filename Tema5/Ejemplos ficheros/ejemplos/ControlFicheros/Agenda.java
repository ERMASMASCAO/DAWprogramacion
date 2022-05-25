import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
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

    
    public void imprimirListadoTexto(){
       
       

    public void imprimirListadoObjetos(){

    }
}
