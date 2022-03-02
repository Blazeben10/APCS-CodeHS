import java.lang.Math;

public class Sphere extends Solid
{
    // Code goes here!
    private double radius;
    private final double PI = Math.PI;
    public Sphere(String name,double radius){
        super(name);
        this.radius=radius;
    }
    public double volume(){
         return (4.0/3.0)*PI*Math.pow(radius,3);
     }
     public double surfaceArea(){
         return 4.0*PI*Math.pow(radius,2);
     }
}