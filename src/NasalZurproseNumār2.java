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

public class NasalZurproseNumār2 implements ActionListener {
	JFrame thisIsMineapple;
	JPanel landOfTortoises;
	JButton infinitard;
	JButton hackstatglory;

	public static void main(String[] args) {
		NasalZurproseNumār2 evoloix = new NasalZurproseNumār2();
		evoloix.beanBush();
	}

	void beanBush() {
		thisIsMineapple = new JFrame();
		landOfTortoises = new JPanel();
		infinitard = new JButton("Trick (click at your own risk!!!)");
		hackstatglory = new JButton("Treat (click if you are scared of that...other button!)");
		infinitard.addActionListener(this);
		hackstatglory.addActionListener(this);
		thisIsMineapple.add(landOfTortoises);
		landOfTortoises.add(infinitard);
		landOfTortoises.add(hackstatglory);
		thisIsMineapple.setVisible(true);
		thisIsMineapple.pack();
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
		if (e.getSource().equals(infinitard)) {
			showPictureFromTheInternet("http://www.designbolts.com/wp-content/uploads/2015/12/Cute-404-page-not-found-design.jpg");
		} else if (e.getSource().equals(hackstatglory)) {
			showPictureFromTheInternet("http://hce.halomaps.org/images/files/lg/headcrab003.jpg");
		}
	}

}
