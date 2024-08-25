package Maze_DS;
import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 * @version Fall 2022
 * @author dheerajvundela
 * @param <T>
 */
public class ArrayListStack<T>  implements StackADT<T> {
    
        
    private final ArrayList<T> list;     

    /**
     * Default constructor of ArrayListStack object.
     */
    public ArrayListStack() {
        list = new ArrayList<>();
    }
            
      
  
    @Override
    public void push(T element) {
        list.add(0,element);
    
    }
    
    
    @Override
    public T pop() throws EmptyCollectionException {
        if (!isEmpty()) {
            T result = (T)list.get(0);
            list.remove(0);
            return result;
        } else {
            throw new EmptyCollectionException("ECE");

        }

    }

    
    
      
    
    @Override
    public T peek()throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("ECE");
        } else {
            T result = (T) list.get(0);
            return result;
        }
    }
    
    

    @Override
    public boolean isEmpty() {
        return list.isEmpty();

    }

    @Override
    public int size() {
        if (list == null) {
            throw new UnsupportedOperationException("Not supported yet.");
        } else {
            return list.size();
        }
    }

    @Override
    public String toString() {
        return "ArrayListStack{" + "list=" + list + '}';
    }

   
      
    
    
}
