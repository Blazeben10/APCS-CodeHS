public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        // Add an entry for yourself here!
        Student adam = new Student("Adam", "Gamer", 10);
        System.out.println(alan);
        System.out.println(ada);
        // Print out your student object
        System.out.println(adam);
    }
}