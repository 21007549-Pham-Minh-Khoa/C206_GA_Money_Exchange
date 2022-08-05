import java.util.ArrayList;

public class Bikelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <<<<<<< HEAD ArrayList<BikeList> appointmentList= new ArrayList<BikeList>();
		 * 
		 * } }
		 */

		/*
		 * ArrayList<Appointment> appointmentList= new ArrayList<Appointment>(); >>>>>>>
		 * branch 'master' of
		 * https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git } <<<<<<< HEAD
		 * =======
		 */

		// ================================= Option 1 View items (CRUD- Read)
		// =================================
//	public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
//		String output = "";
//
//		for (int i = 0; i < appointmentList.size(); i++) {
//
//			output += String.format("%-20s %-20s\n", appointmentList.get(i).getDate(),appointmentList.get(i).getTime()) 
//		}
//		return output;
//	}
//	public static void viewAllCamcorder(ArrayList<Appointment> appointmentList) {
//		String output = String.format("%-20s %-20s\n", "DATE", "TIME");
//		 output += retrieveAllAppointment(appointmentList);	
//		System.out.println(output);
//	}
//	
//	//================================= Option 2 Add an item (CRUD - Create) =================================
//		public static Appointment inputAppointment() {
//			String date = Helper.readString("Enter date > ");
//			String time= Helper.readString("Enter time > ");
//			String username = Helper.red
//
//			Appointment ap = new Appointment(name,email,date, time);
//			return ap;
//			
//		}
//		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment ap) {
//			
//			appointmentList.add(ap);
//			
//		}

		/*
		 * <<<<<<<HEAD for(
		 * 
		 * int i = 0;i<appointmentList.size();i++) {
		 * 
		 * output += String.format("%-20s %-20s\n", appointmentList.get(i).getDate(),
		 * appointmentList.get(i).getTime()); }return output; }
		 * 
		 * public static void viewAllCamcorder(ArrayList<Appointment> appointmentList) {
		 * String output = String.format("%-20s %-20s\n", "DATE", "TIME"); output +=
		 * retrieveAllAppointment(appointmentList); System.out.println(output); }
		 * 
		 * // ================================= Option 2 Add an item (CRUD - Create) //
		 * ================================= public static Appointment
		 * inputAppointment() { String date = Helper.readString("Enter date > "); String
		 * time= Helper.readString("Enter time > ");
		 * 
		 * Appointment ap = new Appointment(date, time); return ap; =======
		 * 
		 * public static void AddCustomer(ArrayList<customer> customerList, customer
		 * cust) { // TODO Auto-generated method stub >>>>>>> branch 'master' of
		 * https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
		 * 
		 * }
		 * 
		 * public static void AddEmployee(ArrayList<employee> employeeList, employee
		 * emp) {
		 * 
		 * }
		 * 
		 * public static void ViewCustomer(ArrayList<customer> customerList) {
		 * 
		 * }
		 * 
		 * public static void ViewEmployee(ArrayList<employee> employeeList) {
		 * 
		 * }
		 * 
		 * public static void DeleteCustomer(ArrayList<customer> customerList, customer
		 * cust) {
		 * 
		 * }
		 * 
		 * public static void DeleteEmployee(ArrayList<employee> employeeList, employee
		 * emp) {
		 * 
		 * }>>>>>>>branch'master'
		 * 
		 * of https:// github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git }<<<<<<<HEAD
		 * 
		 * =======
		 * 
		 * >>>>>>>branch'master' of https: //
		 * github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
		 */


	
	ArrayList<bike> bikeList = new ArrayList<bike>();
	
	int option = 0;
	
	while(option != 4) {
		Bikelist.bikeMenu();
		option = Helper.readInt("Enter an option > ");
		
		if (option ==1 ) {
			Bikelist.viewAllBikeList(bikeList);
		} else if (option == 2) {
			bike bike = inputBike();
			Bikelist.addbike(bikeList, bike);
			System.out.println("Bike Added");
		} else if (option == 3) {
			Bikelist.delBike(bikeList);
	   } else if (option == 4) {
		   System.out.println("Bye!");
		   break;
	   }
}
	}
	
	


	public static void bikeMenu() {
		Helper.line(80, "=");
		System.out.println("BIKE LISTING");
		Helper.line(80, "=");
		System.out.println("1. View bike listing\n2. Add bike listing\n3. Delete bike listing\n4. Quit");


	}

	// ================================= Option 1 View items (CRUD- Read) =================================
	public static String retrieveAllbike(ArrayList<bike> bikeList) {
		String output = "";

		for (int i = 0; i < bikeList.size(); i++) {

			output += String.format("%-10d %-10s %-20s %-20d\n", bikeList.get(i).getId(), bikeList.get(i).getName(),
					bikeList.get(i).getDescription(), bikeList.get(i).getPrice());
		}

		return output;
	}

	public static void viewAllBikeList(ArrayList<bike> bikeList) {
		String output = String.format("%-10s %-10s %-20s %-20s\n", "ID", "NAME", "DESCRIPTION", "PRICE");
		output += retrieveAllbike(bikeList);
		System.out.println(output);
	}

	// ================================= Option 2 Add an item (CRUD - Create) =================================
	public static bike inputBike() {
		int id = Helper.readInt("Enter id > ");
		String name = Helper.readString("Enter name > ");
		String description = Helper.readString("Enter description > ");
		int price = Helper.readInt("Enter price > ");

		bike b = new bike(id, name, description, price);
		return b;

	}

	public static void addbike(ArrayList<bike> bikeList, bike b) {

		bikeList.add(b);

	}

//================================= Option 3 Delete items (CRUD- Delete) =================================
	public static boolean deleteBike(ArrayList<bike> bikeList, int id) {
	    boolean isDeleted = false;
	    
	    for(int i = 0; i < bikeList.size(); i++) {
	      if(bikeList.get(i).getId() == id) {
	        bikeList.remove(i);  //to remove from the bikepartList
	        isDeleted = true;
	      }
	    }
	    return isDeleted;
	  }

	  public static void delBike(ArrayList<bike> bikeList) {
	    viewAllBikeList(bikeList);
	    int id = Helper.readInt("Enter id of bike > ");
	    
	    boolean isDeleted = deleteBike(bikeList, id);
	    if(isDeleted == false) {
	    	System.out.println("Unsuccessful Deletion");
	    } else {
	    	System.out.println("Bike " + id + " deleted");
	    }
	  }

	}
			


