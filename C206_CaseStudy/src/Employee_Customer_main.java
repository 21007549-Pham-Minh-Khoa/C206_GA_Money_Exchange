import java.util.*;

public class Employee_Customer_main {

	private static employee emp1;
	private static employee emp2;
	private static employee emp3;

	private static customer cust1;
	private static customer cust2;
	private static customer cust3;

	private static ArrayList<employee> employeeList;
	private static ArrayList<customer> customerList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp1 = new employee("John", "John@0203200", "John@blc.com", "J123A");
		emp2 = new employee("James", "jAmEss$$1998", "James@blc.com", "J224D");
		emp3 = new employee("Jenny", "Jenny$052002", "Jenny@blc.com", "J689F");

		cust1 = new customer("Jackson", "Jacky@04", "Jackson2004@gmail.com", "Jackson2004");
		cust2 = new customer("Hanna", "Hanna@99", "Hanna1999@gmail.com", "Hanna1999");
		cust3 = new customer("Jessy", "Jessy@95", "Jessy1995@gmail.com", "Jessy1995");

		employeeList = new ArrayList<employee>();
		customerList = new ArrayList<customer>();

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);

		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);

		start();
	}

	private static void start() {
		// TODO Auto-generated method stub

		int choice = 0;
		while (choice != 3) {
			option();
			choice = Helper.readInt("Enter your choice > ");
			if (choice == 1) {
				String username_email = Helper.readString("Enter Username/email > ");
				String password = Helper.readString("Enter Password > ");
				boolean correct = LoginCustomer(customerList, username_email, password);
				String output = doLoginCustomer(customerList, username_email, password);
				if (correct == true) {
					System.out.println(output);
					startCustomer();
					
				} else {
					System.out.println(output);
				}

			} else if (choice == 2) {
				String employeeID = Helper.readString("Enter Username/email > ");
				String password = Helper.readString("Enter Password > ");
				boolean correct = LoginEmployee(employeeList, employeeID, password);
				String output = doLoginEmployee(employeeList, employeeID, password);
				
				if (correct == true) {
					System.out.println(output);
					startEmployee();
					
				} else {
					System.out.println(output);
				}
				
				
			} else if (choice == 3) {
				System.out.println("Good Bye!");
			}
		}
	}

	private static void startEmployee() {
		// TODO Auto-generated method stub
		int opt = 0;
		while (opt != 4) {
			menuEmployee();
			opt = Helper.readInt("Enter your choice > ");
			if (opt == 1) {
				employee a = inputEmployee();
				AddEmployee(employeeList, a);

			} else if (opt == 2) {
				int counter = 1;
				for (employee i : employeeList) {
					System.out.println((counter++) + ". " + i.getName() + " - " + i.getEmployeeID());
				}
				String id = Helper.readString("Enter id: ");
				String output = ViewEmployee(employeeList, id);
				System.out.println(output);

			} else if (opt == 3) {
				int counter = 0;
				for (employee i : employeeList) {
					System.out.println(counter + ". " + i.getName() + " - " + i.getEmployeeID());
				}
				String id = Helper.readString("Enter id: ");
				DeleteEmployee(employeeList, id);
			}
		}
	}

	private static void startCustomer() {
		int opt = 0;
		while (opt != 4) {
			menuCustomer();
			opt = Helper.readInt("Enter your choice > ");
			if (opt == 1) {
				customer a = inputCustomer();
				AddCustomer(customerList, a);

			} else if (opt == 2) {
				int counter = 1;
				for (customer i : customerList) {
					System.out.println((counter++) + ". " + i.getUsername());
				}
				String username = Helper.readString("Enter username: ");
				String output = ViewCustomer(customerList, username);
				System.out.println(output);

			} else if (opt == 3) {
				int counter = 0;
				for (customer i : customerList) {
					System.out.println(counter + ". " + i.getUsername());
				}
				String username = Helper.readString("Enter username: ");
				DeleteCustomer(customerList, username);
			} else if (opt == 4) {
				System.out.println("Good Bye!");
			}
		}
	}

	private static void option() {
		// TODO Auto-generated method stub
		System.out.println("Bike Lover Community");
		Helper.line(30, "=");
		System.out.println("1. Customer");
		System.out.println("2. Admin");
		System.out.println("3. Quit");
		Helper.line(30, "=");
		System.out.println(" ");
	}

	private static void menuCustomer() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		Helper.line(30, "=");
		System.out.println("1. Add customer");
		System.out.println("2. View customer");
		System.out.println("3. Delete customer");
		System.out.println("4. Back");
		Helper.line(30, "=");
		System.out.println(" ");
	}

	private static void menuEmployee() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		Helper.line(30, "=");
		System.out.println("1. Add employee");
		System.out.println("2. View employee");
		System.out.println("3. Delete employee");
		System.out.println("4. Back");
		Helper.line(30, "=");
		System.out.println(" ");
	}

	

	

