package stack;
import list.*;
/**
 * LIFO data structure.
 * 
 * @author Peter Singley
 * @version 91814
 */
public interface StackADT<E>
{
    /**
     * put a value on "top" of the stack
     * @return the value pushed.
     * 
     */

    E push(E value);

    /**
     * remove the "top" value from the stack.
     * @return the value removed.
     * Pre: must have something in the stack, can not be empty.
     * 
     */
    E pop();

    /**
     * @return the "top" element from the stack.
     * Pre: must have something in the stack, can not be empty.
     */

    E peek();

    /** @return true only if this Stack is empty */

    public boolean isEmpty( );

    /** Clear this stack, to make it an empty stack */

    public void clear( );

    /** @return This Stack as a String */
    public String toString( );

    /** @return true only if this Stack is equal to the given obj */

    public boolean equals (Object obj);

}
