package rmit.sef.week8;

import java.util.ArrayList;
import java.util.Date;

public class Landlord extends Customer{
	private ArrayList <Rental> rental = new ArrayList<>();
	
	public boolean setApplication(String appNum, boolean choice){
			Date newDate = new Date();
			boolean result =false;
			for(int i =0; i< rental.size(); i++) {
				for(int j =0; j< rental.get(i).getApp().size();j++) {
				if(rental.get(i).getApp().get(j).getAppNum().equals(appNum)) {
					if(rental.get(i).getApp().get(j).getLast_Date().before(newDate)) {
						result = choice;
						break;
					}
				}
				
				}
			}
			return result;	
	}
	
	public Landlord(String cId, String name, String email) {
		super(cId, name, email);
	}
	
	public ArrayList<Rental> getRental() {
		return rental;
	}
	public void setRental(ArrayList<Rental> rental) {
		this.rental = rental;
	}
	
	
}
