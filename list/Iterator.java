package list;

/**
 * Write a description of interface Iterator here.
 * 
 * @author (Peter Singley) 
 * @version (a version number or a date)
 */
public interface Iterator<E>
{
    /**
     * @return true only if there are more elements that we haven't seen yet.
     */

    boolean hasNext();

    /**
     * @return value of the next element
     * precondition: hasNext() is true
     */

    E next();

    /**
     * pre: next() has been called and remove() has not been called since the last call to next().
     */

    void remove();

    /** @return true only if there are at least two more elements in the List being iterated thru */

    //boolean hasTwoMore( );
    
      /** Remove two elements from the List,
     *  the most recent obtained by a call to
     *  next() and the element following that.
     *  Pre: There are two such elements which 
     *  can be removed.
     */
    //void remove2( ); 

   
}
