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
}
