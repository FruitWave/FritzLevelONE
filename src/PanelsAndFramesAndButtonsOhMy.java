import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelsAndFramesAndButtonsOhMy {

	public static void main(String[] args) {
		JFrame epoch = new JFrame();
		JPanel silicae = new JPanel();
		JButton leafblade = new JButton();
		JButton turtlesfrdayz = new JButton();
		epoch.add(silicae);
		silicae.add(leafblade);
		silicae.add(turtlesfrdayz);
		leafblade.setText("I am here for a reason, you know.");
		turtlesfrdayz.setText("Oh yes: so that you lose! Click me!");
		epoch.setTitle("Choose your destiny!");
		
		epoch.pack();
		epoch.setVisible(true);
	}

}
