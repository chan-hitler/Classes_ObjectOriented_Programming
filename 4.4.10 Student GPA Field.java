public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpaLevel;
    // Add your instance variable here.
    
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     * 
     * Check out StudentTester.java for an example of how to use
     * this constructor. 
     */
    public Student(String fName, String lName, int grade, double gpa)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpaLevel = gpa;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + gpaLevel;
    }
}
