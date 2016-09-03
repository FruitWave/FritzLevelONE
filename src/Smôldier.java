// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this  Smôldier cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make an Engineer Sôldier. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make an Intūįt  Smôldier and print his name, hat color and girl or boy.
 * 6. Make a   Smôldier and print her name, hat color and girl or boy. */

public class Smôldier {

	private String name;
	private String floosh;

	// constuctor below
	Smôldier(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + ". I am a Smôldier.";
	}

	public void eat() {
		System.out.println(name + ". The Smôldier is eating firespits.");
	}

	/* An Intūįt Smôldier wears a special hat; all the others are plain. */
	public String getHatColor() {
		// 3. Fill in this method

		return "My hot color is " + floosh + ". I am a Smôldier.";

	}

	/* Smôldier is the only female Smôldier. */
	public String isGirlOrBoy() {
		if (name.equalsIgnoreCase("Smôldier 00805")) {
			return "DID YOU JUST ASSUME MY GENDER?!?!?!?!??!?!?!";
		}

		return "Sir, did you just assume my gender?";

	}

	void allthatothastufui() {

	}
}
