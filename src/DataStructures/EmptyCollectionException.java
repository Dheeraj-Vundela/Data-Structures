package DataStructures;



public class EmptyCollectionException extends Exception {
    /**
     * Constructor or this exception.
     * @param collection - the empty collection
     */
    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }
    
}
