package movieRental;

public class Rental {
    private Movie _movie;
    private int   _daysRented;
    private Cost _cost;
    
    public Rental(Movie movie, int daysRented, Cost cost) {
        _movie      = movie;
        _daysRented = daysRented;
        _cost = cost;
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }
    
    public double getCost() {
    	return _cost.getFigures();
    }
    
    public void releaseBonus() {
    	// add bonus for a two day new release rental
        if ((_movie.getPriceCode() == Movie.NEW_RELEASE) &&
            (_daysRented > 1)) {
                addFrequentRenterPoints(1);
        }
    }
}