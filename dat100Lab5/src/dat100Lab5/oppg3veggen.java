package dat100Lab5;
import easygraphics.*;

public class oppg3veggen extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		
		makeWindow("Grafikk", 1200, 600);
		int x=300;
		int y=200;	
		int t=25;
		final int bredde = 50;
		final int høyde= bredde/2;
		
		int antallBlockPåBredden=11;
		int antallBlockPåHøyden=4;
		

		for (int n=0;n<antallBlockPåHøyden;n++) {
			for (int i=0;i<antallBlockPåBredden;i++) {
				
				if (n%2==0) {
					setColor(0, 0, 255);
					drawRectangle(x+i*bredde, y+n*høyde, bredde, høyde);
				}
				if (n%2==1) {
					setColor(255, 0, 0);
					drawRectangle(x+t+i*bredde, y+n*høyde, bredde, høyde);	
				}
			}
		}
		setColor(0, 255, 0);
		drawRectangle(x, y, bredde*antallBlockPåBredden+t, høyde*antallBlockPåHøyden);
	}
}
