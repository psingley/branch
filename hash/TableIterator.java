package hash;
import list.*; 

/**
 * Iterate thru HashTable
 * 
 * @author Peter Singley
 * @version 110614
 */
public class TableIterator<K> implements Iterator<K>
{
    HashTable<K> table;
    int ndx = 0; //which LinkedList are we working on?
    Iterator<K> itty; //Where in that list?

    TableIterator(HashTable<K> table)
    {
        this.table = table;
        setItty(ndx);
    }

    private void setItty(int ndx)
    {
        itty = table.list.get(ndx).iterator();

    }

    public boolean hasNext()
    {
        if(itty.hasNext())
            return true;

        for(ndx++;ndx<table.list.size();ndx++)
        {

            if(!(table.list.get(ndx).isEmpty()))
            {
                setItty(ndx);
                return true;   
            }

        }

        return false;
    }

    public K next()
    {

        //if(itty.hasNext())
        //    return itty.next();
        
        hasNext();    
            
        /*
        
        for(ndx++;ndx<table.list.size();ndx++)
        {
        if(!(table.list.get(ndx).isEmpty()))
        {
        setItty(ndx);
        //return itty.next();
        break;
        }
        }
        
        */
        return itty.next();
    }
    
    public void remove()
    {
        
        
    }
}
