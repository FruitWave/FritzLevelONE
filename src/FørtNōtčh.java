import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FørtNōtčh implements ActionListener {

	public static void main(String[] args) {
		FørtNōtčh dędNøx = new FørtNōtčh();
		dędNøx.proxynomaly();
	}
               void proxynomaly() {
            	   JFrame equiliate = new JFrame();
            	   equiliate.setVisible(true);
            	   JButton devestaesion = new JButton();
            	   equiliate.add(devestaesion);
            	   equiliate.setSize(1250, 1250);
            	   devestaesion.setText("Imaginate the worldicon, expandane the night sky, eliminate your archenemies. Then go away and  experienx adventure.");
            	   devestaesion.addActionListener(this);
            	   
               }
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Trust your intuition");

			}

}
