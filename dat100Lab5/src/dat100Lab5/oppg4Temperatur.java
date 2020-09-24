package dat100Lab5;

import static java.lang.Math.round;

public class oppg4Temperatur {

	public static void main(String[] args) {
		double[] Temperatur= {26,25,24,23,23,22,21};
		System.out.println("Analyse av temperaturer"+"\n***********************");
		
		double maxTemp=0;
		double sum=0;
		
		for (int i=1;i<=Temperatur.length;i++) {
			
			System.out.println(i+". dag: "+Temperatur[i-1]);
			sum+=Temperatur[i-1];
			
			if (maxTemp<Temperatur[i-1]) {
				maxTemp=Temperatur[i-1];
			}
			
		}
		 double GS=sum/Temperatur.length;
		 System.out.println("Gjennomsnittstemperaturen var "+round1(GS));
		 System.out.println("Maksimum for denne ukken var "+maxTemp+" grader");

		 
	}
	private static double round1(double n){
		
		return (double)(round(n*100))/100;
	}
}
