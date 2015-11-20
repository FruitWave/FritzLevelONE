
////////////////////////////// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class JeoparCruddy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	private JButton fourthButton;
	private JButton fifthButton;
	private JButton sixthButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;

	Date timeAtStart;
	private JPanel quizPanel;
	double score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new JeoparCruddy().start();
	}

	private void start() {
		//timeAtStart = new Date();
				JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);

		// 2. Give your frame a title
		frame.setTitle("epicNaame");
		// 3. Create a JPanel variable to hold the header using the createHeader
		// method
		JPanel headAh = new JPanel();
		// 4. Add the header component to the quizPanel
		quizPanel.add(headAh);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		System.out.println("Fritz is cool.");
		// 6. Use the firstButton variable to hold a button using the
		// createButton method
		firstButton = this.createButton("$204080160");
		quizPanel.add(firstButton);
		secondButton = this.createButton("$968574125");
		quizPanel.add(secondButton);
		thirdButton = this.createButton("$999999999");
		quizPanel.add(thirdButton);
		fourthButton = this.createButton("$3001");
		quizPanel.add(fourthButton);
		fifthButton = this.createButton("$99200");
		quizPanel.add(fifthButton);
		sixthButton = this.createButton("$5026");
		quizPanel.add(sixthButton);
		sevenButton = this.createButton("$1");
		quizPanel.add(sevenButton);
		eightButton = this.createButton("$120000000");
		quizPanel.add(eightButton);
		nineButton = this.createButton("$120000000");
		quizPanel.add(nineButton);
		// 7. Add the firstButton to the quizPanel

		// 8. Write the code inside the createButton() method below. Check that
		// your game looks like Figure 1 in the JeoparCruddy Handout -
		// http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the
		// createButton method
		
		// 10. Add the secondButton to the quizPanel
		
		// 11. Add an action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fifthButton.addActionListener(this);
		sixthButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	/*
	 * 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 * 
	 * [optional] Use the showImage or playSound methods when the user answers a question [optional] Add new topics for
	 * the quiz
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton dropdatplopdrop = new JButton();
		// Set the text of the button to the dollarAmount
		dropdatplopdrop.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		this.buttonCount++;
		// Return your new button instead of the temporary button
		return dropdatplopdrop;

	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		JOptionPane.showMessageDialog(null, "You have pressed the " + ((JButton) arg0.getSource()).getText() + " button. Beware!");

		// Use the method that plays the JeoparCruddy theme music.
		
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
if (buttonPressed.equals(firstButton)) {
	
	askQuestion("What planet exists exactly one A.U., or 92.956 million miles, from the Sun?", "Earth", 204080160);
} else if (buttonPressed.equals(secondButton)) {
	
	askQuestion("Is the answer you are about to type incorrect?", "possibly", 968574125);
} else if (buttonPressed.equals(thirdButton)) {
	
	askQuestion("Free Question!!! Type 'a'!!!", "a", 999999999);
} else if (buttonPressed.equals(fourthButton)) {
	
	askQuestion("Decipher this: The answer to this question is a matter of an adventure.", "quest", 3001);
} else if (buttonPressed.equals(fifthButton)) {
	
	askQuestion("What is 5^3", "125", 99200);
} else if (buttonPressed.equals(sixthButton)) {

	askQuestion("Go away and eat marshmallows. Thank You.", "okay", 1);
}
		// Call the askQuestion() method

		// Fill in the askQuestion() method. When you play the game, the score
		// should change.

		// Or if the buttonPressed was the secondButton

		// Call the askQuestionRecipe with a harder question

		// Clear the button text (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		
		// Use a pop up to ask the user the question
String answer = JOptionPane.showInputDialog(question);

		// If the answer is correct
if (answer.equalsIgnoreCase(correctAnswer)) {
	JOptionPane.showMessageDialog(null, "Correctifness is yours.");
	score = score + prizeMoney;
	updateScore();
	JOptionPane.showMessageDialog(null, "You have " + score + "!!!! Nicely done!!!");
	showCorrectImage();
	for (int i = 0; i < 20; i++) {
		playSound("woof.wav");
	}
} else {
	JOptionPane.showMessageDialog(null, "No, no, NO! JUST NO! Jeez! Wait--are you still here?");
	score = score - prizeMoney;
	updateScore();
	JOptionPane.showMessageDialog(null, "You have " + score + "!!!! Nicely done!!!");
	showIncorrectImage();
	for (int i = 0; i < 5; i++) {
		playSound("you are dumb.wav");
	}
}
		// Increase the score by the prizeMoney

		// Call the updateScore() method

		// Pop up a message to tell the user they were correct

		// Otherwise

		// Decrement the score by the prizeMoney

		// Pop up a message to tell the user the correct answer

		// Call the updateScore() method

	}

	public void playThemaeticallity() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("money raining umbrella.jpg");
	}

	void showIncorrectImage() {
		showImage("angry cat face.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deletination() {
		Date timeAtEnd = new Date();
		speak(((timeAtEnd.getTime() - timeAtStart.getTime()) * 1000000 + " nanoseconds"));
		System.out.println(((timeAtEnd.getTime() - timeAtStart.getTime()) * 1000000 + " nanoseconds"));
		
	}
}
// 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
// * Date();
// *
// * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
// * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
// * System.exit(0);