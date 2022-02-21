import java.util.Scanner;

/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
   
    private int playCount;

    private String album;






//---------------------------------------------
    private int seconds; // campo creado
//---------------------------------------------------
    
    


    

    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
    }




//----------------metodos incrementar y decrementar------------------------------------
    public void DecrementarSegundos (int decrementar){
        seconds = (seconds - decrementar);
    }
    public void incrementarSegundos (int incrementar){
        seconds = (seconds + incrementar);
    }
//--------------------------------------------------------



    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return album;
    }
          
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }

    public void resetPlayCount(){
        playCount = 0;
    }

    public void incPlayCount(){
        playCount++;
    }

    @Override
    public String toString(){
        return artist + ": " + title +
                "  (file: " + filename + ")" + 
                " " + album;
    }









    //--------------getters y setters y constructor------------------------
    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public Track (int seconds){
        this.seconds = seconds;
    }
}
    
