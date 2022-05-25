import java.io.BufferedReader;
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
public class Usuario {
    
    //Zona atributos de objeto
    protected String nombre;
    protected String apellidos;
    protected String email;
    protected String telefono;
        
    

    //Zona de constructor
    public Usuario (String nombre, String apellidos, String email, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return nombre + "\t" + apellidos + "\t" + email + "\t" + telefono;
    }
    
    public void guardarAtributos(){

    }

}

