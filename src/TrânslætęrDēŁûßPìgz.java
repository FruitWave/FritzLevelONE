import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrânslætęrDēŁûßPìgz implements ActionListener {

	public static void main(String[] args) {
		TrânslætęrDēŁûßPìgz shard = new TrânslætęrDēŁûßPìgz();
		shard.nortonThePorson();

	}

	JTextField drystorb;
	JTextField wetstorb;

	void nortonThePorson() {
		Dimension aSlate = new Dimension(500, 200);
		JFrame sunslope = new JFrame();
		JPanel sunscape = new JPanel();
		drystorb = new JTextField();
		drystorb.setPreferredSize(aSlate);
		wetstorb = new JTextField();
		wetstorb.setPreferredSize(aSlate);
		JButton artaex = new JButton("Doctor Strangify");
		artaex.addActionListener(this);
		sunslope.add(sunscape);
		sunscape.add(drystorb);
		sunscape.add(artaex);
		sunscape.add(wetstorb);
		sunslope.setVisible(true);
		sunslope.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pigSourceDotGov odyobe = new pigSourceDotGov();
		String wetput = odyobe.translate(drystorb.getText());
		wetstorb.setText(wetput);
		speak(wetput);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
