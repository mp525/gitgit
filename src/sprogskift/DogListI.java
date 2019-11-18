package sprogskift;

import java.util.ArrayList;

/**
 *
 * @author Mathias
 */
public interface DogListI {
    public ArrayList<Dog> dogList(String sourceName);
    public void printList(int limit);
    
}
