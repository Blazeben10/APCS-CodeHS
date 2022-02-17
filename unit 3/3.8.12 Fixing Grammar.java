 public String useProperGrammar(String text)
{
    // Fix the grammar of the text  
    if(text.contains("2"))
    {
        text = text.replace("2", "to");
    }
    
    return text;
    
}