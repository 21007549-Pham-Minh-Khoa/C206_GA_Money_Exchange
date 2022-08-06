
public class Feedback extends customer{
	
	private String comment;
	private int id;
	
	public Feedback(int id, String name, String email, int mobileNum, String comment) {
		super(name, email, mobileNum);
		this.id=id;
		this.comment=comment;
	
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	
	
	




	

	
	
	
	
	
	
	

}
