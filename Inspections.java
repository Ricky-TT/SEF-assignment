package rmit.sef.week8;

public class Inspections {
	
	private Property pro;
	private String date;
	private String time;
	
	public Inspections(Property pro, String date, String time) {
		super();
		this.pro = pro;
		this.date = date;
		this.time = time;
	}

	public Property getPro() {
		return pro;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}
	
}
