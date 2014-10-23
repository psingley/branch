package sort;

/**
 * Write a description of class Student here.
 * 
 * @author Peter Singley 
 * @version 10914
 */
public class Student implements Comparable<Student>
{
    String name;
    String ssn;
    float gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name,String ssn)
    {
        this.name = name;
        this.ssn = ssn;
        gpa = 0;
    }

    public String getName()
    {
        return name;
    }

    public int compareTo(Student s)
    {
        String a = s.getName();
        String b = this.getName();

        return (a.compareTo(b));
        
    }
   
    public String toString()
    {

        return ("\n" + name + ",their SSN is:[" + ssn + "]");

    }

}
