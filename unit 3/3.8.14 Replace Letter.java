public String replaceLetter(String word, char letterToReplace, char replacingLetter)
{
    String replaced = word.replaceAll(Character.toString(letterToReplace), Character.toString(replacingLetter));
    return replaced;
}