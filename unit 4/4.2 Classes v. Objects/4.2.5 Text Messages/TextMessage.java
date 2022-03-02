public class TextMessage
{
    private String message;
    private String sender;
    private String receiver;
    
    public TextMessage(String from, String to, String theMessage)
    {
        sender = from;
        receiver = to;
        message = theMessage;
    }
    
    public String toString()
    {
        return sender + " texted " + receiver + ": " + message;
    }
}