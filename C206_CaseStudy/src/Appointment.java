
public class Appointment extends customer{
	
	private String date;
	private String time;
	
	public Appointment(String name, String email, String username, String date, String time) {
		super(name, email, username);
		this.date = date;
		this.time = time;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
