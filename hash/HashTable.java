package hash;
import list.*;

/**
 * Write a description of class HashTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashTable<K>
{

    List <List<K>> list;

    int keyCount = 0;

    public HashTable(int size)
    {

        for(int i=0; i<size;i++)
        {
            list.add(new LinkedList<K>());
        }

    }

    public HashTable()
    {
        this(10);
    }

    public void put (K key)
    {
        int ndx = getCode(key);

        list.get(ndx).add(key);

        keyCount++;

    }

    private int getCode (K key)
    {
        return Math.abs(key.hashCode())%list.size();
    }

    public boolean containsKey (Object obj)
    {

        try
        {

            K key = (K) obj;
            int ndx = getCode(key);
            return list.get(ndx).contains(key);

        }

        catch(ClassCastException cce)

        {
            return false;

        }

    }

    /**
     * @return the key from this HashTable, or null if not found.
     */
    public K get(K key)
    {

        int code = getCode(key);
        List<K> lst = list.get(code);
        int ndx = lst.indexOf(key);
        if(ndx<0)return null;    //"Wish we had put that in our list interface! Hint, hint, hint."
        return lst.get(ndx);    //very inefficient.

    }

    /**
     * Remove the given object from this HashTable if it's in there.
     * @return true if it was removed.
     */

    public boolean remove(Object obj)
    {

        try{

            K key = (K) obj;
            int code = getCode(key);
            List<K> lst = list.get(code);

            int ndx = lst.indexOf(key);
            if(ndx < 0)
                return false;

            lst.remove(ndx);
            keyCount--;
            return true;

        } 
        catch(ClassCastException cce )
        {

            return false;
        }

    }
    public void clear()
    {
        for(int i=0; i<list.size();i++)
        {
            list.get(i).clear();
        }
        
        keyCount=0;

    }
    
    public Iterator<K> iterator()
    {
    
        return new
        TableIterator<K>(this);
        
    }
    
    
    
    
}
