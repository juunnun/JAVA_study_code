
public class Rental {
	
	public int daysRented;
	Movie m2 = new Movie();
	public int getFrequentRentersPoints() {
		return
				m2.getFrequentRenterPoints(daysRented,m2.priceCode);
	}


	
	
	public static void main(String[] args) {
		
    	Rental r1 = new Rental();
    	
    	
    	r1.daysRented = 8;
    	r1.m2.priceCode=1;
 
 
    	System.out.println(r1.getFrequentRentersPoints());

}



}