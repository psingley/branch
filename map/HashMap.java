package map;
import hash.*;

/**
 * Use a HashTable to store the Entries in a Map
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap<K,V> implements Map<K,V>
{
    HashTable<Entry<K,V>> table = new HashTable <Entry<K,V>>();

    
    public boolean containsKey(K key)
    {

        Entry<K,V> entry = new Entry<K,V>(key,null);

        return table.containsKey(entry);

        
    }

    
    
    public V put(K key, V value)
    {
        Entry<K,V> newEntry = new Entry<K,V>(key,value);
        
        Entry<K,V> oldEntry = table.get(newEntry);
        if(oldEntry == null)
        {
            table.put(newEntry);
            return null;
        }
        

        V result = oldEntry.value;
        oldEntry.value = value;
        
        return result;
        
    }
    
    public V get(K key)
    {
        
        Entry<K,V> entry = new Entry<K,V>(key,null);
        
        entry = table.get(entry);
        
        if(entry == null)
        {
            return null;
        }
        
        return entry.value;
        
    }
    
    public V remove(K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key,null);
        
        entry = table.get(entry);
        
        if(entry==null)
        return null;
        
        V result = entry.value;
        
        table.remove(entry);
        
        return result;
        
        
    }
    
    public String toString()
    {
        return table.toString();
    }
    
    public int size(){
        return table.size();
    }
    
    public boolean isEmpty()
    {
        return table.isEmpty();
    }
    
    
}
