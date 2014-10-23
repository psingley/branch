package recursion;
import java.*;

/**
 * Write a description of class asdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{

    String s;

    public Palindrome ()
    {

        

    }

    /** @return true only if str is a palindrome */
    public boolean isPalindrome (String s)
    {

        int strLength;
        strLength = s.length();
        if(strLength <= 1)
        {
            return true;
        } else if
        (s.substring(0,1).equals(s.substring(strLength - 1, strLength))){
            String subString = s.substring(1,strLength-1);

            System.out.println("You are testing the word: " + s);
            return isPalindrome(subString);
        } else return false;
            
            
        
        
        
        
        
    }

}
