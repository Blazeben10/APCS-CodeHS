/*
public class Classroom
{
    Student[] students;
    int studentsAdded;
    
    public Classroom(int students)
    {
        this.students = new Student[students];
        studentsAdded = 0;
    }
    public Student getMostImprovedStudent()
    {
        int mostImprovedRange = Integer.MIN_VALUE;
        Student mostImprovedStudent = students[0];
        
        for(Student s : students)
        {
            if(s == null) {
                continue;
            }
            int range = s.getExamRange();
            if(range > mostImprovedRange)
            {
                mostImprovedStudent = s;
                mostImprovedRange = range;
            }
        }
        return mostImprovedStudent;
    }
    public void addStudent(Student s)
    {
        students[studentsAdded] = s;
        studentsAdded++;
    }
    public void printStudents()
    {
        for(int i = 0; i < studentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
*/
public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        if (numStudentsAdded == 0) return null;
            Student improved = students[0];
        for (int i = 0; i < numStudentsAdded; i++) {
            if (improved.getExamRange() < students[i].getExamRange()) {
                improved = students[i];
        }
    }
        return improved;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}