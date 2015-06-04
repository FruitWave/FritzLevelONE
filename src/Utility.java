import java.applet.AudioClip;

import javax.swing.JApplet;

public class Utility {
	public static void playMusic(String soundFile) {
		Object o = new Object();
		AudioClip sound = JApplet.newAudioClip(o.getClass().getResource(
				soundFile));
		sound.play();
	}

	public static void main(String[] args) {

	}

}
