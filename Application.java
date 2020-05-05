package rmit.sef.week8;

import java.util.Date;

public class Application {
	private String appNum;
	private String CId;
	private double rental;
	private int durations;
	private Date date;
	private Date last_Date;

	public Application(String appNum, double rental, int durations) {
		super();
		this.appNum = appNum;
		this.rental = rental;
		this.durations = durations;
		date= new Date();	
		last_Date = addDate(date, 3);
		}

	public String getAppNum() {
		return appNum;
	}
	
	public String getCId() {
		return CId;
	}

	public void setCId(String cId) {
		CId = cId;
	}

	public double getRental() {
		return rental;
	}
	public int getDurations() {
		return durations;
	}
	public Date getDate() {
		return date;
	}

	public Date getLast_Date() {
		return last_Date;
	}

	public static Date addDate(Date date,long day){
	long time = date.getTime(); 
	day = day*24*60*60*1000; 
	time+=day; 
	return new Date(time); 
	}
	public boolean autoReject() {
		Date newDate = new Date();
		if(newDate.after(last_Date)) {
			return false;
		}
		else return true;
	}
}
	

