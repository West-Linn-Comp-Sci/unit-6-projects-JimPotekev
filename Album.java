
/**
 * Write a description of class Album here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Album
{
    private String name;
    private String artist;
    private int songNum;
    private double length;
    public Album(String name, String artist, int songNum, double length){
        this.name = name;
        this.artist = artist;
        this.songNum = songNum;
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    public int getNumSongs(){
        return songNum;
    }
    
    public String getName(){
        return name;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String toString(){
        return "Song name: " + name + "\n" + "Artist: " + artist + "\n" + "Number of song: " + songNum + "\n" + "Total play time: " + length + "\n";
    }
}
