package tree;


/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyTreeIterator<E extends Comparable> extends TreeIterator<E>

{
    

    /**
     * Constructor for objects of class asdf
     */
    public EmptyTreeIterator()
    {
    }
    
    public boolean hasNext()
    {
        return false;
    }
    
    public E next()
    {
        return null;
    }
    
    public E remove()
    {
        return null;
    }
}
