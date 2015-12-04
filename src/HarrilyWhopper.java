 

public class HarrilyWhopper {

	private boolean cloakOn;
	
	HarrilyWhopper() {
		System.out.println("making Harrily Whopper...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harrily Whopper is invisible");
		else
			System.out.println("Harrily Whopper is visible");
	}

	void spyOnSnape() {
		System.out.println("Harrily Whopper sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make Harrily Whopper
		HarrilyWhopper infinitus = new HarrilyWhopper();
		// 2. become invisible
		infinitus
		// 3. spy on professor snape
		// 4. become visible again
		// 5. cast a “stupefy” spell
	}

}






