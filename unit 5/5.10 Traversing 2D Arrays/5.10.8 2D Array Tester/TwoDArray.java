public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        // Add your code here
        if (myArray.length != other.length) {
            return false;
        }
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != other[i]){
                return false;
            }
            
            
        }
        return true;
    }

}