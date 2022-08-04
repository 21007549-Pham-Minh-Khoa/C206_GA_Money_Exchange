import java.time.LocalDateTime;
import java.util.ArrayList;

public class FeedbackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		
		feedbackList.add(new Feedback (4, "John", 91234567, "Johnn123@gmail.com", "Good service", LocalDateTime.now()));
		

	}

}
