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
    
    public String getSender()
    {
        return sender;
    }
    
    public String getReceiver()
    {
        return receiver;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public String toString()
    {
        return sender + " texted " + receiver + ": " + message;
    }
}