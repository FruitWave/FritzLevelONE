import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Destini implements ActionListener{
	private JButton oblivion;
	private JButton desintigration;
 public static void main(String[]args){
	Destini equillibrium = new Destini();
	equillibrium.destiniz();
 }
	
@Override
public void actionPerformed(ActionEvent e) {
	oblivion.setText("You are a certified idiot!");
		desintigration.setText("Click me! Click me!");
	 }

void destiniz() {
	JFrame proximus = new JFrame();
	JPanel destinum = new JPanel();
	JButton oblivion = new JButton("Hey there Derp!");
	JButton desintegration = new JButton("Hey there Destinus!");
	proximus.add(destinum);
	desintegration.addActionListener(this);
	oblivion.addActionListener(this);
	destinum.add(oblivion);
	destinum.add(desintegration);
	proximus.setSize(2000, 2000);
	proximus.setVisible(true);
	proximus.setLayout(new GridLayout(1,2));
	proximus.pack();
	
}


}
