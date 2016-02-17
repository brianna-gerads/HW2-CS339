package movieRental;

public class FrequentRenterPoints {
	
	private int frequentRenterPoints = 0;
	private Customer _customer;
	
	public FrequentRenterPoints(Customer customer) {
        _customer = customer;
    }

	public void addFrequentRenterPoints(int i) {
		frequentRenterPoints += i;
	}
	
	public int getFrequentRenterPoints() {
		return frequentRenterPoints;
	}
}
