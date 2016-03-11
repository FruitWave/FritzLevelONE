import javax.swing.JOptionPane;

public class FourTwentyClasses {

	public static void main(String[] args) {
		equillibrium ehf = new equillibrium();
		ehf.theOtherFourhundredNinteenThings();
		ehf.logic();
		ehf.burp();
	}

}

class equillibrium {
	public void theOtherFourhundredNinteenThings() {
		System.out.println("four hundred twenty!");
	}

	public void logic() {
		String aethican = JOptionPane.showInputDialog("geeks or nerds?");
		if (aethican.equalsIgnoreCase("geeks")) {
			System.out.println("geeks! yes! they rule!");
		} else if (aethican.equalsIgnoreCase("nerds")) {
			System.out.println("nerds! yes! they rule!");
		}
	}

	public void burp() {

		System.out.println(
				"This is called the Trump Loop. Created by Fritz Broido, or Nictam Icii, or Hydraefall, in 2016, it quickly became the most popular thing on the internet.");
		for (int i = 0; i > -1; i++) {
			String wire = JOptionPane.showInputDialog("100. 3456. or 87323545. or even 831746664");
			int nictamicii = Integer.parseInt(wire);
			if (nictamicii == 100) {
				System.out.println("trump has been incapacitated");
			} else if (nictamicii == 3456) {
				System.out.println("trump has passed into a coma");
			} else if (nictamicii == 87323545) {
				System.out.println("trump has lost the election");
			} else if (nictamicii == 831746664) {
				System.out.println("trump has died");
			}
		}
	}
}