package rmit.sef.week8;

import java.util.ArrayList;
import java.util.Date;

public class Applicant extends Customer {
	
	private ArrayList<String> suburbs =new ArrayList<>();
	private ArrayList<Inspections> inspections = new ArrayList<>();
	private int size =inspections.size();
	private double income;
	private String occupation;
	private ArrayList <Rental> past_contracts = new ArrayList<>();
	private Rental current_Contract;
	private int length;
	private ArrayList<Application> application = new ArrayList<>();
	
	

	public Applicant(String cId, String name, String email, double income, String occupation) {
		super(cId, name, email);
		this.income = income;
		this.occupation = occupation;
	}
	
	public ArrayList<String> getSuburbs() {
		return suburbs;
	}

	public ArrayList<Inspections> getInspections() {
		return inspections;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public ArrayList<Rental> getPast_contracts() {
		return past_contracts;
	}

	public void setPast_contracts(ArrayList<Rental> past_contracts) {
		this.past_contracts = past_contracts;
	}

	public Rental getCurrent_Contract() {
		return current_Contract;
	}

	public void setCurrent_Contract(Rental current_Contract) {
		this.current_Contract = current_Contract;
	}
	
	public void apply(String appNum, double rental, int durations) {
		Application app1= new Application(appNum,rental,durations);
		application.add(app1);
		app1.setCId(getCId());
		
	}
	public boolean withdraw(String appNum) {
		boolean result = true;
		Date newDate = new Date();
		for(int i =0; i<application.size();i++)
		if(application.get(i).getAppNum().equals(appNum)) {
			if(application.get(i).getCId().equals(getCId())) {
				if(newDate.before(application.get(i).getLast_Date())) {
					result =false;	
				}
				
			}
		}
		return result;
	}

	public void checkInspection() {
		if(inspections.size()>size) {
			System.out.println("new inspections");
		}
		else if (inspections.size()<size){
			System.out.println("inspections were cancelled");
		}
	}
	
}
