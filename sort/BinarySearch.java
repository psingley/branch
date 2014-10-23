package sort;
import list.*;


/**
 * Binary Search
 * 
 * Given a list with start and end position.
 * Given a target. Thing we are searching for.
 * 
 * 1) Is the list empty? 
 *      If yes. Return not found
 *      If not empty continue.
 *      
 * 2) Find the middle position between start and end
 * 3) Compare target with the value at middle position.
 * 
 *          start|  |   |   | middle |  |  |  |  |
 *          
 *      a) if target = middle found it!
 *      b) if target < middle then
 *          Do binary Search on left part (from start to middle)
 *         if target > middle then 
 *          Do binary Search on right part (from middle to end)
 */


/**
 * Version 10/16/2014
 * Author Peter Singley
 * 
 * List must be sorted
 * List should be ArrayList
 */
public class BinarySearch<E extends Comparable>{
    List<E> list;
    
    
    public BinarySearch(List<E> list){
        this.list = list;
    }
    
    /**
     * @return Position of target in list, or -1 if not found
     */
    public int search(E target){
        return binSrch(target, 0, list.size() -1);       
    }
    
    private int binSrch(E target, int start, int end){
        
        int middle = (start + end)/2;
        System.out.println("mid is currently:" + middle + " ");
        
        
        
        if(start > end){
            return -1;
        }
        
        
        
        int cmp = target.compareTo(list.get(middle));
        
        if (cmp == 0){
            return middle;
        }
        
        else if (cmp < 0){
            return binSrch(target, start, middle-1);
        }
        
        
        return binSrch(target, middle + 1, end);
    }
}