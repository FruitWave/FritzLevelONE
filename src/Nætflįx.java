//Paste the code below into 2 classes called Môvī and NetflixQueue.
//Create your own class with a main() method that will use Môvī and NetflixQueue to complete the following challenges:
	//1. Instantiate some Môvī objects (at least 5).
	//2. Use the Môvī class to get the ticket price of one of your movies.
	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	//6. Use your NetflixQueue object to finish the sentence "ze best movie is...."
	//7. Use your NetflixQueue to finish the sentence "ze second best movie is...." 




import java.util.ArrayList;
import java.util.Collections;

public class Nætflįx {
	public static void main(String[] args) {
		Nætflįx netadome = new Nætflįx();
		System.out.println("Esek? Or eseque? Which is ittttttttttttttttt??????????????? Ha. Suck on dat.");
		Môvī haido = new Môvī("The Italian Game", 1);
		Môvī haidon = new Môvī("The Italian Gays", 3);
		Môvī haidok = new Môvī("The Italian Gain", 2);
		Môvī hado = new Môvī("The Italian Main Method", 7);
		Môvī aido = new Môvī("The Italian Aim", 5);
		Môvī haydo = new Môvī("The Italian Maim", 2);
		netadome.addMôvī(haido);
		netadome.addMôvī(haidon);
		netadome.addMôvī(haidok);
		netadome.addMôvī(aido);
		netadome.addMôvī(hado);
		netadome.addMôvī(haydo);
		netadome.sortMôvīsByRating();
		netadome.printMôvīs();
		System.out.println("ze goodest Môvī is ze " + netadome.getBestMôvī());
		System.out.println("ze secnd goodest Môvī is ze " + netadome.getBestMôvīz());
	}
	ArrayList<Môvī> movies = new ArrayList<Môvī>();
	
	public Môvī getBestMôvī(){
		this.sortMôvīsByRating();
		return movies.get(0);
	}
	public Môvī getBestMôvīz(){
		this.sortMôvīsByRating();
		return movies.get(1);
	}
	public void addMôvī(Môvī movie) {
		movies.add(movie);
	}
	
	public Môvī getMôvī(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMôvī() method.");
		return null;
	}
	
	public void sortMôvīsByRating() {
		Collections.sort(movies);
	}

	public void printMôvīs() {
		System.out.println("Your Netflix queue contains: ");
		for (Môvī movie : movies) {
			System.out.println(movie);
		}
	}

}





