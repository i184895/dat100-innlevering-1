package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class OppgaveO3 {

	public static void main(String[] args) {
		
	
		 String faTall = showInputDialog("Skriv inn et heltall: ");
		 int tall = parseInt(faTall);
		 beregneFakultet(tall);
	}

private static long beregneFakultet(long n) {
	long resultat=1;
	for (int i = 1; i <= n; i++) {
		resultat*=i;
	}
		showMessageDialog(null, "svaret blir: " + resultat);
		return resultat;
}
} 