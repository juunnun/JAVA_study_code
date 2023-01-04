public class Rental {
	private Movie movie;
	private int daysRented;

	public int getFrequentRenterPoints(){
		return movie.getFrequentRenterPoints(daysRented);
	}

}

public abstract class Movie {
	public abstract int FrequentRenterPoints(int daysRented);
}

public class NewRelaseMovie extends Movie {
	public int FrequentRenterPoints(int daysRented){
		return daysRented > 1 ? 2 : 1;
	}
}

public class RegularMovie extends Movie {
	public int FrequentRenterPoints(int daysRented){
		return 1;
	}
}