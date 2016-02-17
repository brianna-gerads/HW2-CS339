package movieRental;

import java.util.ArrayList;
import java.util.Enumeration;

public class Statement {

	private Customer _customer;
	private ArrayList<Rental> _rentals;
    private String result = "Rental Record for " + _customer.getName() + "\n";
    //private Rental each = rentals.nextElement();
    
    public Statement(Customer customer) {
        _customer = customer;
        _rentals = customer.getRentals();
    }
    
    public void printFooter() {
    	// add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + _customer.getFrequentRenterPoints() +
                  " frequent renter points";
    }
    
    public void showFigures() {
    	// show figures for this rental
        result += "\t" + each.getMovie().getTitle() +
                  "\t" + String.valueOf(thisAmount) + "\n";
    }
    
    public String statement() {
        while (_rentals.hasMoreElements()) {
        	calculateCost();
        	
            // add frequent renter points
            _customer.addFrequentRenterPoints(1);
            
            releaseBonus();
            
            showFigures();
        }
        
        printFooter();
        return result;
    }
    
}
