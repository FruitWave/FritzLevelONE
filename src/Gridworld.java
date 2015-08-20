import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.awt.Color;
import java.util.Random;

public class Gridworld {
	public static void main(String[] args) {

		World cyberdalek = new World();
		cyberdalek.show();
		Bug cyber = new Bug();
		Color dalek = Color.BLACK;
		cyber.setColor(dalek);

		for (int l = 0; l < 20; l++) {
			int hmmm = random(5);
			Location stranded = new Location(random(6) + 1, random(3) + 1);
			Location strranded = new Location(random(5) + 1, random(4) + 1);
			Location strrranded = new Location(random(5) + 1, random(1) + 1);
			Location strrrranded = new Location(random(3) + 1, random(7) + 1);
			Location here = new Location(random(4) + 1, random(8) + 1);
			if (hmmm == 0) {
				cyberdalek.add(here, cyber);
			}
			if (hmmm == 1) {
				cyberdalek.add(stranded, cyber);
			}
			if (hmmm == 2) {
				cyberdalek.add(strranded, cyber);
			}
			if (hmmm == 3) {
				cyberdalek.add(strrranded, cyber);
			}
			if (hmmm == 4) {
				cyberdalek.add(strrrranded, cyber);
			}
		}

	}

	private static int random(int i) {
		Random r = new Random();
		return r.nextInt(i);
	}
}
