package set;
import list.*;
import tree.*;

/**
 * Write a description of class TreeSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeSet<E> implements Set<E>
{

    BinaryTree<E> tree;
    int size = 0;

    public TreeSet()
    {
        tree = new EmptyBinarySearchTree();

    }

    public boolean add(E value)
    {

        if (tree.containsKey(value))
        {
            return false;
        }

        tree = tree.add(value);
        size++;
        return true;

    }

    public void clear()
    {
        tree = new EmptyBinarySearchTree<E>();
        size=0;
    }

    public boolean isEmpty()
    {
        empty = new EmptyBinarySearchTree<E>();

        if(tree.equals(empty))
            return false;

        return true;

    }

    public boolean contains(Object obj)
    {
        try{

            E value = (E) obj;
            return tree.containsKey(value);

        } catch (ClassCastException cce) { return false;}

    }

    public boolean remove(Object obj)
    {
        if(!(contains(obj)))
            return false;

        tree = tree.remove(obj);
        size--;

        return true;

    }

    public String toString()
    {

        return " " + this;

    }

    public boolean equals(Object obj)
    {

        return false;

    }

    public int hashCode()
    {
        return 0;    

    }
    
    public int size()
    {
        return tree.size();
    }
    
    public Iterator<E> iterator()
    {
        
        return new TreeSetIterator<E>();
        
    }

    
}
