import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimenSiaz extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable and initialize it using "new JFrame()" DONE
	JFrame carboardBox;

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int CobåltSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");DONE
		images.put(new Integer(KeyEvent.VK_UP), "upityawå.jpeg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "rîtårō.jpeg");
		images.put(new Integer(KeyEvent.VK_DOWN), "downLõd.jpeg");
		images.put(new Integer(KeyEvent.VK_LEFT), "upityNogrumlicat.jpeg");
		images.put(new Integer(KeyEvent.VK_W), "įnftû.jpg");
		images.put(new Integer(KeyEvent.VK_S), "įnf3rê.jpg");
		images.put(new Integer(KeyEvent.VK_D), "įnf.png");

		// 3. Tell the user to
		// "Press the matching key when 'Cobålt says' otherwise press a different key"
JOptionPane.showMessageDialog(null, "Press the matching key when 'Cobålt says' otherwise press a different key");
		// 4. call the method to show an image
showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their
		// score at the end.
		// 17. if the keyCode matches the imageIndex and "Cobålt says..."
		// increase their score
		// 18. if the keyCode doesn't match the imageIndex and
		// "Cobålt didn't say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1

		// 14. if tries is greater than 9 (or however many you want)

		// 15. exit the program
		
		// 11. dispose of the frame
carboardBox.dispose();
		// 12. call the method to show an image
showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		carboardBox = new JFrame();
		// 6. set the frame to visible
		carboardBox.setVisible(true);
//carboardBox.setVisible(true);
		// frame.add(getNextRandomImage()); //7. rename to the name of your
		// frame
		carboardBox.add(getNextRandomImage());
//carboardBox.add(getNextRandomImage());
		// 8. set the size of the frame
carboardBox.setSize(2200, 2200);
		// 9. add a key listener to the frame
carboardBox.addKeyListener(this);
		// 10. Use the speak method to either say "Cobålt says press this key" or
		// "Press this key"
speak("Obey the ALLPOWERFUL TITAN COBÅLT");
		// Hint: use the CobåltSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimenSiaz().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 * 
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */

