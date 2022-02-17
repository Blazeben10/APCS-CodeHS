public class AboutYou extends ConsoleProgram
{
    public void run()
    {
        String str = readLine("What is your favorite food?");
        String color = readLine("What is your favorite color?");
        String movie = readLine("What is your favorite movie?");
        println(str);
        println(color);
        println(movie);
    }
}