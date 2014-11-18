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
    
    public String getSsn()
    {
        return ssn;
    }

    public int compareTo(Student s)
    {
        String a = s.getName();
        String b = this.getName();

        if(a.compareTo(b)==0)
            return s.getSsn().compareTo(this.getSsn());

        return a.compareTo(b);

    }

    public String toString()
    {

        return ("\n" + name + ",their SSN is:[" + ssn + "]");

    }

    public int hashCode()
    {
        int result = 17;
        result+=result*37+name.hashCode();
        result+=result*37+ssn.hashCode();
        return result;
    }

    public  boolean equals (Object other)
    {
        Student localOther;
        
        if(other instanceof Student)
        {
            localOther = (Student) other;
            if(name.equals(localOther.getName())){
                return ssn.equals(localOther.getSsn());
            }
            
        }
        
        return false;
    }
}
