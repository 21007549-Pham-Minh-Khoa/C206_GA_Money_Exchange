import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Employee_Customer_mainTest {


	

	private employee emp1;
	private employee emp2;
	private employee emp3;

	private customer cust1;
	private customer cust2;
	private customer cust3;
	
	private ArrayList <employee> employeeList;
	private ArrayList <customer> customerList;
	
	public Employee_Customer_mainTest() {
		super();
	}
	



	
	@Before
	public void setUp() throws Exception {


		

		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		
		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust2 = new customer("Hanna","Hanna@99","Hanna1999@gmail.com","Hanna1999");
		cust3 = new customer("Jessy","Jessy@95","Jessy1995@gmail.com","Jessy1995");
		
		employeeList = new ArrayList<employee>();
		customerList = new ArrayList<customer>();

	}
	

	@After
	public void tearDown() throws Exception {
		cust1 = null;
		cust2 = null;
		cust3 = null;
		emp1 = null;
		emp2 = null;
		emp3 = null;
		employeeList = null;
		customerList = null;
	}

	@Test
	public void testAddCustomer() {
		//fail("Not yet implemented"); 
		assertNotNull("Test if customerList is empty",customerList);
		// Given an empty list, after adding 1 item, the size of the list is 1
		Employee_Customer_main.AddCustomer(customerList, cust1);
		assertEquals("Test if that Customer arraylist size is 1?", 1, customerList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that the Customer is added same as 1st item of the list?", cust1, customerList.get(0));

		// Add another item. test The size of the list is 2?
		Employee_Customer_main.AddCustomer(customerList, cust2);
		Employee_Customer_main.AddCustomer(customerList, cust3);
		assertEquals("Test that Customer arraylist size is 3?", 3, customerList.size());
		assertSame("Test that Customer is added same as 3rd item of the list?", cust3, customerList.get(2));

	}
	@Test
	public void testAddEmployee() {
		//fail("Not yet implemented"); 
		assertNotNull("Test if emplloyeeList is empty",employeeList);
		// Given an empty list, after adding 1 item, the size of the list is 1
		Employee_Customer_main.AddEmployee(employeeList, emp1);
		assertEquals("Test if that Employee arraylist size is 1?", 1, employeeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that the Employee is added same as 1st item of the list?", emp1, employeeList.get(0));

		// Add another item. test The size of the list is 2?
		Employee_Customer_main.AddEmployee(employeeList, emp2);
		Employee_Customer_main.AddEmployee(employeeList, emp3);
		assertEquals("Test that Employee arraylist size is 3?", 3, employeeList.size());
		assertSame("Test that Employee is added same as 3rd item of the list?", emp3, employeeList.get(2));

	}
	@Test
	public void testViewCustomer(){
		assertNotNull("Test if there is a valid Customer ArrayList to add to", customerList);
		
		String srchUsername="";
		String cust = Employee_Customer_main.ViewCustomer(customerList,srchUsername);
		String testOutput = "Username not found.";
		assertEquals("Check that ViewCustomer run",testOutput,cust);
		
		Employee_Customer_main.AddCustomer(customerList, cust1);
		Employee_Customer_main.AddCustomer(customerList, cust2);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		
		srchUsername = "Jackson2004";
		cust = Employee_Customer_main.ViewCustomer(customerList,srchUsername);
		testOutput = String.format("Username: %s\n"
				+ "Name: %s\n"
				+ "Password: %s\n"
				+ "Email: %s", "Jackson2004","Jackson","Jacky@04","Jackson2004@gmail.com");
		
		assertEquals("Test that ViewCustomer run",testOutput,cust);
		
	}
	@Test
	public void testViewEmployee(){
		assertNotNull("Test if there is a valid Employee ArrayList to add to", employeeList);
		
		String srchID="";
		String emp = Employee_Customer_main.ViewEmployee(employeeList,srchID);
		String testOutput = "Employee not found.";
		assertEquals("Check that ViewEmployee run",testOutput,emp);
		
		Employee_Customer_main.AddEmployee(employeeList, emp1);
		Employee_Customer_main.AddEmployee(employeeList, emp2);
		assertEquals("Test that employeeList have 2 employee",2,employeeList.size());
		
		srchID = "J123A";
		emp = Employee_Customer_main.ViewEmployee(employeeList,srchID);
		testOutput = String.format("Employee ID: %s\n"
				+ "Name: %s\n"
				+ "Password: %s\n"
				+ "Email: %s","J123A","John", "John@0203200","John@blc.com" );
		
		assertEquals("Test that ViewEmployee run",testOutput,emp);
		
	}
	
	@Test
	public void testDeleteCustomer() {
		assertNotNull("Test if there is a valid Customer ArrayList", customerList);
		
		Employee_Customer_main.AddCustomer(customerList, cust1);
		Employee_Customer_main.AddCustomer(customerList, cust2);
		Employee_Customer_main.AddCustomer(customerList, cust3);
		assertEquals("Test that customerList have 3 customer", 3, customerList.size());
		
		String srchUsername = "Sammy123";
		String testOutput = "User not found";
		String msg = Employee_Customer_main.DeleteCustomer(customerList, srchUsername);
		assertEquals("Test that customerList have 3 customer",3,customerList.size());
		assertSame("Test that the first customer in the list is cust1", cust1, customerList.get(0));
		assertSame("Test that the second customer in the list is cust2", cust2, customerList.get(1));
		assertSame("Test that the second customer in the list is cust3", cust3, customerList.get(2));
		assertEquals("Test the message", testOutput, msg);
		
		srchUsername = cust1.getUsername();
		testOutput = "Remove user "+cust1.getUsername();
		msg = Employee_Customer_main.DeleteCustomer(customerList, srchUsername);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		assertSame("Test that the first customer in the list is cust2", cust2, customerList.get(0));
		assertSame("Test that the second customer in the list is cust3", cust3, customerList.get(1));
		assertEquals("Test the message", testOutput, msg);
		
	}
	
	@Test
	public void testDeleteEmployee() {
		assertNotNull("Test if there is a valid Employee ArrayList", employeeList);
		
		Employee_Customer_main.AddEmployee(employeeList, emp1);
		Employee_Customer_main.AddEmployee(employeeList, emp2);
		Employee_Customer_main.AddEmployee(employeeList, emp3);
		assertEquals("Test that employeeList have 3 customer", 3, employeeList.size());
		
		String srchUserID = "S123A";
		String testOutput = "Employee not found";
		String msg = Employee_Customer_main.DeleteEmployee(employeeList, srchUserID);
		assertEquals("Test that employeeList have 3 employee",3,employeeList.size());
		assertSame("Test that the first employee in the list is emp1", emp1, employeeList.get(0));
		assertSame("Test that the second employee in the list is emp2", emp2, employeeList.get(1));
		assertSame("Test that the second employee in the list is emp3", emp3, employeeList.get(2));
		assertEquals("Test the message", testOutput, msg);
		
		srchUserID = emp1.getEmployeeID();
		testOutput = "Remove user "+emp1.getName();
		msg = Employee_Customer_main.DeleteEmployee(employeeList, srchUserID);
		assertEquals("Test that employeeList have 2 employee", 2, employeeList.size());
		assertSame("Test that the first employee in the list is emp2", emp2, employeeList.get(0));
		assertSame("Test that the second employee in the list is emp3", emp3, employeeList.get(1));
		assertEquals("Test the message", testOutput, msg);
		
	}
	
	
	@Test
	public void testdoLoginCustomer() {

		assertNotNull("Test if there is a valid customer ArrayList", customerList);

		Employee_Customer_main.AddCustomer(customerList, cust1);
		Employee_Customer_main.AddCustomer(customerList, cust2);
		Employee_Customer_main.AddCustomer(customerList, cust3);
		assertEquals("Test that employeeList have 3 customer", 3, customerList.size());

		String loginName = "";
		String password = "";
		boolean online = Employee_Customer_main.LoginCustomer(customerList, loginName, password);
		String testOutput = "Check your username and/or password";
		String logInMess = Employee_Customer_main.doLoginCustomer(customerList, loginName, password);
		assertFalse("Test the default online status is false", online);
		assertSame("Test that the error message is displayed", testOutput, logInMess);

		loginName += cust1.getEmail();
		password += cust1.getPassword();
		online = Employee_Customer_main.LoginCustomer(customerList, loginName, password);
		testOutput = "Welcome to Bike Lover Community";
		logInMess = Employee_Customer_main.doLoginCustomer(customerList, loginName, password);
		assertTrue("Test the default online status is true", online);
		assertSame("Test that the error message is displayed", testOutput, logInMess);
	}
	
	@Test
	public void testdoLoginEmployee() {

		assertNotNull("Test if there is a valid Employee ArrayList", employeeList);

		Employee_Customer_main.AddEmployee(employeeList, emp1);
		Employee_Customer_main.AddEmployee(employeeList, emp2);
		Employee_Customer_main.AddEmployee(employeeList, emp3);
		assertEquals("Test that employeeList have 3 employee", 3, employeeList.size());

		String loginName = "";
		String password = "";
		boolean online = Employee_Customer_main.LoginEmployee(employeeList, loginName, password);
		String testOutput = "Check your username and/or password";
		String logInMess = Employee_Customer_main.doLoginEmployee(employeeList, loginName, password);
		assertFalse("Test the default online status is false", online);
		assertSame("Test that the error message is displayed", testOutput, logInMess);

		loginName += emp1.getEmployeeID();
		password += emp1.getPassword();
		online = Employee_Customer_main.LoginEmployee(employeeList, loginName, password);
		testOutput = "Welcome to Bike Lover Community";
		logInMess = Employee_Customer_main.doLoginEmployee(employeeList, loginName, password);
		assertTrue("Test the default online status is true", online);
		assertSame("Test that the error message is displayed", testOutput, logInMess);
	}
	 


}
	