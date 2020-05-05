package rmit.sef.week8;

import java.util.ArrayList;

public class Property {
	
	
	private String pNum;
	private String title;
	private String address;
	private String suburb;
	private int capacity;
	private ArrayList <Integer> bedrooms =new ArrayList<>();
	private ArrayList <Integer> bathrooms =new ArrayList<>();
	private ArrayList <Integer> car_spaces =new ArrayList<>();
	private String types;
	public Property(String pNum, String title, String address, String suburb, int capacity, String types) {
		super();
		this.pNum = pNum;
		this.title = title;
		this.address = address;
		this.suburb = suburb;
		this.capacity = capacity;
		this.types = types;
	}
	public String getpNum() {
		return pNum;
	}
	public String getTitle() {
		return title;
	}
	public String getAddress() {
		return address;
	}
	public String getSuburb() {
		return suburb;
	}
	public int getCapacity() {
		return capacity;
	}
	public ArrayList<Integer> getBedrooms() {
		return bedrooms;
	}
	public ArrayList<Integer> getBathrooms() {
		return bathrooms;
	}
	public ArrayList<Integer> getCar_spaces() {
		return car_spaces;
	}
	public String getTypes() {
		return types;
	}
	
	 

}


