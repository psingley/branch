package recursion;
import java.util.*;

/** Maintain email addresses, with aliases.
 * @author (sdb)
 * @author (Pete Singley)
 */
public class EmailAddresses
{
    private Map <String, Set <String>>  book;

    public EmailAddresses ()
    {  book = new HashMap <String, Set <String>> ();  }

    /** Associate the given alias with the given people */
    public void add (String alias, Set <String> people)
    // Add this entry to the map
    {	
        

        book.put(alias,people);
    }

    /** @return All the email addresses corresponding to
     * the given alias, in a Set.
     */
    public Set <String> expandAlias (String alias)
    {	

        Set s = book.get(alias);
        HashSet expand = new HashSet<String>();
        Iterator it = s.iterator();

        while(it.hasNext())
        {

            String x = (String)it.next();

            if(book.containsKey(x))
            {
                expand.addAll(expandAlias(x));

            } else {

                expand.add(x);
            }

        }
        
        return expand;

    }
}
