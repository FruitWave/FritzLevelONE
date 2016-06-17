import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NästehSûrp implements ActionListener {
	public static void main(String[] args) {

	}

	JFrame derp = new JFrame();
	JPanel flamebroilervoid001 = new JPanel();
	JButton waffle_sword = new JButton("treat");
	JButton stalkerNews = new JButton("trick");

	void dubloppobbo() {
		derp.add(flamebroilervoid001);
		flamebroilervoid001.add(stalkerNews);
		flamebroilervoid001.add(waffle_sword);
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == waffle_sword) {

		}

	}
}