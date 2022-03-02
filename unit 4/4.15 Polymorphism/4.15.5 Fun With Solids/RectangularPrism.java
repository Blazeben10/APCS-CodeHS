public class RectangularPrism extends Solid
{
    // Code goes here!
    double length;
    double width;
    double height;
    
    public RectangularPrism(String name, double length,double width,double height){
      super(name);
      this.length=length;
      this.width=width;
      this.height=height;
    } 
    public double volume(){
         return length*width*height;
     }
     public double surfaceArea(){
         return 2.0*(width*length+height*length+height*width);
     }
}