public String altCase(String text)
{
    String replace = "";

    for(int i = 0; i < text.length(); i++)
    {
        if(i % 2 == 0) {
            
            replace += Character.toString(text.charAt(i)).toUpperCase();
        }
        else
        {
            replace += Character.toString(text.charAt(i)).toLowerCase();
        }
    }

    return replace;
}