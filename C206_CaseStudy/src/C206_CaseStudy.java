import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Appointment> appointmentList= new ArrayList<Appointment>();
	}
	
	//================================= Option 1 View appointment (CRUD- Read) =================================
	public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%-20s %-20s %-20s %-20s %-20s\n", appointmentList.get(i).getDate(),appointmentList.get(i).getTime(), appointmentList.get(i).getName(),appointmentList.get(i).getUsername(), appointmentList.get(i).getEmail()); 
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Appointment> appointmentList) {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s\n", "DATE", "TIME", "NAME", "USERNAME", "EMAIL");
		 output += retrieveAllAppointment(appointmentList);	
		System.out.println(output);
	}
	
	//================================= Option 2 Add appointment (CRUD - Create) =================================
		public static Appointment inputAppointment() {
			String date = Helper.readString("Enter date > ");
			String time= Helper.readString("Enter time > ");
			String name = Helper.readString("Enter name > ");
			String username = Helper.readString("Enter username > ");
			String email = Helper.readString("Enter email > ");

			Appointment ap = new Appointment(date, time, name, username, email);
			return ap;
			
		}
		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment ap) {
			
			appointmentList.add(ap);
			
		}

	//================================= Option 3 Delete appointment (CRUD - Delete) =================================
		public static boolean doDeleteAppointments(ArrayList<Appointment> appointmentList, String id) {

		    boolean isDeleted = false;

//		    id = Helper.readString("Enter id > ");

		    for (int i = 0; i < appointmentList.size(); i++) {
		      if (appointmentList.get(i).getId() == id) {
		        isDeleted = true;
		      }
		    }
		    return isDeleted;
		  }

		  public static void deleteAppointment(ArrayList<Appointment> appointmentList) {
		    AppointmentMain.viewAllFeedback(appointmentList);

		    String id = Helper.readString("Enter id > ");
		    Boolean isDeleted = doDeleteAppointment(appointmentList, id);
		    if (isDeleted == false) {
		      System.out.println("Invalid ID entered");
		    } else {
		      System.out.println("ID" + id + "deleted");

		    }
		  }

		}
}

