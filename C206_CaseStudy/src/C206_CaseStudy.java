import java.util.*;

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

		employee emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		employee emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		employee emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		
		customer cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		customer cust2 = new customer("Hanna","Hanna@97","Hanna.SG@gmail.com","HannaKana");
		customer cust3 = new customer("AnyName","AnyName@00","AnyEmail@gmail.com","AnyUsername");
		ArrayList <employee> employeeList = new ArrayList<employee>();
		ArrayList <customer> customerList = new ArrayList<customer>();
		
	

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
		
	public static employee inputEmployee() {
		employee emp = null;
		String fname = Helper.readString("Enter your first name: ");
		String lname = Helper.readString("Enter your last name: ");
		String name = fname+lname;
		
		String email = Helper.readString("Enter your orgs email: ");
		String password = Helper.readString("Set Your Password: ");
		
		Random ID = new Random ();
		int i = ID.nextInt();
		String employeeID = fname+i;
		
		emp = new employee (name,password,email,employeeID);
		
		return emp;
	}
	

	
		public static customer inputCustomer() {
			customer cust = null;
			String fname = Helper.readString("Enter your first name: ");
			String lname = Helper.readString("Enter your last name: ");
			String name = fname+lname;
			
			String email = Helper.readString("Enter your email: ");
			String password = Helper.readString("Set your Password: ");
			
			String username = Helper.readString("Enter your username: ");
			
			cust = new customer(name,password,email,username);
			
			return cust;

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
			return isDeleted;
		}
=======
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void AddCustomer(ArrayList<customer> customerList, customer cust) {
			customerList.add(cust);

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
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		public static void AddEmployee(ArrayList<employee> employeeList, employee emp) {
			employeeList.add(emp);
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static String ViewCustomer(ArrayList<customer> customerList, String srch_Username) {
			//srch_Username = Helper.readString("Enter username to search: ");
			boolean isFound = findCustomer(customerList,srch_Username);
			String output ="";
			
			if (isFound == true) {
				for (customer i : customerList) {
					if (srch_Username.equals(i.getUsername())) {
						output = String.format("Username: %s\n"
								+ "Name: %s\n"
								+ "Password: %s\n"
								+ "Email: %s", i.getUsername(), i.getName(), i.getPassword(), i.getEmail());
						break;
					}
				}
			} else {
				output = "Username not found.";
			}
			return output;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static String ViewEmployee(ArrayList<employee> employeeList,String employeeID) {
			String output = "";
			boolean isFound = findEmployee(employeeList,employeeID);
			if (isFound == true) {
				for (employee i : employeeList) {
					if (employeeID.equals(i.getEmployeeID())) {
						output = String.format("Employee ID: %s\n"
								+ "Name: %s\n"
								+ "Password: %s\n"
								+ "Email: %s",i.getEmployeeID(), i.getName(), i.getPassword(),i.getEmail() );
						break;
					}
				}
			} else {
				output = "Employee not found.";
			}
			
			return output;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static String DeleteCustomer(ArrayList<customer> customerList,String username) {
			String output = "User not found";
			boolean isFound = findCustomer(customerList,username);
			
			if(isFound == true) {
				for(customer i : customerList) {
					if(username.equals(i.getUsername())) {
						customerList.remove(i);
						output = "Remove user "+i.getUsername();
						break;
					} 
				}
			}
			return output;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static String DeleteEmployee(ArrayList<employee> employeeList, String srchUserID) {
			String output = "Employee not found";
			boolean isFound = findEmployee(employeeList,srchUserID);
			
			if(isFound == true) {
				for(employee i : employeeList) {
					if(srchUserID.equals(i.getEmployeeID())) {
						employeeList.remove(i);
						output = "Remove user "+i.getName();
						break;
					} 
				}
			}
			return output;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static boolean LoginCustomer(ArrayList<customer> customerList, String username_email, String password) {
			boolean online = false;
			return online;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void LoginEmployee(ArrayList<employee> employeeList, String employeeId, String email,String password) {
			

		}

		

		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static boolean findCustomer(ArrayList<customer> customerList, String srch_Username) {
			boolean isFound = false;
			for (customer i : customerList) {
				if (i.getUsername().equals(srch_Username)) {
					isFound = true;
					break;
				}
			}
			
			
			return isFound;
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static boolean findEmployee(ArrayList<employee> employeeList, String employeeID) {
			boolean isFound = false;
			for (employee i : employeeList) {
				if (i.getEmployeeID().equals(employeeID)) {
					isFound = true;
					break;
				}
			}
			
			
			return isFound;
		}
}

