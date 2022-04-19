/*
public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;
    
    //
    // * This is a constructor.  A constructor is a method
    // * that creates an object -- it creates an instance
    // * of the class. What that means is it takes the input
    // * parameters and sets the instance variables (or fields)
    // * to the proper values.
    // *
    // * Check out StudentTester.java for an example of how to use
    // * this constructor.
    //
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    public int getExamRange()
    {
        int min = Integer.MAX_VALUE;
        for(int m : exams)
        {
            min = Math.min(min, m);
            
        }
        int max = Integer.MIN_VALUE;
        for(int m : exams)
        {
            max = Math.max(max, m);
            
        }
        return max - min;
    }
    public String getName()
    {
        return firstName + " " + lastName;
    }
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    //
    // * This is a toString for the Student class. It returns a String
    // * representation of the object, which includes the fields
    // * in that object.
    // *
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
*/
public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    // Implement this method!
    // Returns the sum of the differences between exams
    // Example: Assume exams = {54, 67, 89, 95}
    //Improvement = (67 - 54) + (89 - 67) + (95 - 89) = 41
    public int getExamRange()
    {
    // your code goes here! 
        if (numExamsTaken == 0) return 0;
            int min = exams[0];
            int max = exams[0];
        for (int i = 0; i < numExamsTaken; i++) {
            if (exams[i] > max) max = exams[i];
            if (exams[i] < min) min = exams[i];
    }
        return max - min;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}