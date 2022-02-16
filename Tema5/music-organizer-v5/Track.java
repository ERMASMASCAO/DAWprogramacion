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
    // 2º Reinicia el contador a 0 y para incrementarlo en 1
    private int playCount;
    // Almacén de las canciones
    private String album;
    
    

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
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    /*public String getDetails()
    {                                                       // 2º se a añadido album para mostrar de que album es
        return artist + ": " + title + "  (file: " + filename + "  " + album + ")";
    }
    */
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
    // 2º
    public void resetPlayCount(){
        playCount = 0;
    }
    // 2º
    public void incPlayCount(){
        playCount++;
    }
    // 3º
    public String getAlbum(){
        return album;
    }
    // 3º
    public void setAlbum(String album) {
        this.album = album;
    }
    // 5º
    public String toString(){
        return artist + ": " + title + "  (file: " + filename + "  " + album + ")";

    }
}
