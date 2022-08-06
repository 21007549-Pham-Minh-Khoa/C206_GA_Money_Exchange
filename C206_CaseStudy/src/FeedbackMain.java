import java.util.ArrayList;

public class FeedbackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();

		feedbackList.add(new Feedback(11, "Johnny", "johnny132@gmail.com", 95325434, "bad attitude"));
		feedbackList.add(new Feedback(12, "Bennjamin", "bennjamin432@vicdn.com", 85487655, "too slow"));
		feedbackList.add(new Feedback(13, "May", "may5432@freed.com", 93214679, "material used is bad"));

		int option = 0;

		while (option != 4) {

			FeedbackMain.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				FeedbackMain.viewAllFeedback(feedbackList);

			} else if (option == 2) {
				FeedbackMain.setHeader("ADD");
				Feedback fb = inputFeedback();
				FeedbackMain.addFeedback(feedbackList, fb);
				System.out.println("Feedback added");

			} else if (option == 3) {
				FeedbackMain.setHeader("DELETE");
				FeedbackMain.deleteFeedback(feedbackList);
			
			} else if(option == 4) {
				System.out.println("");
				
			} else {
				System.out.println("Invalid option");
			}
		}

	}

	public static void menu() {
		FeedbackMain.setHeader("FEEDBACK APP");
		System.out.println("1. View Feedback");
		System.out.println("2. Add Feedback");
		System.out.println("3. Delete Feedback");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

//      ============================== View Feedback ================================================
	public static String retrieveAllFeedback(ArrayList<Feedback> feedbackList) {
		String output = "";

		for (int i = 0; i < feedbackList.size(); i++) {

			output += String.format("%-10d %-20s %-30d %-30s %-20s\n", feedbackList.get(i).getId(),
					feedbackList.get(i).getName(), feedbackList.get(i).getMobilenum(), feedbackList.get(i).getEmail(),
					feedbackList.get(i).getComment());
		}
		return output;
	}

	public static void viewAllFeedback(ArrayList<Feedback> feedbackList) {
		FeedbackMain.setHeader("FEEDBACK LIST");
		String output = String.format("%-10s %-20s %-30s %-30s %-20s\n", "ID", "NAME", "MOBILE NUMBER", "EMAIL",
				"COMMENT");
		output += retrieveAllFeedback(feedbackList);
		System.out.println(output);
	}

//		============================ Add Feedback =====================================================
	public static Feedback inputFeedback() {
		int id = Helper.readInt("Enter ID > ");
		String name = Helper.readString("Enter Name > ");
		int mobileNum = Helper.readInt("Enter Mobile Number > ");
		String email = Helper.readString("Enter Email > ");
		String comment = Helper.readString("Enter Comment > ");

		Feedback fb = new Feedback(id, name, email, mobileNum, comment);
		return fb;

	}

	public static void addFeedback(ArrayList<Feedback> feedbackList, Feedback fb) {
		feedbackList.add(fb);
	}

//      =========================== Delete Feedback =====================================================
	public static boolean doDeleteFeedback(ArrayList<Feedback> feedbackList, int id) {

		boolean isDeleted = false;

		for (int i = 0; i < feedbackList.size(); i++) {
			if (id == (feedbackList.get(i).getId())) {
				feedbackList.remove(i);
				isDeleted = true;

			}
		}
		return isDeleted;

	}

	public static void deleteFeedback(ArrayList<Feedback> feedbackList) {
		FeedbackMain.viewAllFeedback(feedbackList);
		int id = Helper.readInt("Enter ID > ");
		Boolean isDeleted = doDeleteFeedback(feedbackList, id);

		if (isDeleted == false) {
			System.out.println("Invalid ID");
		} else {
			System.out.println("Feedback " + id + " deleted");
		}

	}

}
