public String doubleVowel(String str)
{
    //lowercase
    str = str.replaceAll("a", "aa");
    str = str.replaceAll("e", "ee");
    str = str.replaceAll("i", "ii");
    str = str.replaceAll("o", "oo");
    str = str.replaceAll("u", "uu");
    //capitols
    str = str.replaceAll("A", "AA");
    str = str.replaceAll("E", "EE");
    return str;
}