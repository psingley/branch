package set;
import tree.*;
import list.*;


/**
 * Write a description of class TreeSetIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeSetIterator <E extends Comparable> extends TreeIterator <E>
{
    
    TreeSet<E> set;
    public TreeSetIterator(TreeSet<E> set)
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
