import java.util.ArrayList;
import java.util.Collections;

public class Moviecu {
	
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



