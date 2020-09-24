package oppg6Lab5Oblig2;
import java.lang.Integer.*;

public class oppg6a {

	public static void main(String[] args) {
	int []tab= {1,2,3,4,5,6,7,8,9,10};
	int []a= {1,3,5,7,9};
	int []b= {2,6,8,9,10};
	skrivUt (tab);
	System.out.println(tilStreng (tab));
	
	System.out.println(summer1 (tab));
	
	System.out.println(summer2 (tab));
	
	System.out.println(summer3 (tab));
	
	System.out.println(finnesTall (tab, 5));
	
	System.out.println(posisjonTall (tab, 4));
	
	skrivUt (reverser(tab));
	
	System.out.println(erSortert (tab));
	
	skrivUt (a);
	skrivUt (b);
	skrivUt (settSammen(a,b));
	
	}
	
	
	public static void skrivUt (int[] tabell) {
		System.out.print("[");
		for(int i=0;i<tabell.length;i++) {
			System.out.print(tabell[i]+" ");
		}
		System.out.println("]");	
	}
	
	
	public static String tilStreng (int[] tabell) {
		String tabs="[";
		for(int i=0;i<tabell.length;i++) {
			tabs+=tabell[i]+" " ;		
		}tabs+="]";

		return tabs;
	}
	
	public static int summer1 (int[] tabell) {
		int sum=0;
		for(int i=0;i<tabell.length;i++) {
			sum+=tabell[i];
		}
		return sum;
	}
	
	public static int summer2 (int[] tabell) {
		int sum=0;
		int i=0;
		while (i<tabell.length) {
			sum+=tabell[i];
			i++;	
		}
		return sum;
	}
	
	public static int summer3 (int[] tabell) {
		int sum=0;
		for(int s: tabell) {
		sum+=s;
		}
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean innholder = false;
		int i=0;
		while (!innholder && i<tabell.length) {
			if (tall==tabell[i]) {
				innholder=true;	
			}i++;
		}	
		return innholder ;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		boolean innholder = false;
		int i=0;
		int indeks=i;
		while (!innholder && i<tabell.length) {
			if (tall==tabell[i]) {
				innholder=true;	
				indeks=i;
			}
			if (tall!=tabell[i]) {
				innholder=false;	
				indeks=-1;
			}
			i++;
		}		
		return indeks;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] b = new int[tabell.length];
        System.arraycopy(tabell ,0, b, 0, tabell.length);

		for(int i=0;i<(b.length)/2;i++) {
			int temp=b[i];
			b[i]=b[b.length-(1+i)];
			b[b.length-(1+i)]=temp;
		}	
		return b ;
	}
	
	public static boolean erSortert (int[] tabell) {
	
		boolean sortert = true;
		int i=0;
		while (!sortert && i<tabell.length-1) {
			if(tabell[i]>tabell[i+1]) {
				sortert=false;
			}
			i++;
		}	
		return sortert ;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int tabell3[]=new int [tabell1.length+tabell2.length];
		int s=0;
		int j=1;
		for(int i=0; i < tabell3.length;i++) {
			
				if (i%2==0) {
					tabell3[i]=tabell1[i-s];
					s++;
				}
			
				if (i%2==1) {
					tabell3[i]=tabell2[i-j];
					j++;
				
			}
		}
		return tabell3;
	}
	
}
