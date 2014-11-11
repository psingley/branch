package set;
import list.*;

/**
 * Write a description of class Set here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Set<E>
{
    /**
     * add the given value to this Set
     * @return true if added
     */

    boolean add(E value);

    /**
     * @return number of values in this Set
     */
    int size();

    /**
     * make this Set empty
     */
    void clear();

    /**
     * @return true if this set is empty
     */
    boolean isEmpty();

    /**
     * @return true if given obj is in this Set
     */
    boolean contains(Object obj);
    
    /**
     * Obj is removed if possible
     * @return true if removed
     */
    boolean remove(Object obj);
    
    /**
     * return this Set as a string.
     */
    String toString();
    
    /**
     * Compare this Set with obj and determine if they are equivalent
     */
    boolean equals (Object obj);
    
    /**
     * return a hashcode of this Set
     */
    int hashCode();
   
    /**
     * Iterator functionality for this Set
     */
    Iterator<E> iterator();
}
