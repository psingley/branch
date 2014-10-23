package sort;
import list.*;

/**
 * Arrange a list in ascending order
 * 
 * O(n*log(n)) which is less than O(n^2)
 * @author Peter Singley 
 * @version 10914
 */
public class QuickSort<E extends Comparable>
{
    List<E> list;
    public int counter;

    /**
     * Constructor for objects of class QuickSort
     */
    public QuickSort(List<E> list)
    {
        this.list = list;
        counter = 0;
       
    }

    public void sort()
    {
        qSort(0,list.size()-1);

    }

    private void qSort(int start,int end)
    {
         
        if(start>=end) //is the size 1?
            return;

        int p = partition(start,end);

        qSort(start,p-1);
        qSort(p+1,end);
        

    }

    /**
     * @return pivot position, P
     * @Post: All values left of P are < pivotValue and all values right of P are >= pivotValue.
     */
    private int partition(int start,int end)
    {
        
        System.out.println("Sorter has run: " + counter + " times. ");
        
        //int p = (end-start)/2+start;

        int middle = (start+end)/2;
        int p = middle;
        
        
        E pivotValue = list.get(middle);
        
        list.set(p,list.get(start));
        p=start;
        list.set(start,pivotValue);

        
        int cmp;

        for(int i = start+1;i<=end;i++)
        {
            cmp = pivotValue.compareTo(list.get(i));
      
            if(cmp>0)
            {
                counter++;
                list.set(p,list.get(i));
                p++;
                list.set(i,list.get(p));
            }
        }

        list.set(p,pivotValue);

        return p;

    }
}
