import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here!
    private double length;
    private double width;
    private double height;
    
    public Pyramid(String name,double length, double width, double height){
      super(name);
      this.length=length;
      this.width=width;
      this.height=height;
    }
    // When testing, values will be passed in this order: length, width, height
    
     public double volume(){
         return (length*width*height)/3;
     }
     public double surfaceArea(){
       return length * width + (length * Math.sqrt(Math.pow((width / 2.0), 2)+Math.pow(height , 2)))+(width*Math.sqrt(Math.pow((length/2.0), 2)+Math.pow(height,2)));
         
     }
    // When testing, values will be passed in this order: length, width, height
}