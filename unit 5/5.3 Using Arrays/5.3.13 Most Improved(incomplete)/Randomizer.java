import java.util.*;

public class Randomizer{

	public static Random theInstance = null;
	
	public Randomizer(){
		
	}
	
	public static Random getInstance(){
		if(theInstance == null){
			theInstance = new Random();
		}
		return theInstance;
	}
	
	public static boolean nextBoolean(){
		return Randomizer.getInstance().nextBoolean();
	}

	public static boolean nextBoolean(double probability){
		return Randomizer.nextDouble() < probability;
	}
	
	public static int nextInt(){
		return Randomizer.getInstance().nextInt();
	}

	public static int nextInt(int n){
		return Randomizer.getInstance().nextInt(n);
	}

	/* Return a nubmer between min and max, inclusive. */
	public static int nextInt(int min, int max){
		return min + Randomizer.nextInt(max - min + 1);
	}

	public static double nextDouble(){
		return Randomizer.getInstance().nextDouble();
	}

	public static double nextDouble(double min, double max){
		return min + (max - min) * Randomizer.nextDouble();
	}

	
}