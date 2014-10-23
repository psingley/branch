package sort;
import list.*;
/**
 * Arrange a list in ascending order.
 * Pre: The list should be an ArrayList
 * 
 * Inner loop repeats
 * 
 * (n(n-1))/2
 * 
 * or O(n^2-n)
 * 
 * so
 * 
 * O(n^2)
 * 
 * 
 * @author Peter Singley 
 * @version 91014
 */
public class BubbleSort<E extends Comparable>
{
    List<E> list;
    public int counter;

    /**
     * Constructor for objects of class lkjn
     */
    public BubbleSort(List<E> list)
    {
        counter = 0;
        this.list = list;

    }

    public void sort()
    {
        /*
        int size;
        int end;
        int cmp;

        for(size=0;size<list.size()-1;size++)
        {

        for(end=0;end<list.size()-1-size;end++)
        {

        cmp=list.get(end).compareTo(list.get(end+1));

        }

        }
         */

        
        int cmp;
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-1-i;j++)
            {

                cmp = list.get(j).compareTo(list.get(j+1));
                if(cmp>0)
                    swap(j,j+1);

            }
        }
    }

    private void swap(int x, int y)
    {
        counter++;
        System.out.println("Sorter has run: " + counter + " times. ");
        E temp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
    }
}
