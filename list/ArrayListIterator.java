package list;

/**
 * Understood as Array ListIterator, so, a ListIterator applied over an Array.
 * @author Peter Singley 
 * @version 91814
 */
public class ArrayListIterator<E> extends ArrayIterator<E> implements ListIterator<E>
{

    //ndx is cursor position, between positions ndx-1 and ndx of the array.

    boolean forward = true;

    /**
     * Constructor
     */
    ArrayListIterator(List<E> theList)
    {
        super(theList);
        super.ndx=ndx+1;

    }

    /**
     * Alternate constructor indicating cursor starting position.
     * Pre: 0<=ndx<=list size
     */

    ArrayListIterator(List<E> theList, int ndx)
    {

        super(theList);
        super.ndx=ndx;

    }

    public boolean hasNext()
    {
        return ndx<theList.size();
    }

    public E next()
    {
        ndx++;
        forward = true;
        return theList.get(ndx-1);

    }

    public boolean hasPrevious()
    {
        return ndx > 0;

    }

    public E previous()
    {
        ndx--;
        forward = false;
        return theList.get(ndx);
    }

    public void remove()
    {

        if (forward)
        {
            ndx--;
            theList.remove(ndx);

        } else
        {
            theList.remove(ndx);

        }

    }
    
    public void add(E value)
    {
        theList.add(ndx,value);
        ndx++;
    }
  
    
}
