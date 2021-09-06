package oppgaveB5;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class oppgaveB5 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			
			int poeng = parseInt(showInputDialog("Poengsum for elev " + i));
			
			if (poeng < 0 || poeng > 100) {
				boolean t = false;
				while(t == false) {
					poeng = parseInt(showInputDialog("Beklager men " + poeng + " er ikke en gyldig sum"));
					if(poeng < 100 && poeng > 0) {
						t = true;
					}
				}
			}
			String karakter;
			if(poeng >= 90) {
				karakter = "A";
			}
			else if(poeng >= 80) {
				karakter = "B";
			}
			else if(poeng >= 60) {
				karakter = "C";
			}
			else if(poeng >= 50) {
				karakter = "D";
			}
			else if(poeng >= 40) {
				karakter = "E";
			}
			else {
				karakter = "F";
			}
			System.out.println("Elev " + i + " sin karakter er " + karakter);
			
			
			
		}

	}
	

}
