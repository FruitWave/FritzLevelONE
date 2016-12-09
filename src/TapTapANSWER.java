import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	JButton yachtclave;
	JButton oxtob;
	JButton ox2;
	JButton ox3;
	String evo1;
	double evo2;
	String evo3;
	double evo4;
	JLabel poofshoosh;
	JLabel haucknitog;

	void setup() {
		Dimension xt = new Dimension(500, 200);
		JFrame glasscreen = new JFrame();
		JPanel brightdisplay = new JPanel();
		inputA = new JTextField();

		inputA.setPreferredSize(xt);
		whopper = new JTextField();
		whopper.setPreferredSize(xt);
		yachtclave = new JButton("multiply");
		oxtob = new JButton("Strangify");
		ox2 = new JButton("subtract");
		ox3 = new JButton("add");

		oxtob.addActionListener(this);
		ox2.addActionListener(this);
		ox3.addActionListener(this);
		yachtclave.addActionListener(this);
		glasscreen.add(brightdisplay);
		brightdisplay.add(inputA);
		brightdisplay.add(whopper);
		brightdisplay.add(yachtclave);
		brightdisplay.add(oxtob);
		brightdisplay.add(ox2);
		brightdisplay.add(ox3);
		brightdisplay.add(poofshoosh);
		brightdisplay.add(haucknitog);
		glasscreen.setVisible(true);
		glasscreen.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		evo1 = inputA.getText();
		evo2 = Integer.parseInt(evo1);
		evo3 = whopper.getText();
		evo4 = Integer.parseInt(evo3);

		if (e.getSource().equals(yachtclave)) {
			yachtCave();
		} else if (e.getSource().equals(oxtob)) {
			strangify();
		} else {
		}
	}

	public void strangify() {
		haucknitog = new JLabel();
		double farjeug = ((evo2 * evo4) * 50000 * ((0.5) * evo4)) / (45 * evo2);
		haucknitog.setText("" + farjeug);
	}

	public void yachtCave() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "This is the Yacht Cave.Well come, Stranger. ");
		poofshoosh = new JLabel();
		double evoCease = evo2 * evo4;

		poofshoosh.setText("" + evoCease);

	}
}
