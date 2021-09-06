package oppgaveO3;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class oppgaveO3 {
	

	public static void main(String[] args) {
		boolean t = false;
		int innTall = 0;
		while(t == false) {
			innTall = parseInt(showInputDialog("Legg inn et heltall for fakultering!"));
			if(innTall > 0) {
				t = true;
			}
		}
		int sluttSum = 1;
		for(int i = 1; i <= innTall; i++) {
			sluttSum *= i;
		}
			
		System.out.println("Fakultet av " + innTall + " er " + sluttSum);
	}

}
