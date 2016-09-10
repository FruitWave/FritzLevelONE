
//Lånd0FZęTūrtlz

import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class Lånd0FZęTūrtlz {
	public static void main(String[] args) {
		MultiTurtlePanel paneltopia = new MultiTurtlePanel();
		String galafrey = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		/* 1. Get the panel to show */
		paneltopia.showPanel();
		/* 2. Set the background image of the panel to the Galapagos Islands */
		paneltopia.setBackgroundImage(galafrey);
		/* 3. Instantiate a Turtle and add it to the panel */
		Turtle soupmantheultimateturtleofalltimeohyeahthatiswhatitypeduhhuhwoohoo = new Turtle();
		paneltopia.addTurtle(soupmantheultimateturtleofalltimeohyeahthatiswhatitypeduhhuhwoohoo);
		/* 4. Put [no] Turtles on the beach. */
		String qouq = JOptionPane.showInputDialog("a number. A very large number. por pleazor");
		int q = Integer.parseInt(qouq);
		int weird = new Random().nextInt(q * 15);
		System.out.println("weird: " + weird);
		for (int i = 1; i < weird; i++) {
			Turtle a = new Turtle();
			paneltopia.addTurtle(a);
			a.setX(new Random().nextInt(i * 15));
			a.setY(new Random().nextInt(i * 15));
			System.out.println(i);
			Lølclicks heyLookItIsMeIExistToo = new Lølclicks();
			heyLookItIsMeIExistToo.out();
		}

	}
}
