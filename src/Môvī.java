
public class Môvī implements Comparable<Môvī> {

		private String title;
		private int stars;

		public Môvī(String title, int stars) {
			this.title = title;
			this.stars = stars;
		}

		public String getTitle() {
			return this.title;
		}

		public int getRating() {
			return this.stars;
		}

		public String toString() {
			return "\"" + title + "\" - " + stars + " stars";
		}

	public String getTicketPrice() {
		double balance = 24.46008;
			if (this.stars > 2) {
				balance = balance - 12.23554;
				return "That will be $12.23554 please.";
			} else if (this.title.contains("Twilight")) {
				balance = balance + 12.23554;
				return "This movie is so bad, we'll pay YOU to watch it!";
				
			} else {
				return "Don't waste your money on this horrible rubbish.";
			}
		}
	 

		public int compareTo(Môvī otherMôvī) {
			int compareQuantity = otherMôvī.getRating();

			// return this.stars - compareQuantity; //ascending order
			return compareQuantity - this.stars; // descending order
		}
	}

