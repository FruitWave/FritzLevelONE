import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TëstšNStuff implements ActionListener {
	private JButton wapclap;
	private JButton dapmap;
	private JTextField scribedayz;

	public static void main(String[] args) {
		TëstšNStuff imconfused = new TëstšNStuff();
		imconfused.allthatcomplicatedstuff();
	}

	void allthatcomplicatedstuff() {
		JFrame dubwuppz = new JFrame();
		JPanel frosthydra = new JPanel();
		JLabel erblop = new JLabel();
		wapclap = new JButton("a hint fer Yer Majestey");
		wapclap.addActionListener(this);
		dapmap = new JButton("if yer wrong, I gotta kill Yer Highness");
		dapmap.addActionListener(this);
		scribedayz = new JTextField();
		dubwuppz.add(frosthydra);
		frosthydra.add(erblop);
		frosthydra.add(wapclap);
		frosthydra.add(dapmap);
		frosthydra.add(scribedayz);
		dubwuppz.setSize(1200, 200);
		dubwuppz.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == wapclap) {
			JOptionPane.showMessageDialog(null, "no, it does not have to do with Trump! Jeez!");
		}
		if ((e.getSource() == dapmap) && (scribedayz.getText().equals("Trump"))) {
			JOptionPane.showMessageDialog(null, "right");
		} else if ((e.getSource() == dapmap) && ((scribedayz.equals("Trump")) != true)) {
			JOptionPane.showMessageDialog(null, "wrong. you die now. YAAAAAAAAAAAAAH!!!!!!!!!!!!!!!!!");
		}

	}
}
