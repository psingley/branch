package set;
import tree.*;
import list.*;


/**
 * Write a description of class TreeSetIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeSetIterator<E>  extends TreeIterator<E> implements Iterator<E> 
{
    
    Set<E> set;
    public TreeSetIterator(Set<E> set)
    {
        super(set.tree);
        this.set = set;
    }
    
    public void remove()
    {
        super.remove();
        set.size--;
    }
}
