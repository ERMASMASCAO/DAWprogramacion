package ProyectoNetwork;

import java.util.ArrayList;
import java.util.List;

public class publicacionesDeTexto {

    //Detalles que queremos almacenar:

    private String nomUsuAutor;
    private String txtMensage;
    private String instPublicacion;
    private int meGustas = 0; //Sontador
    private ArrayList<String> comentariosDeUsuarios;

    //Constructor
    public publicacionesDeTexto(){

        System.out.println("Usuario: " + nomUsuAutor + " " + "Mensaje: " + " " + txtMensage + " " + "Instantanea: " + " "+ instPublicacion + "MG: " + meGustas + " " + " Comentarios: " + comentariosDeUsuarios);
    }
}
