import java.util.*;

public class C206_CaseStudy {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		employee emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		employee emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		
		customer cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		customer cust2 = new customer("Hanna","Hanna@97","Hanna.SG@gmail.com","HannaKana");
		customer cust3 = new customer("AnyName","AnyName@00","AnyEmail@gmail.com","AnyUsername");
		ArrayList <employee> employeeList = new ArrayList<employee>();
		ArrayList <customer> customerList = new ArrayList<customer>();
		
	ArrayList<Appointment> appointmentList= new ArrayList<Appointment>();
	}
	
		public static String retrieveAllAppointment(ArrayList<Appointment> appointmentList) {
		String output = "";
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
	
	
		public static Appointment inputAppointment() {
			String date = Helper.readString("Enter date > ");
			String time= Helper.readString("Enter time > ");
			String username = Helper.red

			Appointment ap = new Appointment(name,email,date, time);
			return ap;
			
		}
		public static void addAppointment(ArrayList<Appointment> appointmentList, Appointment ap) {
			
			appointmentList.add(ap);
			
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
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void AddCustomer(ArrayList<customer> customerList, customer cust) {
			customerList.add(cust);
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
		
		public static void DeleteCustomer(ArrayList<customer> customerList,customer cust) {
			
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void DeleteEmployee(ArrayList<employee> employeeList, employee emp) {
			
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void LoginCustomer(ArrayList<customer> customerList, String username, String email, String password) {
			
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