//===================================================ADD CUSTOMER=================================================================//
	public static customer inputCustomer() {
		customer cust = null;
		String fname = Helper.readString("Enter your first name: ");
		String lname = Helper.readString("Enter your last name: ");
		String name = fname + lname;

		String email = Helper.readString("Enter your email: ");
		String password = Helper.readString("Set your Password: ");

		String username = Helper.readString("Enter your username: ");

		cust = new customer(name, password, email, username);

		return cust;

	}
	
	public static void AddCustomer(ArrayList<customer> customerList, customer cust) {
		customerList.add(cust);

	}

//==================================================ADD EMPLOYEE==================================================================//		
	public static employee inputEmployee() {
		employee emp = null;
		String fname = Helper.readString("Enter your first name: ");
		String lname = Helper.readString("Enter your last name: ");
		String name = fname + lname;

		String email = Helper.readString("Enter your orgs email: ");
		String password = Helper.readString("Set Your Password: ");

		Random ID = new Random();
		int i = ID.nextInt();
		String employeeID = fname + i;

		emp = new employee(name, password, email, employeeID);

		return emp;
	}
	
	public static void AddEmployee(ArrayList<employee> employeeList, employee emp) {
		employeeList.add(emp);
	}

//==================================================VIEW CUSTOMER=================================================================//

	public static String ViewCustomer(ArrayList<customer> customerList, String srch_Username) {
		// srch_Username = Helper.readString("Enter username to search: ");
		boolean isFound = findCustomer(customerList, srch_Username);
		String output = "";

		if (isFound == true) {
			for (customer i : customerList) {
				if (srch_Username.equals(i.getUsername())) {
					output = String.format("Username: %s\n" + "Name: %s\n" + "Password: %s\n" + "Email: %s",
							i.getUsername(), i.getName(), i.getPassword(), i.getEmail());
					break;
				}
			}
		} else {
			output = "Username not found.";
		}
		return output;
	}

//===================================================VIEW EMPLOYEE==============================================================//

	public static String ViewEmployee(ArrayList<employee> employeeList, String employeeID) {
		String output = "";
		boolean isFound = findEmployee(employeeList, employeeID);
		if (isFound == true) {
			for (employee i : employeeList) {
				if (employeeID.equals(i.getEmployeeID())) {
					output = String.format("Employee ID: %s\n" + "Name: %s\n" + "Password: %s\n" + "Email: %s",
							i.getEmployeeID(), i.getName(), i.getPassword(), i.getEmail());
					break;
				}
			}
		} else {
			output = "Employee not found.";
		}

		return output;
	}

//=======================================DELETE CUSTOMER================================================================//

	public static String DeleteCustomer(ArrayList<customer> customerList, String username) {
		String output = "User not found";
		boolean isFound = findCustomer(customerList, username);

		if (isFound == true) {
			for (customer i : customerList) {
				if (username.equals(i.getUsername())) {
					customerList.remove(i);
					output = "Remove user " + i.getUsername();
					break;
				}
			}
		}
		return output;
	}

//==================================DELETE EMPLOYEE=====================================================================//

	public static String DeleteEmployee(ArrayList<employee> employeeList, String srchUserID) {
		String output = "Employee not found";
		boolean isFound = findEmployee(employeeList, srchUserID);

		if (isFound == true) {
			for (employee i : employeeList) {
				if (srchUserID.equals(i.getEmployeeID())) {
					employeeList.remove(i);
					output = "Remove user " + i.getName();
					break;
				}
			}
		}
		return output;
	}

//=======================================LOGIN CUSTOMER==================================================================//

	public static boolean LoginCustomer(ArrayList<customer> customerList, String username_email, String password) {
		boolean online = false;
		for (customer i : customerList) {
			if ((i.getUsername().equals(username_email) || i.getEmail().equals(username_email))) {
				if (i.getPassword().equals(password)) {
					online = true;
					break;
				}
			}
		}
		return online;
	}

	public static String doLoginCustomer(ArrayList<customer> customerList, String username_email, String password) {
		String output = "";
		boolean online = LoginCustomer(customerList, username_email, password);
		if (online == true) {
			output = "Welcome to Bike Lover Community";
		} else {
			output = "Check your username and/or password";
		}
		return output;
	}

	public static boolean LoginEmployee(ArrayList<employee> employeeList, String employeeId, String password) {
		boolean online = false;
		for (employee i : employeeList) {
			if ((i.getEmployeeID().equals(employeeId))) {
				if (i.getPassword().equals(password)) {
					online = true;
					break;
				}
			}
		}
		return online;
	}

//=====================================LOGIN EMPLOYEE==================================================================//

	public static String doLoginEmployee(ArrayList<employee> employeeList, String loginId, String password) {
		String output = "";
		boolean online = LoginEmployee(employeeList, loginId, password);
		if (online == true) {
			output = "Welcome to Bike Lover Community";
		} else {
			output = "Check your username and/or password";
		}
		return output;
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
