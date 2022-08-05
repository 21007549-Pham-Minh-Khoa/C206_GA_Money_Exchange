import java.util.ArrayList;

public class test {
	private static employee emp1;
	private static employee emp2;
	private static employee emp3;

	private static customer cust1;
	private static customer cust2;
	private static customer cust3;
	
	private static ArrayList <employee> employeeList;
	private static ArrayList <customer> customerList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		
		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust2 = new customer("Hanna","Hanna@99","Hanna1999@gmail.com","Hanna1999");
		cust3 = new customer("Jessy","Jessy@95","Jessy1995@gmail.com","Jessy1995");
		
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
		String username_email = cust1.getEmail();
		String password = cust1.getPassword();
		System.out.println(doLoginCustomer(customerList,username_email,password));
	}

	public static boolean LoginCustomer(ArrayList<customer> customerList, String username_email, String password) {
		boolean online = false;
		for (customer i : customerList) {
			if((i.getUsername().equals(username_email) || i.getEmail().equals(username_email))) {
				if(i.getPassword().equals(password)) {
					online = true;
					break;
				}
			}
					
		}
		return online;
	}
	
	public static String doLoginCustomer(ArrayList<customer> customerList, String username_email, String password) {
		String output = "";
		boolean online = LoginCustomer(customerList,username_email,password);
		if(online == true) {
			output = "Welcome to Bike Lover Community";
		} else {
			output = "Check your username and/or password";
		}
		return output;
	}
}
