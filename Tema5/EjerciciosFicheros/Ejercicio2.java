import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class Ejercicio2{
    public static void main(String[] args) {
        
        //Abre el directorio padre '/'
        Scanner opcionesUsuario = new Scanner (System.in);
        File f = new File("/");
        System.out.println("---------------------------------------------------");
        System.out.println("Lista de ficheros y directorios del directorio : /");
        System.out.println("---------------------------------------------------");

        //Imprimir directorio padre
        System.out.println("0.- Directorio padre");

        // Imprimir lista de ficheros empezando desde el 1
        int enumerador = 1;
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        do {
        for (File e : f.listFiles()) {
            String flags = "";
            if (e.isDirectory()) {
                flags += "d";
            } else {
                flags += "-";
            }
            if (e.canRead()) {
                flags += "r";
            } else {
                flags += "-";
            }
            if (e.canExecute()) {
                flags += "w";
            } else {
                flags += "-";
            }
            if (e.canWrite()) {
                flags += "x";
            } else {
                flags += "-";
            }
            enumerador++;
            System.out.println(enumerador + ".- \t" + flags + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
        }        
        String opcion = "";
        switch (opcion = opcionesUsuario.next()) {
            case "-1":
                f = new File("");
                break;
            case "0":
                f = File.listRoots()[0];
                break; 
            default: 
                f = File.listRoots()[0].listFiles()[Integer.parseInt(opcion)];
                break;
        }       
        System.out.println("Intorduce -1 para salir");
        } while (f.exists());
        opcionesUsuario.close();
    }
}

