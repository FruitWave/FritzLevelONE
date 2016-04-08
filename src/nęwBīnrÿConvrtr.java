import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nęwBīnrÿConvrtr implements ActionListener {

	public static void main(String[] args) {
		nęwBīnrÿConvrtr loldrop = new nęwBīnrÿConvrtr();
		loldrop.glurpl();
	}

	JFrame fritz = new JFrame();
	JPanel password = new JPanel();
	JTextField theforce = new JTextField(100);
	JButton bunny = new JButton("101 lol 101");
	JTextField thesecondforce = new JTextField(100);

	void glurpl() {
		password.add(bunny);
		bunny.setText("darkBubble()");
		bunny.add(theforce);
		bunny.add(thesecondforce);
		bunny.addActionListener(this);
		fritz.add(password);

		fritz.setTitle("Bunnies and Easter and Programming");
		fritz.setVisible(true);
		fritz.pack();
	}

	char convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "8 bunny rabbits, now");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "a1ces and n0pes");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return (char) asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "a bagel or a baguette");
			// question.setText("");
			return 0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
