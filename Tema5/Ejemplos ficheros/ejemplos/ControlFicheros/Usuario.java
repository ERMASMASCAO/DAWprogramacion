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
        nombre = this.nombre;
        apellidos = this.apellidos;
        email = this.email;
        telefono = this.telefono;
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
    
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.dat"));
        System.out.println ("Por favor introduzca su nombre,apellidos,email y telefono por teclado:");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        bw.write(entradaTeclado);

/*
        System.out.println ("Por favor introduzca su nombre,apellidos,email y telefono por teclado:");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        System.out.println ("\n" + entradaTeclado +"\n");
        entradaEscaner.close();
        */
    }
    
    /*   
        public void pedirUsuario () {
            System.out.println ("Por favor introduzca su nombre,apellidos,email y telefono por teclado:");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in);
            entradaTeclado = entradaEscaner.nextLine ();
            System.out.println ("\n" + entradaTeclado +"\n");
            entradaEscaner.close();
        }
    
    */

    public String toString(){
        
    }
    
    public void guardarAtributos(){

    }

}

