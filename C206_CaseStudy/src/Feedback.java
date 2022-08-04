import java.time.LocalDateTime;
import java.util.Date;

public class Feedback extends Buyer{
	
	private String comment;
	private LocalDateTime date;
	
	public Feedback(int id, String name, int mobileNum, String email, Date date) {
		super(id, name, mobileNum, email);
	
	}

	public Feedback(int id, String name, int mobileNum, String email, String comment, LocalDateTime date) {
		super(id, name, mobileNum, email);
		this.comment = comment;
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public LocalDateTime getDate() {
		return date;
	}
	
	
	
	
	
	
	

}
