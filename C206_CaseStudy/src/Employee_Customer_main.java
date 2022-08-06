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

		emp1 = new employee("John", "John@0203200", "John@blc.com");
		emp2 = new employee("James", "jAmEss$$1998", "James@blc.com");
		emp3 = new employee("Jenny", "Jenny$052002", "Jenny@blc.com");

		cust1 = new customer("Jackson", "Jackson2004@gmail.com",88602174);
		cust2 = new customer("Hanna",  "Hanna1999@gmail.com", 88602179);
		cust3 = new customer("Jessy",  "Jessy1995@gmail.com", 88602175);

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
					System.out.println((counter++) + ". " + i.getName());
				}
				String username = Helper.readString("Enter username: ");
				String output = ViewCustomer(customerList, username);
				System.out.println(output);

			} else if (opt == 3) {
				int counter = 0;
				for (customer i : customerList) {
					System.out.println(counter + ". " + i.getName());
				}
				String username = Helper.readString("Enter username: ");
				DeleteCustomer(customerList, username);
			} else if (opt == 4) {
				System.out.println("");
			}
		}
	}

	
	private static void menuCustomer() {
		// TODO Auto-generated method stub
		Helper.line(30, "=");
		System.out.println("1. Add customer");
		System.out.println("2. View customer");
		System.out.println("3. Delete customer");
		System.out.println("4. Back");
		Helper.line(30, "=");
		
	}

	

	

	

//===================================================ADD CUSTOMER=================================================================//
	public static customer inputCustomer() {
		customer cust = null;
		String fname = Helper.readString("Enter your first name: ");
		String lname = Helper.readString("Enter your last name: ");
		String name = fname + lname;

		String email = Helper.readString("Enter your email: ");
		String password = Helper.readString("Set your Password: ");

		int mobileNo = Helper.readInt("Enter phone number: ");

		cust = new customer(name, email, mobileNo);

		return cust;

	}
	
	public static void AddCustomer(ArrayList<customer> customerList, customer cust) {
		customerList.add(cust);

	}


//==================================================VIEW CUSTOMER=================================================================//

	public static String ViewCustomer(ArrayList<customer> customerList, String srch_name) {
		// srch_Username = Helper.readString("Enter username to search: ");
		boolean isFound = findCustomer(customerList, srch_name);
		String output = "";

		if (isFound == true) {
			for (customer i : customerList) {
				if (srch_name.equals(i.getName())) {
					output = String.format("Name: %s\n" + "MobileNum: %d\n" + "Email: %s",
							 i.getName(), i.getMobilenum(), i.getEmail());
					break;
				}
			}
		} else {
			output = "Username not found.";
		}
		return output;
	}


//=======================================DELETE CUSTOMER================================================================//

	public static String DeleteCustomer(ArrayList<customer> customerList, String username) {
		String output = "User not found";
		boolean isFound = findCustomer(customerList, username);

		if (isFound == true) {
			for (customer i : customerList) {
				if (username.equals(i.getName())) {
					customerList.remove(i);
					output = "Remove user " + i.getName();
					break;
				}
			}
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
			if (i.getName().equals(srch_Username)) {
				isFound = true;
				break;
			}
		}

		return isFound;
	}



}
