public boolean passwordCheck(String password)
{
    if (password.length() < 8) { 
            return false;
        } else {    
            char c;
            int count = 1; 
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {        
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2)   {   
                        return false;
                    }   
                }
            }
        }
    return true;
}