package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB6 {

    public static void main(String[] args) {
        
        String faInntekt = showInputDialog("Skriv inn inntekt: ");
        double inntekt = Double.parseDouble(faInntekt); 
        double trinnskattpros = 0;

        if (inntekt <= 208051) {
            trinnskattpros = 0;
        } else if (inntekt >= 208052 && inntekt <= 292850) {
            trinnskattpros = 0.017; 
        } else if (inntekt >= 292851 && inntekt <= 670000) {
            trinnskattpros = 0.04; 
        } else if (inntekt >= 670001 && inntekt <= 937900) {
            trinnskattpros = 0.136;
        } else if (inntekt >= 937901 && inntekt <= 1350000) {
            trinnskattpros = 0.166;
        } else {
            trinnskattpros = 0.176;  
        }

        double trinnskatt = trinnskattpros * inntekt;
        showMessageDialog(null, "Trinnskatten som må betales er: " + trinnskatt + "kr");
    }
}
