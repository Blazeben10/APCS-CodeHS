public class Photo {
	

	private String photographer;
	private String date;
	private int[][] picture;
	
	// creator
	//photo
	public Photo(String photographer, String date, int[][] picture) 
	{
		this.photographer = photographer;
		this.date = date;
		this.picture = picture;
	}
	
	// getphotographer
	public String getPhotographer() 
	{
		return photographer;
	}
	
	// getDate
	public String getDate() 
	{
		return date;
	}
	
	// getPicture
	public int[][] getPicture() 
	{
		return picture;
	}

}