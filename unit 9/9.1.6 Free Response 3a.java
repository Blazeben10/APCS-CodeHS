public int[][] flipPhoto(int[][] picture)
{
    // Your code here.
     // local variables
	int rows = picture.length; // row/lenght
	int columns = picture[0].length; // colum/lenght
	int[][] newPicture = new int[rows][columns]; // generates a new array for Pictures
    
    // main conditional for-loop
    for(int m = 0; m < rows; m++) {
    	for(int n = 0; n < columns/2+1; n++) {
    	    newPicture[m][n] = picture[m][columns-n-1];
    		newPicture[m][columns-n-1] = picture[m][n];
    	}
    }
    
    //return statement
    return newPicture;
}