
//theBôôkOfNarniå
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical aslan. When the user clicks
 * on an illusion, a new one will be loaded.
 **/

public class theBôôkOfNarniå extends MouseAdapter {

	/*
	 * Here we are instantiating our theBôôkOfNarniå class and calling it’s
	 * createBook() method. This is because we want to get out of the static
	 * main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		theBôôkOfNarniå aslan = new theBôôkOfNarniå();
		aslan.createBook();
	}

	JFrame branded = new JFrame();
	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	public void createBook() {
		// 2. make the frame visible
		branded.setVisible(true);
		// 3. set the size of the frame
		branded.setSize(1000, 1000);
		// 4. find 2 images and save them to your project’s default package

		// 5. make a variable to hold the location of your image. e.g.
		// "illusion.jpg"

		// 6. create a variable of type "JLabel" but don’t initialize it yet

		// 7. use the "loadImage..." methods below to initialize your JLabel
		iaroc = loadImageFromComputer(eyeslayrr);
		ėzėbutton = loadImageFromComputer(eyekillrr);
		// 8. add your JLabel to the frame
		branded.add(ėzėbutton);

		// 9. call the pack() method on the frame
		branded.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		branded.addMouseListener(this);
	}

	String eyekillrr = "yup.jpg";
	String eyeslayrr = "yep.jpg";
	JLabel iaroc;
	JLabel ėzėbutton;
	int i = 1;

	public void mousePressed(MouseEvent e) {

		if (i % 2 == 0) {
			// 11. Print "clicked!" ato the console when the mouse is pressed
			System.out.println("go away. we're closed");
			System.out.println("vuelve nunca. estamos cerrar.");
			// 12. remove everything from the frame that was added earlier
			branded.remove(ėzėbutton);
			branded.setVisible(true);
			branded.setSize(1000, 1000);
			// 13. load a new image like before (this is more than one line of
			// code)
			branded.add(iaroc);
			// 14. pack the frame
			branded.pack();
			i++;
		} else if (i % 2 == 1) {
			// 11. Print "clicked!" ato the console when the mouse is pressed
			System.out.println("go away. we're closed");
			System.out.println("vuelve nunca. estamos cerrar.");
			// 12. remove everything from the frame that was added earlier
			branded.remove(iaroc);
			branded.setVisible(true);
			branded.setSize(1000, 1000);
			// 13. load a new image like before (this is more than one line of
			// code)
			branded.add(ėzėbutton);
			// 14. pack the frame
			branded.pack();
			i++;
		}
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
