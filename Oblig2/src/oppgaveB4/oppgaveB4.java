package oppgaveB4;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class oppgaveB4 {

	public static void main(String[] args) {
		double skatt = parseInt(showInputDialog("Inntjening"));
		
		if(skatt >= 164101 && skatt <= 230950) {
			skatt = skatt * 0.9907;
		}
		else if(skatt >= 230950 && skatt <= 580650) {
			skatt = skatt * 0.9759;
		}
		else if(skatt >= 580650 && skatt <= 934050) {
			skatt = skatt * 0.8848;
		}
		else if(skatt >= 934051) {
			skatt = skatt * 0.8548;
		}
		
		System.out.println(skatt);
	}

}
