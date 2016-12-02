import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TapTapANSWER implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TapTapANSWER clack = new TapTapANSWER();
		clack.setup();
	}

	JTextField inputA;
	JTextField whopper;

	void setup() {
		Dimension aSlate = new Dimension(500, 200);
		JFrame glasscreen = new JFrame();
		JPanel brightdisplay = new JPanel();
		inputA = new JTextField();
		inputA.setPreferredSize(aSlate);
		whopper = new JTextField();
		whopper.setPreferredSize(aSlate);
		JButton yachtclave = new JButton("multiply");
		JButton oxtob = new JButton("Strangify");
		/*
		 * do below but with oxtob, and add 3 more oxtobs
		 */
		yachtclave.addActionListener(this);
		glasscreen.add(brightdisplay);
		brightdisplay.add(inputA);
		brightdisplay.add(artaex);
		brightdisplay.add(whopper);
		glasscreen.setVisible(true);
		glasscreen.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
