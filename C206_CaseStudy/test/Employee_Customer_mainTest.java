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
	
	



	
	@Before
	public void setUp() throws Exception {


		

		emp1 = new employee("John", "John@0203200", "John@blc.com");
		emp2 = new employee("James", "jAmEss$$1998", "James@blc.com");
		emp3 = new employee("Jenny", "Jenny$052002", "Jenny@blc.com");

		cust1 = new customer("Jackson", "Jackson2004@gmail.com",88602174);
		cust2 = new customer("Hanna",  "Hanna1999@gmail.com", 88602179);
		cust3 = new customer("Jessy",  "Jessy1995@gmail.com", 88602175);
		
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
	public void testViewCustomer(){
		assertNotNull("Test if there is a valid Customer ArrayList to add to", customerList);
		
		String srchUsername="";
		String cust = Employee_Customer_main.ViewCustomer(customerList,srchUsername);
		String testOutput = "Username not found.";
		assertEquals("Check that ViewCustomer run",testOutput,cust);
		
		Employee_Customer_main.AddCustomer(customerList, cust1);
		Employee_Customer_main.AddCustomer(customerList, cust2);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		
		srchUsername =cust1.getName();
		cust = Employee_Customer_main.ViewCustomer(customerList,srchUsername);
		testOutput = String.format("Name: %s\n" + 
		"MobileNum: %d\n" + 
				"Email: %s", 
				"Jackson",88602174,"Jackson2004@gmail.com");
		
		assertEquals("Test that ViewCustomer run",testOutput,cust);
		
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
		
		srchUsername = cust1.getName();
		testOutput = "Remove user "+cust1.getName();
		msg = Employee_Customer_main.DeleteCustomer(customerList, srchUsername);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		assertSame("Test that the first customer in the list is cust2", cust2, customerList.get(0));
		assertSame("Test that the second customer in the list is cust3", cust3, customerList.get(1));
		assertEquals("Test the message", testOutput, msg);
		
	}


}
	