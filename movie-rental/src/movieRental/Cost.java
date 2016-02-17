package movieRental;

public class Cost {
	private double thisAmount = 0;
	private double totalAmount = 0;
	private Movie _movie;
	private Rental _rentals;
	
	public Cost(Movie movie, Rental rentals) {
        _movie = movie;
        _rentals = rentals;
    }
	
	public double getFigures() {
        return totalAmount;
    }
	
	public void setFigures() {
		totalAmount += thisAmount;
	}
	
	public void calculateCost(Rental rental) {
    	// determine amounts for each line
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rental.getDaysRented() > 2) {
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3) {
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                }
                break;
        }
		setFigures();
    }
}
