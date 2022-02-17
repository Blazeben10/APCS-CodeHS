public boolean isInteger(String str)
{
    int len = str.length();

    // an empty string is not an integer
    if (len == 0) {
        return false;
    }

    for (int i = 0; i < len; ++i) {
        if (!Character.isDigit(str.charAt(i))) {
            return false;
        }
    }

    // Went over all the characters, all of them are digits
    return true;
}