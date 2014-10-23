package list;
/**
 * 
 * 
 */
public interface List <E>
{
    /** @return size of the List.
     */
    int size();

    /** Add a value at the end of this list
     */
    void add(E value);

    /** Insert the value at position ndx (Index/Position) in this List.
     * @param 0 <= ndx <= size
     */
    void add(int ndx, E value);

    /** @return value at the given position.
     * @param 0 <= ndx < size
     */

    E get(int ndx);

    /** @returns the old value at ndx
     * change the value at position ndx to given value.
     * @param 0 <= ndx < size
     */
    E set(int ndx, E value);

    /** Remove value at given position
     * @Returns value removed
     * @param 0 <= ndx < size
     */
    E remove(int ndx);

    /** Makes the list empty
     */
    void clear();

    /** @returns true only if this list is empty
     */
    boolean isEmpty();

    /** @return the postion of the first occurrence of the value in this List, or -1 if not found */

    int   indexOf  (Object value);

    /** @return true only if value is contained in this List */

    boolean contains (Object value);

    /** @return the elements of this List as a String  enclosed in square brackets:
    [a,b,c]
     */
    String toString( );

    /** @return true only if this List is equal to the parameter, other */
    boolean  equals (Object other);

    Iterator<E> iterator();

    /** @return true if this List contains at least two equal elements */

    boolean hasDuplicate( ) ;

    /**
     * @return a ListIterator for this List
     */

    public ListIterator<E> listIterator();

    /**
     * @return a ListIterator with ndx as cursor starting position
     * Pre: 0<=ndx<=size
     */
    public ListIterator<E> listIterator(int ndx);

  

}
