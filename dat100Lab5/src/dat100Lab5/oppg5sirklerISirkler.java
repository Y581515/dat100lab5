package dat100Lab5;
import easygraphics.*;

public class oppg5sirklerISirkler extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		makeWindow("Det tyske flagget");
		int h=1;
		int s=2;
		int radius=s*100;
		int t=s/h*10;
		int i=0;
		
		while (i<10) {
			int r= (radius-i*t);
			if(i%2==0) {
				
				setColor(0, 0, 255);
				fillCircle(300, 300, r );
			}
			if(i%2==1) {
				setColor(255, 0, 0);
				fillCircle(300, 300, r);
			}pause(100);
			i++;
		}
	}
}