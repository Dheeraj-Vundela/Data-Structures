package Maze_DS;

import DataStructures.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2022
 * @author dheerajvundela
 */
public class ArrayListStackTest {
 

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element = null;
        ArrayListStack item = new ArrayListStack();
        item.push(element);
        
        assertEquals(item.size(),1);
        item.push("a");
        assertEquals(item.size(),2);
    }
    

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack item = new ArrayListStack();
        item.push("a");
        try {
            assertFalse(item.isEmpty());
            item.pop();
            assertTrue(item.isEmpty());
        } catch (EmptyCollectionException e) {
            System.out.println("ECE");
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        try {
            System.out.println("peek");
            ArrayListStack item = new ArrayListStack();
            String expected;
            expected = null;
            String result = (String) item.peek();
            assertEquals(expected,result);
        } catch (EmptyCollectionException e) {
            System.out.println("ECE");
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack item = new ArrayListStack();
        boolean expected = true;
        boolean result = item.isEmpty();
        assertEquals(expected,result);

    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack item = new ArrayListStack();
        int expected = 0;
        int result = item.size();
        assertEquals(expected,result);
    }


}
