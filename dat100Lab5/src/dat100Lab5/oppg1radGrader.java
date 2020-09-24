package dat100Lab5;
import static java.lang.Math.*;

public class oppg1radGrader {

	public static void main(String[] args) {
		
		System.out.println("x i grader\tx i radianer\tsin(x)\t\tcos(x)");
		System.out.println("------------------------------------------------------");
		for (int i=0; i<=180;i+=15) {
			System.out.print(i);	
			System.out.print("\t"+"\t"+vinkelTilRadianer(i));
			System.out.print("\t"+"\t"+round1(sin(vinkelTilRadianer(i))));
			System.out.println("\t"+"\t"+round1(cos(vinkelTilRadianer(i))));	
			
		}System.out.println("------------------------------------------------------");
		
	}
	private static double vinkelTilRadianer(double g) {
		 
		 return round1((PI*g)/180);
	}
	
	private static double round1(double n){
		
		return (double)(round(n*1000))/1000;
	}
}
