package map;
import set.*
;/**
 * Store a mapping from keys to values
 * 
 * @author Peter Singley 
 * @version 111314
 */
public interface Map<K,V>
{

    /**
     * Add the given key-value pair to this map.
     * If the key is already in this map, change its value.
     * @return the old value, or null if not in map
     */

    V put(K key, V value);

    /**
     * @return The value for the given key, or null if not in this map
     */

    V get(K key);

    /**
     * @return true only if this map contains an entry with the given key
     */

    boolean containsKey(K key);

    /**
     * @return true if this Map is Empty
     */
    boolean isEmpty();


    /**
     * Remove the entry with given Key from this Map
     * @return its value, or null if not in this Map
     */
    
    V remove(K key);
    
    /**
     * @return the number of entries in this Map
     */
    int size();
    
    String toString();
    
    /**
     * Return a set of all keys in this Map
     */
    Set<K> keySet();
    
    
}
