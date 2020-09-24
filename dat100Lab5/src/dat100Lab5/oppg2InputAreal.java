package dat100Lab5;
import static javax.swing.JOptionPane.*;



public class oppg2InputAreal {

	public static void main(String[] args) {
		
		int bredde1=lesInnTall("sett in bredde");
		int høyde1=lesInnTall("sett in Høyde");
		
		int a_2 = areal(bredde1,høyde1);
		
		showMessageDialog(null,"Areal: " + a_2);

	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;
		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		int Mtall=0;
		do{
			String Mtxt=showInputDialog(message);
			Mtall=Integer.parseInt(Mtxt);
		} while(Mtall<=0); 
			
		
		
		return Mtall;
	}	
}