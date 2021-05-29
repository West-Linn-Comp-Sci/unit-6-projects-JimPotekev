/**
 * Write a description of class MusicLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibrary
{
    private Album[] library;
    private double totalTime;
    private int numTracks;
    private int index;
    public MusicLibrary(){
        library = new Album[10];
        totalTime = 0;
        numTracks = 0;
        index = 0;
    }
    
    public void doubleSize(){
        Album[] newLibrary = new Album[library.length * 2];
        for(int i = 0; i < library.length; i++){
            newLibrary[i] = library[i];
        }
        library = newLibrary;
    }
    
    public void add(Album album){
        if(index == -1){
            System.out.println("Library is full");
        }
        else{
            library[index] = album;
            numTracks += album.getNumSongs();
            totalTime += album.getLength();
            int n;
            for(n = 0; n < library.length; n++){
                if(library[n] == null){
                    index = n;
                    break;
                }
            }
            if(n == library.length)
            index = -1;
        }
    }
    
    public void remove(int index){
        numTracks -= library[index].getNumSongs();
        totalTime -= library[index].getLength();
        library[index] = null;
    }
    
    public String toString(){
        String result = "Number of tracks: " + numTracks + "\n" + "Total play time: " + totalTime + "Mintues \n" + "Size of library: " + library.length + "\n" + "Albums " + "\n\n";
        for(int i = 0; i < library.length; i++){
            if(library[i] != null)
                result += library[i] + "\n\n";
        }
        return result;
    }
    
    public int linearSearch(String title){
        for(int i = 0; i < library.length; i++){
            if(library[i].getName().equals(title)){
                return i;
            }
        }
        return -1;
    }
    
    public void selectionSort(){
        for ( int j=0; j < library.length-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < library.length; k++ ){
                if ( library[k].getName().compareTo( library[min].getName() ) < 0 ){
                    min = k;
                }  
            }
            Album temp = library[j];
            library[j] = library[min];
            library[min] = temp;
        }
    }
    
    public void insertionSort(){
        for(int i = 1; i < library.length; i++){
            Album key = library[i];
            int position = i;

            while (position > 0 && key.getArtist().compareTo(library[position - 1].getArtist()) > 0){
                library[position] = library[position - 1];
                position--;
            }
            library[position] = key;
        }

    }
    
    public int binarySearch(Album tarName, Album tarArtist){
        int low = 0, high = library.length-1, middle = (low + high)/2;
  
        while (library[middle].getName() != tarName.getName() && library[middle].getName() != tarArtist.getArtist() && low <= high){
            if (tarName.getName().compareTo(library[middle].getName()) > 0 && tarArtist.getArtist().compareTo(library[middle].getArtist()) > 0){
                high = middle - 1;
            }
             else{
                 low = middle + 1;
                 middle = (low + high)/2;
            }
        }
        
        if (library[middle].getName().equals(tarName.getName()) && library[middle].getArtist().equals(tarArtist.getArtist()))
            return middle;
        else{
            return -1;
        }
    }
}
