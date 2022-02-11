package Tema5;
import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizerV2
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayerV3 player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizerV2()
    {
        files = new ArrayList<>();
        player = new MusicPlayerV3();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
    // 1º Usando el bucle for-each implementa el método listAllFiles que imprima el nombre de todas las canciones.
    public void listAllFiles()
    {
        for (String recorre : files)
        {
            System.out.println("El nombre de todas las canciones són: "+ recorre);
        }
    }
    // 2º Añade el método listMatching(String match) que liste sólo aquellas canciones que contengan la cadena match. Si no encuentra ninguna, debe mostrar un mensaje indicándolo.
    public void listMatching (String match)
    {
        boolean encontrado= false;

        ArrayList<String> canciones = getMatching(match);

        int contador = 0;
        for (String filename : files)
        {
            System.out.println(canciones);
            encontrado = true;
        }
        if(getMatching(match).size() == 0){
            System.out.println("No se ha encontrado ninguna cancion");
        }
    }
    // 3º Añade el método playmatching(String match) que, además de imprimir el nombre de la canción, reproduzca un ejemplo de la misma  usando el método playSample.
    public void playmatching(String match)
    {
        ArrayList<String> canciones = getMatching(match);
        for (String cancion : canciones)
        {
            System.out.println(cancion);
            player.playSample(cancion);
        }
    }
    // 4º Crea un método getMatching(String match) que devuelva una colección (ArrayList) con todas las canciones que contengan la cadena match.
    public ArrayList<String> getMatching(String match)
    {
        ArrayList <String> resultado = new ArrayList<>();
        
        for (String cancion : files)
        {
            if (cancion.contains(match))
            {
                resultado.add(cancion);
            }
        }
        return resultado;
    }
    // 5º Modifica 'listMatching' y 'PlayMatching' para que usen el nuevo método getMatching.

    // 6º Escribe un método findFirst(String searchString) que devuelva el índice de la primera canción que coincida con la cadena buscada. Si no la encuentra, debe devolver -1. El bucle debéis realizarlo con un while sin usar iteradores
    //imprime todos los elemnetos utilizando un while
    public int findFirst(String match)
    {
        int indice = 0;
        int resultado = -1;
        while (indice < files.size()) {
            if (files.get(indice).contains(match)){
                resultado = indice;
                break;
            }
            else
            {
                indice++;
            }
        }
        return indice;
    }
}

   