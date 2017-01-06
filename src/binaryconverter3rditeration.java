import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryconverter3rditeration implements ActionListener {
	private JFrame stronghold;
	private JPanel stone;
	private JButton activatorGreen;
	private JTextField activatorRed;
	private JTextField activatorBlue;
	private JTextField activatorBlack;

	public static void main(String[] args) {
		binaryconverter3rditeration glassRunner = new binaryconverter3rditeration();
		glassRunner.glass();
	}

	void glass() {
		stronghold = new JFrame();
		stone = new JPanel();
		activatorRed = new JTextField(20);
		activatorBlue = new JTextField(20);
		activatorBlack = new JTextField(20);
		activatorGreen = new JButton("Say, 'Open sesame!'");
		activatorGreen.addActionListener(this);
		stronghold.add(stone);
		stone.add(activatorRed);
		stone.add(activatorGreen);
		stone.add(activatorBlue);
		stone.add(activatorBlack);
		stronghold.pack();
		stronghold.setVisible(true);

	}

	int intmethod(String binaryInput) {
		if (binaryInput.equals("" + 11001100)) {
			JOptionPane.showMessageDialog(null, "wow very original...");
		}
		if (binaryInput.length() != 8) {
			JOptionPane.showMessageDialog(null, "Error: User iris invalid                                       (error code 511)");
			return 0;
		}
		if (!Pattern.matches("\\A[01]+\\Z", binaryInput)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binaryInput, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String stringmethod(String binary) {
		int asciival = Integer.parseInt(binary, 2);
		char theLetter = (char) asciival;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String redString = activatorRed.getText();
		int postRedConvertOne = this.intmethod(redString);
		activatorBlue.setText("" + postRedConvertOne);
		String postRedConvertTwo = this.stringmethod(redString);
		activatorBlack.setText(postRedConvertTwo);

	}

}
