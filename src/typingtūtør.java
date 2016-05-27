import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingtūtør implements KeyListener {
	char currentLetter;

	public static void main(String[] args) {
		typingtūtør zapdatlikequadap = new typingtūtør();
		zapdatlikequadap.electrolol();
	}

	void electrolol() {
		JFrame gridlokk = new JFrame();
		JLabel dudedontjudgemedows = new JLabel();
		dudedontjudgemedows.setText("" + currentLetter);
		dudedontjudgemedows.setFont(dudedontjudgemedows.getFont().deriveFont(28.0f));
		dudedontjudgemedows.setHorizontalAlignment(JLabel.CENTER);
		gridlokk.add(dudedontjudgemedows);
		gridlokk.addKeyListener(this);
		gridlokk.pack();
		gridlokk.show();

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

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
