public class BaseballTester extends ConsoleProgram
{
    public void run()
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        System.out.println(babeRuth.getBattingAverage());
    }
}