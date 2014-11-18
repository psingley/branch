package set;
import hash.*;
import list.Iterator;

/**
 * Use a HashTable to store the elements of a Set
 * 
 * @author Peter Singley 
 * @version 111314
 */
public class HashSet<E extends Comparable> implements Set<E>
{
    // instance variables - replace the example below with your own
    HashTable <E> table = new HashTable <E>();
    int size = 0;

    /**
     * Constructor for objects of class HashSet
     */
    public HashSet()
    {

    }

    public boolean add(E value)
    {
        if (table.containsKey(value))
            return false;

        table.put(value);

        return true;
    }

    public boolean contains(Object obj)
    {
        E value = (E) obj;    
        return table.containsKey(obj);
    }
    
    public boolean remove(Object obj)
    {
        return table.remove(obj);
    }
    
    public String toString()
    {
        return table.toString();
        
    }
    
    public Iterator iterator()
    {

        return table.iterator();
    }
    
    public boolean isEmpty()
    {
        
        return size==0;
    }
    
    public void clear()
    {
        table = new HashTable<E>();
        size=0;
        
    }
    
    public int size()
    {
        
        return size;
    }
    
    public int hashCode()
    {
        //int result = 17;
        //result+=result*37+name.hashCode();
        //result+=result*37+ssn.hashCode();
        //return result;
        return 0;
    }
    
    public  boolean equals (Object other)
    {
        HashSet<E> localOther;
        
        if(other instanceof HashSet)
        {
            localOther = (HashSet) other;
            if(this.equals(localOther)){
                return true;
            }
            
        }
        
        return false;
    }

}
