import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		appointmentList.add(new Appointment("Daryl", "daryl@gmail.com", "DarylU", "1/1/22", "12:30"));
		appointmentList.add(new Appointment("Khoa", "khoa@gmail.com", "KhoaU", "1/2/22", "12:30"));
		appointmentList.add(new Appointment("Jia", "jia@gmail.com", "JiaU", "1/3/22", "12:30"));
		appointmentList.add(new Appointment("Xin", "xin@gmail.com", "XinU", "1/4/22", "12:30"));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.retrieveAllappointment(appointmentList);
			}
			
			else if (option == 2) {
				//Add appointment
				Appointment ap = inputappointment();
				System.out.println("Appointment added");
			}
			
			else if (option == 3) {
				//Delete Appointment
				
			}
	}
	
	// ================================= Option 1 View appointment (CRUD- Read)
	// =================================
	public static String retrieveAllappointment(ArrayList<Appointment> appointmentList) {
		String output = "";

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-20s\n", appointmentList.get(i).getName(), appointmentList.get(i).getEmail(),
					appointmentList.get(i).getUsername(), appointmentList.get(i).getDate(),
					appointmentList.get(i).getTime());
		}
		return output;
	}

	public static void viewAllappointment(ArrayList<Appointment> appointmentList) {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s\n", "NAME", "EMAIL", "USERNAME", "DATE", "TIME");
		output += retrieveAllappointment(appointmentList);
		System.out.println(output);
	}

	// ================================= Option 2 Add an item (CRUD - Create)
	// =================================
	public static Appointment inputappointment() {
		String date = Helper.readString("Enter date > ");
		String time = Helper.readString("Enter time > ");
		String name = Helper.readString("Enter name > ");
		String username = Helper.readString("Enter username > ");
		String email = Helper.readString("Enter email > ");

		Appointment ap = new Appointment(name, email, username, date, time);
		return ap;

	}

	public static void addappointment(ArrayList<Appointment> appointmentList, Appointment ap) {

		appointmentList.add(ap);

	}

	// ================================= Option 3 Delete appointment (CRUD - Delete)
	// =================================
	public static boolean doDeleteappointment(ArrayList<Appointment> appointmentList, String username) {

		boolean isDeleted = false;

		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getUsername().equals(username)) {
				appointmentList.remove(i);
				isDeleted = true;
			}
		}
		return isDeleted;
	}

	public static String deleteappointment(ArrayList<Appointment> appointmentList , String searchuser) {
		C206_CaseStudy.retrieveAllappointment(appointmentList);
		String output = "Invalid username entered";
		Boolean isDeleted = doDeleteappointment(appointmentList, searchuser);
		if (isDeleted == true) {
			output = "Appointment for " + searchuser + "deleted";
		}
		return output;
	}
}

