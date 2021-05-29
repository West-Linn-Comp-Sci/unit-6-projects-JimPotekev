
/**
 * Write a description of class MusicLibraryClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "One Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);

        myLibrary.add(a1);
        myLibrary.add(a2);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Search for title \"First\"");
        System.out.println("Found Album at index: " + myLibrary.linearSearch("First"));
        
        myLibrary.selectionSort();
        myLibrary.insertionSort();
        
        myLibrary.binarySearch("This Music", "Some Band");
        
        
        
    }
}
