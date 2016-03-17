import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * Work together as a TEAM of 2 or 3 to make this project. We are going to hide secrets within the magic box. When
	 * the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 */
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	JFrame doubled = new JFrame("The Magic Box contains many secrets...");
	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());

	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	// public void createUI is actually a private void
	public void createUI() {
		frame.add(this);
		frame.addMouseListener(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void createUI2ndverse() {
		doubled.add(this);
		doubled.addMouseListener(this);
		setPreferredSize(new Dimension(3000, 3000));
		doubled.pack();
		doubled.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		doubled.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "/Users/league/Google Drive/league-images/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Mediempire mhcib = new Mediempire();
		System.out.println("mehmehmehmehmehmehmeh");
		JLabel kablooey = new JLabel();
		createUI2ndverse();
		try {
			doubled.add(mhcib.loadImageFromTheInternet("https://s-media-cache-ak0.pinimg.com/236x/b5/bc/94/b5bc94fb81b43cbfb1e010ef8e43947a.jpg"));
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
