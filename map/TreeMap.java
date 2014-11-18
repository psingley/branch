package map;
import tree.*;

/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeMap<K,V> //implements Map<K,V>
{
    BinaryTree<Entry<K,V>> tree = new EmptyBinarySearchTree<Entry<K,V>>();

    int size = 0;

    public TreeMap()
    {

    }

    public boolean containsKey(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key,null);

        return tree.containsKey(entry);
    }

    public V put(K key, V value)
    {
        Entry<K,V> newEntry = new Entry<K,V> (key,value);

        Entry<K,V> oldEntry = tree.get(newEntry);

        if(oldEntry == null)
        {
            tree = tree.add(newEntry);
            size++;
            return null;
        }

        V result = oldEntry.value;

        oldEntry.value = value;

        return result;

    }

    public V get(K key)
    {

        Entry<K,V> entry = new Entry<K,V>(key,null);

        entry = tree.get(entry);

        if(entry == null)
            return null;

        return entry.value;

    }

    public V remove(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key,null);

        entry = tree.get(entry);
        
        if (entry == null)
        {return null;}
        
        tree = tree.remove(entry);
        size--;
        return entry.value;

    }
    
    
}
