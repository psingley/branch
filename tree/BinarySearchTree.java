package tree;
import list.*;

/**
 * A BinaryTree in which the value of all BinaryTrees to the left are smaller,
 *  the value of all BinaryTrees to the right are larger.
 *  
 *   Tree Traversal
 * 
 * PreOrder
 * 1)Visit the root value
 * 2)visit all values in left child
 * 3)visit all values in right child
 * 
 * InOrder
 * 1)Visit all values in left child
 * 2)visit root
 * 3)visit all values in right child
 * 
 * PostOrder
 * 1)visit all values in left child
 * 2)visit all values in right child
 * 3)visit all values in root
 * 
 */
public class BinarySearchTree<E extends Comparable> implements BinaryTree<E> {
    BinaryTree<E> left = new EmptyBinarySearchTree<E> ();
    BinaryTree<E> right = new EmptyBinarySearchTree<E> ();
    E value;

    public BinarySearchTree(E value){
        this.value = value;
    }

    public BinaryTree<E> getLeft(){
        return left;
    }

    public BinaryTree<E> getRight(){
        return right;
    }

    public E getValue(){
        return value;
    }

    public void setLeft(BinaryTree<E> left){
        this.left = left;
    }

    public void setRight(BinaryTree<E> right){
        this.right = right;
    }

    public void setValue(E value){
        this.value = value;
    }

    public BinaryTree<E> add(E value){
        int cmp = value.compareTo(this.value);

        if (cmp < 0){
            left = left.add(value);
        }
        else if (cmp > 0){
            right = right.add(value);
        }

        return this;
    }

    public boolean containsKey(E value){
        int cmp = value.compareTo(this.value);

        if (cmp == 0){
            return true;
        }

        else if(cmp < 0){
            return left.containsKey(value);
        }

        return right.containsKey(value);
    }

    public BinaryTree<E> remove(Object obj){
        try {

            E value = (E) obj;
            int cmp = value.compareTo(this.value);
            if(cmp == 0)
            {
                List<BinaryTree<E>> kids = children();
                 
                if(kids.size() == 0)
                    return new EmptyBinarySearchTree<E>();

                if(kids.size() == 1)
                    return kids.get(0);

                else if (kids.size()==2)
                {
                    BinaryTree<E> successor = ((BinarySearchTree<E>)right).smallest();

                    BinaryTree<E> result = remove(successor.getValue());

                    result.setValue(successor.getValue());

                    return result;
                }
            }

            else if(cmp<0)
            {
                left = left.remove(value);
            }

            if(cmp>0)
            {
                right = right.remove(value);
            }

        }
        catch (ClassCastException cce)
        {

        }
        return this;
    }

    public E get(E value){
        int cmp = value.compareTo(this.value);

        if(cmp<0)
            return left.get(value);

        if(cmp>0)
            return right.get(value);

        //found it
        return this.value;

    }

    public Iterator<E> iterator()
    {
        return new TreeIterator(this);
    }
    
    public Iterator<E> iteratorReverse()
    {
        
        return new ReverseTreeIterator(this);
        
    }

    /**
     * InOrder traversal used here
     */
    public String toString(){

        return " " + left.toString() + " " + this.value +  " " + right.toString();
    }

    public boolean isEmpty()
    {
        return false;
    }

    public boolean equals(Object obj)
    {

        BinarySearchTree<E> localOther;

        if(obj instanceof BinarySearchTree)
        {
            localOther = (BinarySearchTree<E>) obj;
            if(value.equals(localOther.getValue()))
            {
                return (((this.getRight().equals(localOther.getRight())) && ((this.getLeft().equals(localOther.getLeft())))));

            }
        } 
        return false;
    }

    private List<BinaryTree<E>> children()
    {
        List<BinaryTree<E>> result = new ArrayList<BinaryTree<E>>();
        if(left instanceof BinarySearchTree)
            result.add(left);

        if(right instanceof BinarySearchTree)
            result.add(right);

        return result;
    }

    private BinaryTree<E> smallest()
    {
        if(left instanceof BinarySearchTree)
            return ((BinarySearchTree)left).smallest();

        return this;
    }
}