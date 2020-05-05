package rmit.sef.week8;

import java.util.ArrayList;

public class Rental extends Property{
	
	private double management_fee;
	private Landlord owner;
	private Applicant renter; 
	private double weekly_rental;
	private int durations;
	private boolean status;
	private ArrayList<Application> app = new ArrayList<>();

	public Rental(String pNum, String title, String address, String suburb, int capacity, String types,
			double management_fee, Landlord owner, Applicant renter, double weekly_rental, int durations,
			boolean status) {
		super(pNum, title, address, suburb, capacity, types);
		this.management_fee = management_fee;
		this.owner = owner;
		this.renter = renter;
		this.weekly_rental = weekly_rental;
		this.durations = durations;
		this.status = status;
	}
	public Landlord getOwner() {
		return owner;
	}
	public void setOwner(Landlord owner) {
		this.owner = owner;
	}
	public double getManagement_fee() {
		return management_fee;
	}
	public Applicant getRenter() {
		return renter;
	}
	public double getWeekly_rental() {
		return weekly_rental;
	}
	public int getDurations() {
		return durations;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ArrayList<Application> getApp() {
		return app;
	}
	public void setManageFee() {
		if(owner.getRental().size() >= 2) {
			management_fee = durations * weekly_rental * 0.07;
		}
		else {
		management_fee = durations * weekly_rental * 0.08;
		}
	}
	public void setManageFee(double amount) {
		if(owner.getRental().size() >= 2) {
			if(amount >= 0.06) {
			management_fee = durations * weekly_rental * amount;
			}
			else {
				System.out.println("a minimum of 6% for multiple properties");
			}
		}
		else {
			if(amount >= 0.07) {
				management_fee = durations * weekly_rental * amount;
			}
			else {
				System.out.println("a minimum of 7% for a single property");
			}
		}
	}
	
		
}
