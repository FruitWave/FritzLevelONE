import javax.swing.JOptionPane;

public class iRøckVersion2 {

	public static void main(String[] args) {
		String ultimax = getUlitmaxx();
		String lolBox = JOptionPane.showInputDialog("who?");
		iRock(lolBox);
		truth("Justin Beiber");
		truth("Alan Walker");
		echo2("bob");
		anoyingitynesslynessity("cyberdalexik", 5);
		System.out.println(ultimax);
		System.out.println("(Kill Code " + add(4, 5) + ")");
		a4lupepracticereinsurecsheeun(6);
		exitt();
	}

	private static void a4lupepracticereinsurecsheeun(int hi) {

		if (hi % 2 == 0) {
			System.out.println("even");
		}
		if (hi % 2 == 1) {
			System.out.println("odd");
		}

	}

	private static int add(int i, int j) {
		int stevejobs = i + j;
		return stevejobs;
	}

	private static String getUlitmaxx() {
		return "kill code nine initiated";

	}

	static void iRock(String fritter) {
		JOptionPane.showMessageDialog(null, fritter + " rocks");
	}

	static void truth(String thePlex) {
		if (thePlex.equals("Justin Beiber"))
			JOptionPane.showMessageDialog(null, thePlex + " sucks");
		if (thePlex.equals("Alan Walker")) {
			JOptionPane.showMessageDialog(null, thePlex + " is awesome");
		}

	}

	static void echo2(String echo) {
		JOptionPane.showMessageDialog(null, echo + " " + echo);
	}

	static void anoyingitynesslynessity(String stringz, int lmaon) {
		for (int i = 0; i < lmaon; i++) {
			JOptionPane.showMessageDialog(null, stringz);
		}

	}

	static void exitt() {
		System.exit(10);
	}

}