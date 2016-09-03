import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lølclicks implements ActionListener {

	public static void main(String[] args) {
		Lølclicks lol = new Lølclicks();
		lol.out();
	}

	void out() {
		JFrame haha = new JFrame();
		JPanel equilibriation = new JPanel();
		haha.add(equilibriation);
		JButton gigglit = new JButton();
		equilibriation.add(gigglit);
		haha.pack();
		haha.show();
		String bubbleInfinity = JOptionPane.showInputDialog(
				"The number of daleks evades Fritz's knowledge. Only you can use this technology specially designed for you to discover the truth. Ex-ex-ex-ex-OH NO-EXTERMINATE!!! Quickly! Enter a number exceeding a hundred!!!");
		int bubblecat = Integer.parseInt(bubbleInfinity);

		for (int i = 0; i < bubblecat; i++) {
			JButton anomalyA = new JButton();
			anomalyA.addActionListener(this);
			equilibriation.add(anomalyA);
			haha.pack();
			anomalyA.setText("B" + i);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
