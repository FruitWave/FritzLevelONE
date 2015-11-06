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

public class SimenSiaz extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable and initialize it using "new JFrame()" DONE
	JFrame carboardBox;

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int CobåltSays = 0;
	Date timeAtStart;
	boolean obey = new Random().nextBoolean();
	int yep = 0;

	private void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");DONE
		images.put(new Integer(KeyEvent.VK_UP), "upityawå.jpeg");
		images.put(new Integer(KeyEvent.VK_DOWN), "downLõd.jpeg");
		images.put(new Integer(KeyEvent.VK_LEFT), "upityNogrumlicat.jpeg");
		images.put(new Integer(KeyEvent.VK_RIGHT), "rîtårō.jpeg");
		images.put(new Integer(KeyEvent.VK_W), "įnftû.jpg");
		images.put(new Integer(KeyEvent.VK_S), "įnf3rê.jpg");
		images.put(new Integer(KeyEvent.VK_D), "įnf.png");

		// 3. Tell the user to
		// "Press the matching key when 'Cobålt says' otherwise press a different key"
		JOptionPane
				.showMessageDialog(
						null,
						"Press the matching key when 'Obey the ALLPOWERFUL TITAN COBÅLT' otherwise press a different key");
		// 4. call the method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println(keyCode + "up w 87 s 83 d 68");
		// 16. make a points variable to track the score. tell the user their
		// score at the end.

		// 17. if the keyCode matches the imageIndex and "Cobålt says..."
		// increase their score
		// 18. if the keyCode doesn't match the imageIndex and
		// "Cobålt didn't say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not

		if ((this.imageIndex == keyCode) && (obey == true)) {
			int hmmm = new Random().nextInt(3);
			tries++;
			if (hmmm == 0) {
				speak("COBÅLT SHOWS MARE-SEE");
				yep++;
			} else if (hmmm == 1) {
				speak("YOUR EXISTENCE MAY CONTINUE!");
				yep++;
			} else if (hmmm == 2) {
				speak("YOU LIKELY WILL LIVE. MAYBE.");
				yep++;
			} else if (hmmm == 2) {
				speak("YOU ARE DESTINED TO LIVE. AS A SLAVE TO COBÅLT!");
				yep++;
			} else if (hmmm == 2) {
				speak("YOU SHALL LIVE. HAIL COBÅLT!!!");
				yep++;
			}

		}
		if ((this.imageIndex == keyCode) && (obey == false)) {
			tries++;
			int hmm = new Random().nextInt(3);
			if (hmm == 0) {
				speak("COBÅLT DEMANDS SACRIFICE!!!");
				yep--;
			} else if (hmm == 1) {
				speak("YOU SHALL BE ELIMINATED!");
				yep--;
			} else if (hmm == 2) {
				speak("YOUR DEATH IS IMMINENT!");
				yep--;
			}
		}
		if ((this.imageIndex != keyCode) && (obey == true)) {
			tries++;
			int hmm = new Random().nextInt(3);
			if (hmm == 0) {
				speak("COBÅLT DEMANDS SACRIFICE!!!");
				yep--;
			} else if (hmm == 1) {
				speak("YOU SHALL BE ELIMINATED!");
				yep--;
			} else if (hmm == 2) {
				speak("YOUR DEATH IS IMMINENT!");
				yep--;
			}

		}
		if ((this.imageIndex != keyCode) && (obey == false)) {
			tries++;
			int hmmm = new Random().nextInt(3);
			if (hmmm == 1) {
				speak("COBÅLT SHOWS MERCY!!!");
				yep++;
			} if (hmmm == 1) {
				speak("YOUR EXISTENCE MAY CONTINUE!");
				yep++;
			} if (hmmm == 1) {
				speak("YOU LIKELY WILL LIVE. MAYBE.");
				yep++;
			} if (hmmm == 0) {
				speak("YOU ARE DESTINED TO LIVE. AS A SLAVE TO COBÅLT!");
				yep++;
			} if (hmmm == 2) {
				speak("YOU SHALL LIVE. HAIL COBÅLT!!!");
				yep++;
			}

		}
		// 13. increment tries by 1

		// 14. if tries is greater than 9 (or however many you want)
		if (tries == 10) {
			speak("yep");
		}
		if (tries == 20) {
			speak("yep");
		}
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
		// carboardBox.setVisible(true);
		// frame.add(getNextRandomImage()); //7. rename to the name of your
		// frame
		carboardBox.add(getNextRandomImage());
		// carboardBox.add(getNextRandomImage());
		// 8. set the size of the frame
		carboardBox.setSize(2200, 2200);
		// 9. add a key listener to the frame
		carboardBox.addKeyListener(this);
		// 10. Use the speak method to either say "Cobålt says press this key"
		// or
		// "Press this key"
		obey = new Random().nextBoolean();
		if (obey == true) {
			speak("Obey the ALLPOWERFUL TITAN COBÅLT");
		}
		if (obey == false) {
			speak("OBEY");
		}

		// Hint: use the CobåltSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(7) + 37;
		if (imageIndex == 37) {
			this.imageIndex = 38;
		} else if (imageIndex == 38) {
			this.imageIndex = 40;
		} else if (imageIndex == 39) {
			this.imageIndex = 37;
		} else if (imageIndex == 40) {
			this.imageIndex = 39;
		} else if (imageIndex == 41) {
			this.imageIndex = 87;
		} else if (imageIndex == 42) {
			this.imageIndex = 83;
		} else if (imageIndex == 43) {
			this.imageIndex = 68;
		}

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

