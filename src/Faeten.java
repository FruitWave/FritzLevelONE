// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.Random;

public class Faeten extends JPanel implements Runnable, MouseListener {

    BufferedImage FaetenImage;

    int frameWidth = 1000;
    int frameHeight = 900;

    Faeten() throws Exception {
   	 // 1. Choose an image for your Fåęt Bot and put it in your default packageDONE
   	 FaetenImage = ImageIO.read(getClass().getResource("Fåęt_Bot.jpeg"));
   	 // 2. Adjust the framexeWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)DONE
   	 // 4. add a mouse listenerDONE
addMouseListener(this);
    }

    static void begin() {
   	 // 3. Welcome the user. Give them a hint for the secret location.DONE
JOptionPane.showMessageDialog(null, "Well, you is be easy. You gonna die. Oh, and here is a hint for some location that doesn't ACTUALLY even exist. HAVE FUN!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.println(mouseX + " " + mouseY);
JOptionPane.showMessageDialog(null, "Your mouse repositionitoricalitynessityishness is " + mouseX + ", " + mouseY);

   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 405;
   	 int secretLocationY = 83;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 // 8. Get the user to enter a question for the Fåęt Bot
JOptionPane.showInputDialog("What's yer age, kid?");
JOptionPane.showInputDialog("Your close, kid. Good work.");

   		 // 9. Find a spooky sound and put it in your default package (freesound.org)
   		 // AudioClip sound = JApplet.newAudioClip(getClass().getResource("spooky.aif"));
   		 // 10. Play the sound
JOptionPane.showInputDialog("What's yer existence, Shucks?");
AudioClip sound = JApplet.newAudioClip(getClass().getResource("creep dude.wav"));
sound.play();
   		 // 11. Use the pause() method below to wait until your music has finished

pause(10);
   		 // 12. Insert your completed Magic 8 ball recipe (http://bit.ly/Zdrf6d) here

   	 }
   	 if (!areClose(mouseX, secretLocationX) && !areClose(mouseY, secretLocationY)) {
   		JOptionPane.showInputDialog("Your not close, kid. Lowl.");
   	 }
    }

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/

    public static void main(String[] args) throws Exception {
   	 SwingUtilities.invokeLater(new Faeten());
   	 begin();
    }

    @Override
    public void run() {
   	 JFrame frame = new JFrame();
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
   	 frame.show();
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 FaetenImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(FaetenImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}


