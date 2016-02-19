
public class Minion {
	Minion(String name, int eyes, String color, String master) {
		this.color = color;
		this.eyes = eyes;
		this.name = name;
		this.master = master;
	}

	private String name;
	private int eyes;
	private String color;
	private String master;

	// getters and setters below
	String getName() {
		return name;
	}

	int getEyes() {
		return eyes;
	}

	String getColor() {
		return color;
	}

	String getMaster() {
		return master;
	}

	void setName(String name) {
		this.name = name;
	}

	void setEyes(int eyes) {
		this.eyes = eyes;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setMaster(String master) {
		this.master = master;
	}
}
