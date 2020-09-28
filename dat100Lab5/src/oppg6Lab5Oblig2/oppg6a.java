package oppg6Lab5Oblig2;
import java.lang.Integer.*;

public class oppg6a {

	public static void main(String[] args) {
	int []tab= {1,2,3,4,5,6,7,8,9,10};
	int []a= {1,3,5,7,9,11,13};
	int []b= {2,6,8,9,10,12,14};
	
	System.out.println("skrivUt Metoden: ");
	skrivUt (tab);System.out.println("");
	
	System.out.println("til streng metoden: ");
	System.out.println(tilStreng (tab)+"\n");
	
	System.out.println("summer metode1:");
	System.out.println(summer1 (tab)+"\n");
	
	System.out.println("summer metode2:");
	System.out.println(summer2 (tab)+"\n");
	
	System.out.println("summer metode3:");
	System.out.println(summer3 (tab)+"\n");
	
	int z=5;
	System.out.println("tallet "+z+" finnes i tabellen!? ");
	System.out.println(finnesTall (tab, z)+"\n");
	
	int w=3;
	System.out.print("tallet "+z+" finnes i indeks nr:");
	System.out.println(posisjonTall (tab, w)+"\n");
	
	System.out.println("motsatt rekkefølge til: ");
	skrivUt (tab);System.out.print("er: ");
	skrivUt (reverser(tab));System.out.println("");
	
	System.out.println("er tabllen her sortert: ");
	skrivUt (tab);
	System.out.println(erSortert (tab)+"\n");
	
	System.out.println("sett sammen tabllen her: ");
	skrivUt (a);
	System.out.println("her: ");
	skrivUt (b);
	System.out.println("");
	System.out.println("vVv sett sammen metoden Activer...! vVv");
	skrivUt (settSammen(a,b));
	
	}
	
	//a
	public static void skrivUt (int[] tabell) {
		System.out.print("[");
		for(int i=0;i<tabell.length;i++) {
			System.out.print(tabell[i]+" ");
		}
		System.out.println("]");	
	}
	
	//b
	public static String tilStreng (int[] tabell) {
		String tabs="";
		for(int i=0;i<tabell.length;i++) {
			tabs+=tabell[i]+" " ;		
		}

		return tabs;
	}
	
	//c1
	public static int summer1 (int[] tabell) {
		int sum=0;
		for(int i=0;i<tabell.length;i++) {
			sum+=tabell[i];
		}
		return sum;
	}
	
	//c2
	public static int summer2 (int[] tabell) {
		int sum=0;
		int i=0;
		while (i<tabell.length) {
			sum+=tabell[i];
			i++;	
		}
		return sum;
	}
	
	//c3
	public static int summer3 (int[] tabell) {
		int sum=0;
		for(int s: tabell) {
		sum+=s;
		}
		return sum;
	}
	
	//d
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
	
	//e
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
	
	//f
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
	
	//g
	public static boolean erSortert (int[] tabell) {
	
		boolean sortert = true;
		int i=0;
		while (sortert==true && i<tabell.length-1) {
			if(tabell[i]>tabell[i+1]) {
				sortert=false;
			}
			i++;
		}	
		return sortert ;
	}
	
	//h
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		int tabell3[]=new int [tabell1.length+tabell2.length];
		
		int j=0;
		for(int i=0; i < tabell3.length;i++) {
			if (i%2==0) {
				tabell3[i]=tabell1[i-j];
			}
			
			if (i%2==1) {
				j++;
				tabell3[i]=tabell2[i-j];
			}
		}
		return tabell3;
	}
	
}
