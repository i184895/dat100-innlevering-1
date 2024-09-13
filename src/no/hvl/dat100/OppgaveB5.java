package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class OppgaveB5 {

	public static void main(String[] args) {
		
	
		 for (int i = 1; i <= 10; i++) {
			 String finnKarakter = showInputDialog("Skriv inn Karakter: ");
			 int poeng = parseInt(finnKarakter);
			 int karakter=0;
			
		if (poeng < 100 && poeng > 90) {
			karakter = 6;
		} else if (poeng > 100) {
			System.out.println("poengsum er ugyldig");	
		} else if (poeng > 80) {
			karakter = 5;
		} else if (poeng > 60) {
			karakter = 4;
		} else if (poeng > 50) {
			karakter = 3;
		} else if (poeng > 40) {
			karakter = 2;
		} else if (poeng > 0) {
			karakter = 1;
		} else {
	System.out.println("feil");	

		}

		System.out.println( i + ". karakter blir: " + karakter);
		
		}
        
	}
	
	
	}
