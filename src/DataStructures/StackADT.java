package DataStructures;

/**
 * @version Fall 2022
 * @author dheerajvundela
 * @param <T>
 */

public interface StackADT<T> extends CollectionADT {
    
    /**
     * Adds the specified element to the top of the stack.
     * @param element element to be pushed onto the stack
     */
    public void push(T element);
    
    /**
     * Removes and returns the element that is on top of the stack.
     * @return the element removed from the stack
     * @throws EmptyCollectionException if no items on the stack
     */
    public T pop() throws EmptyCollectionException;
    
    /**
     * Returns (without removing) the element that is on top of the stack.
     * @return the element on top of the stack
     * @throws EmptyCollectionException if no items on the stack
     */
    public T peek()throws EmptyCollectionException;
    
}
