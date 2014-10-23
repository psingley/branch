package sort;
import list.*;

/**
 * Selection Sort Algorithm
 * arrange a list in ascending order.
 * 
 * 
 * 
 * @author (Peter Singley) 
 * @version (10214)
 */
public class SelectionSort<E>
/**
 * Pre: E extends Comparable, list should be an ArrayList
 */
{
    List <E> list;

    public SelectionSort (List<E> list){
        this.list = list;

    }

    public void sort()
    {

        for (int p = 0; p<list.size()-1;p++)
        {

            swap(p,posSmallest(p));

        }

    }

    private int posSmallest(int start)
    {
        //return position of the smallest value
        //beginning at position start

        int result = start;
        for (int i = start+1;i<list.size();i++)
        {
 
            if(( (Comparable)list.get(i) ).compareTo( list.get(result) )>0)
            {

                //Any class which extends Comparable has an int compareTo(E) method
                //x.compareTo(y) 
                //x<y yields a negative value
                //x==y yields a 0
                //x>y yields a positive value
                result = i;

            }

        }

        return result;
    }

    private void swap(int x,int y)
    {

        E temp;
        
        temp = list.get(x);
        
        list.set(x,list.get(y));
        
        list.set(y,temp);
        
        
    }
}
