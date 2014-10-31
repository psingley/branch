package sort;
import list.*;

/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeapSort <E extends Comparable>
{
    List<E> list;
    
    int max;

    public HeapSort(List<E> list)
    {
        this.list = list;
        max = list.size()-1;
    }

    public void sort()
    {
        heapify(0);
        int last = list.size()-1;
        while(last>0)
        {
            swap(0,last);
            last--;
            percDown(0,last);
        }
    }

    private void heapify(int root)
    {
        if((2*root+1)>list.size()-1)
        {
            return;//no children
        }

        heapify(2*root+1);//left child
        heapify(2*root+2);//right child
        percDown(root,list.size()-1);

    }

    private void percDown(int root,int max)
    {
        if(2*root+1 > max) return;
        
        
        int bc = biggerChild(root,max);
        
        while( root*2+1 <= max && greater(bc,root)  )
        {
            swap(root,bc);
            root = bc;
            bc = biggerChild(root,max);
        }

    }

    private int biggerChild(int root,int max)
    {
        int left = 2*root+1, right = 2*root+2;

        if(right > max) 
            return left;//one child

        if(greater(left,right))
            return left;

        return right;
    }

    private boolean greater(int x, int y)
    {
        return list.get(x).compareTo(list.get(y))>0;

    }
    
    private void swap(int x,int y)
    {
        E temp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
        
    }
}
