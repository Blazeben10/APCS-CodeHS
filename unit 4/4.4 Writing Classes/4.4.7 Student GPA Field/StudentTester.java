public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        Student alan = new Student("Alan", "Turing", 11, 3.5);
        Student ada = new Student("Ada", "Lovelace", 12, 3.8);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}