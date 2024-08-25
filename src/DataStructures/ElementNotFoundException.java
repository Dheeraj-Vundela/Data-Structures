package DataStructures;

/**
 * An Element Not Found Exception class
 * Exception handler for when an element isn't in a collection
 */
public class ElementNotFoundException extends Exception {
    /**
     * Constructor for this exception.
     * @param el - the element not found in the collection
     */
    public ElementNotFoundException(String el) {
        super("The element " + el + "was not found in the collection.");
    }
    
}
