import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor2 implements KeyListener {
	char currentLetter = generateRandomLetter();
	private JFrame inkBlot;
	private JPanel parchment;
	private JLabel fountainPen;
	private int score;
	// private JTextField scoreRain;

	public static void main(String[] args) {
		TypingTutor2 redmatter = new TypingTutor2();
		redmatter.guiStarter();
	}

	void guiStarter() {
		inkBlot = new JFrame();
		parchment = new JPanel();
		// scoreRain = new JTextField("" + score);
		// scoreRain.setEditable(false);
		inkBlot.add(parchment);
		fountainPen = new JLabel("" + currentLetter);
		fountainPen.setFont(fountainPen.getFont().deriveFont(900.0f));
		fountainPen.setHorizontalAlignment(JLabel.CENTER);
		parchment.add(fountainPen);
		// parchment.add(scoreRain);
		inkBlot.addKeyListener(this);
		inkBlot.pack();
		inkBlot.setVisible(true);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		char typedchar = e.getKeyChar();
		if (typedchar == currentLetter) {
			parchment.setBackground(Color.green);
			score++;
			try {
				Runtime.getRuntime().exec("say " + score + " is your score");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			parchment.setBackground(Color.magenta);
			score--;
			try {
				Runtime.getRuntime().exec("say " + score + " is your score");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		fountainPen.setText("" + currentLetter);

	}

}
