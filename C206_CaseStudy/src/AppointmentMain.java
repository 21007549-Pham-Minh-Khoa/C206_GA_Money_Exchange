import java.util.*;

public class AppointmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		appointmentList.add(new Appointment("Daryl", "daryl@gmail.com", 12345678, "1/1/22", "12:30"));
		appointmentList.add(new Appointment("Khoa", "khoa@gmail.com", 13345678, "1/2/22", "12:30"));
		appointmentList.add(new Appointment("Jia", "jia@gmail.com", 14345678, "1/3/22", "12:30"));
		appointmentList.add(new Appointment("Xin", "xin@gmail.com", 15345678, "1/4/22", "12:30"));

		int option = 0;

		while (option != 4) {

			AppointmentMain.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				viewAllappointment(appointmentList);
			}

			else if (option == 2) {
				// Add appointment
				Appointment ap = inputappointment();
				addappointment(appointmentList, ap);
				System.out.println("Appointment added");
			}

			else if (option == 3) {
				// Delete Appointment
				String user = Helper.readString("Enter username to delete appointment > ");
				deleteappointment(appointmentList, user);
			} else if (option == 4) {
				System.out.println("");
			}

		}
	}

	public static void menu() {
		System.out.println("1. Display appointments");
		System.out.println("2. Add appointment");
		System.out.println("3. Delete appointment");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	// ================================= Option 1 View appointment (CRUD- Read)
	// =================================
	public static String retrieveAllappointment(ArrayList<Appointment> appointmentList) {
		String output = "";

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-20s\n", appointmentList.get(i).getName(),
					appointmentList.get(i).getEmail(), appointmentList.get(i).getMobilenum(),
					appointmentList.get(i).getDate(), appointmentList.get(i).getTime());

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
		int mobileNo = Helper.readInt("Enter mobile number: > ");
		String email = Helper.readString("Enter email > ");

		Appointment ap = new Appointment(name, email, mobileNo, date, time);
		return ap;

	}

	public static void addappointment(ArrayList<Appointment> appointmentList, Appointment ap) {

		appointmentList.add(ap);

	}

	// ================================= Option 3 Delete appointment (CRUD - Delete)
	// =================================
	public static boolean doDeleteappointment(ArrayList<Appointment> appointmentList, String name) {

		boolean isDeleted = false;

		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getName().equals(name)) {
				appointmentList.remove(i);
				isDeleted = true;
			}
		}
		return isDeleted;
	}

	public static String deleteappointment(ArrayList<Appointment> appointmentList, String searchuser) {
		AppointmentMain.retrieveAllappointment(appointmentList);
		String output = "Invalid username entered";
		Boolean isDeleted = doDeleteappointment(appointmentList, searchuser);
		if (isDeleted == true) {
			output = "Appointment for " + searchuser + "deleted";
		}
		return output;
	}
}
