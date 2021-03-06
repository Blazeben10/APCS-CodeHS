public class BinaryConversion extends ConsoleProgram
{
    public void run()
    {
        // Write some of your own test code here!
    }
    
    public String binaryToText(String binary)
    {
        // Write your code here!
        char[] bytes = new char[(binary.length() + 7)/ 8];
        for(int i = 0; binary.length() > 0; i++) {
            int len = binary.length() < 8 ? binary.length() : 8;
            bytes[i] = (char) Integer.parseInt(binary.substring(0,len),2);
            binary = binary.substring(len);
        }
        return new String(bytes);
    }
    
    public int binaryToDecimal(String binaryString)
    {
        // Copy over your binaryToDecimal method here
        // It will be useful when writing your binaryToText method
        return Integer.parseInt(binaryString,2);
    }

}