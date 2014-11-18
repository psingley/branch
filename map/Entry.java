package map;

/**
 * Write a description of class lkn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Entry<K,V> implements Comparable<Entry<K,V>>
{

    K key;
    V value;

    Entry(K key, V value)
    {
        this.key=key;
        this.value=value;
    }

    public int compareTo(Entry<K,V> other)
    {

        Comparable thisKey = (Comparable) key;

        Comparable otherKey = (Comparable) other.key;

        return thisKey.compareTo (otherKey);

    }

    public int hashCode()
    {
        return key.hashCode();

    }

    public boolean equals(Object obj)
    {
        try
        { 

            Entry<K,V> other = (Entry) obj;

            return key.equals(other.key);
        }

        catch(ClassCastException cce)
        {return false;}

    }
    
        
}
