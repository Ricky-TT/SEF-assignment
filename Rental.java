package rmit.sef.week8;

import java.math.BigDecimal;
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
			 Landlord owner,  double weekly_rental, int durations, boolean status) {
		super(pNum, title, address, suburb, capacity, types);
		this.owner = owner;
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
	public void setRenter(Applicant renter) {
		this.renter = renter;
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
	public static double mul(double d1,double d2,double d3){ 
        BigDecimal bd1 = new BigDecimal(Double.toString(d1)); 
        BigDecimal bd2 = new BigDecimal(Double.toString(d2)); 
        BigDecimal bd3 = new BigDecimal(Double.toString(d3)); 
        return bd1.multiply(bd2).multiply(bd3).doubleValue(); 
    } 

	public double setManageFee() {
		if(owner.getRental().size() >= 2) {
			management_fee = mul(durations, weekly_rental,0.07);
		}
		else {
		management_fee = mul(durations, weekly_rental,0.08);
		}
		return management_fee;
	}
	public double setManageFee(double amount) {
		if(owner.getRental().size() >= 2) {
			if(amount >= 0.06) {
			management_fee = mul(durations, weekly_rental,amount);
			}
			else {
				management_fee =-1;
			}
		}
		else {
			if(amount >= 0.07) {
				management_fee = mul(durations, weekly_rental,amount);
			}
			else {
				management_fee =-1;
			}
		}
		return management_fee;
	}
	
	
		
}
