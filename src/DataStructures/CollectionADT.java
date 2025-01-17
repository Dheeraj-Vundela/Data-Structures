package DataStructures;

/**
 * @version Fall 2022
 * @author dheerajvundela
 * @param <T>
 */
public interface CollectionADT<T> {
    
    /**
     * Returns true if the collection contains no elements.
     * @return true if the collection is empty
     */
    public boolean isEmpty();
    
    /**
     * Returns the number of elements in the collection.
     * @return the number of elements as an int
     */
    public int size();
    
    /**
     * Returns a string representation of the collection.
     * @return a string representation of the collection
     */
    @Override
    public String toString();
}
