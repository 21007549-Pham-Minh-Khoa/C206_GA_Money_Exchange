import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Appointment> appointmentList= new ArrayList<Appointment>();
	}
	
	//================================= Option 1 View items (CRUD- Read) =================================
	public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";

		for (int i = 0; i < appointmentList.size(); i++) {

			output += String.format("%-20s %-20s\n", appointmentList.get(i).getDate(),appointmentList.get(i).getTime()) 
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Appointment> appointmentList) {
		String output = String.format("%-20s %-20s\n", "DATE", "TIME");
		 output += retrieveAllAppointment(appointmentList);	
		System.out.println(output);
	}
	
	//================================= Option 2 Add an item (CRUD - Create) =================================
		public static Appointment inputAppointment() {
			String date = Helper.readString("Enter date > ");
			String time= Helper.readString("Enter time > ");

			Appointment ap = new Appointment(date, time);
			return ap;
			
		}
		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment ap) {
			
			appointmentList.add(ap);
			
		}
}

