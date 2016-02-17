package movieRental;

import java.util.ArrayList;

public class Customer {
    private String _name;
    //private Vector<Rental> _rentals = new Vector<Rental>();
    private ArrayList<Rental> _rentals = new ArrayList<Rental>();
    private Statement _statement; //= new Statement(, _rentals);
    private FrequentRenterPoints frequentRenterPoints;
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    
    public ArrayList<Rental> getRentals() {
        return _rentals;
    }
    
    public String getName() {
        return _name;
    }
    
    public boolean hasMoreRentals() {
    	//if (_rentals.size() <= ) return true;
    	return false;
    }
    
    public int getFrequentRenterPoints() {
    	return frequentRenterPoints.getFrequentRenterPoints();
    }
    
    public void addFrequentRenterPoints(int i) {
    	frequentRenterPoints.addFrequentRenterPoints(i);
    }
}