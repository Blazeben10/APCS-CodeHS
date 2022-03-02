import java.lang.Math;

public class Cylinder extends Solid
{
    // Code goes here!
    private double radius;
    private final double PI = Math.PI;
    private double height;
    
    public Cylinder (String name,double radius, double height){
        super(name);
        this.radius=radius;
        this.height=height;
    }
     public double volume(){
         return PI*Math.pow(radius,2)*height;
     }
     public double surfaceArea(){
         return 2.0*PI*radius*height+2.0*PI*Math.pow(radius,2);
     }
}