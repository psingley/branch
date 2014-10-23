package list;

/**
 * Iterate forward and backward over a list.
 * 
 * Functions as a cursor between two elements. 
 * Can arrive between, before first, or after last elements.
 * 
 * @author Peter Singley 
 * @version (9/18/14)
 */
public interface ListIterator<E> extends Iterator<E>
{

    /**
     * @return true if there is a previous element.
     */
    boolean hasPrevious();

    /**
     * @return the value before the cursor. Update the cursor.
     * Pre: hasPrevious() is true.
     */
    E previous();

    /**
     * May be called once per call to next() or remove().
     * Removes the last element returned by a call to next() or previous ().
     */

    void remove();

    /** Add the given value at the cursor position in the List being iterated through. A subsequent call to next( ) would be unaffected, and a subsequent call to previous( ) would return the new element.*/

    public void add (E value);

    
}
