package queueDriver;

import queue.*;

/**
 * A Printer has a speed, in blocks of printing per step, and a queue of Docs to be printed
 * 
 * @author (sdb)
 * @author (Peter Singley)
 */
public class Printer
{
    private int speed;      // speed of this printer, blocks per step
    private QueueADT <Doc> docs;    // Queue of documents waiting to be printed
    private int blocksRemaining;    // blocks remaining to be printed on the active doc
    private Doc doc;                // the active document
    private String id;      // name of this Printer
    private boolean goToNextDoc;

    /**
     * Constructor for objects of class Printer
     */
    public Printer(int speed, String id)
    {
        docs = new Queue<Doc>();
        this.speed = speed;
        this.id = id;
        goToNextDoc = true;

    }

    /** Add a document to this printer's queue */
    public void add (Doc doc)
    {   
        docs.add(doc);
        System.out.println("Document: " + doc + " has been added to the queue.");

    }

    /** 
     * Print several blocks, if necessary, determined by this printer's speed.
     */
    public void print()
    {         
        //  PUT YOUR CODE HERE

        if (docs.isEmpty()){
            System.out.println("No docs left to print");

        }else
        {

            if(goToNextDoc){
                doc = docs.remove();
                blocksRemaining = doc.size();
                goToNextDoc = false;

            }

            if(blocksRemaining > speed)
            {
                blocksRemaining = blocksRemaining - speed;
                goToNextDoc = false;

            } 

            else 

            {
                goToNextDoc = true;
                
                System.out.println("Document of size " + doc.size() + " has printed on " + id);

            }
        }

    }

    /** @return the number of documents in this Printer's queue */
    public int size()
    {   //  PUT YOUR CODE HERE
        return docs.size();

    }

    /** Include the id, speed, and number of docs in the queue */
    public String toString()
    {   //  PUT YOUR CODE HERE
        
        return "Your printer's ID is " + id + ", your printer's speed is " +speed+ ", you have "+docs.size() + " in the queue.";
    }

}