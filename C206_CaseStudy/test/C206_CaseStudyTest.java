import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private employee emp1;
	private employee emp2;
	private employee emp3;
	private employee emp4;
	private customer cust1;
	private customer cust2;
	private customer cust3;
	private customer cust4;
	
	private ArrayList <employee> employeeList;
	private ArrayList <customer> customerList;
	
	@Before
	public void setUp() throws Exception {
		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		emp4 = new employee(null, null, null, null);
		
		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust2 = new customer("Hanna","Hanna@97","Hanna.SG@gmail.com","HannaKana");
		cust3 = new customer("AnyName","AnyName@00","AnyEmail@gmail.com","AnyUsername");
		cust4 = new customer(null, null, null,null);
		
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
		C206_CaseStudy.AddCustomer(customerList, cust1);
		assertEquals("Test if that Customer arraylist size is 1?", 1, customerList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that the Customer is added same as 1st item of the list?", cust1, customerList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.AddCustomer(customerList, cust2);
		C206_CaseStudy.AddCustomer(customerList, cust3);
		assertEquals("Test that Customer arraylist size is 3?", 3, customerList.size());
		assertSame("Test that Customer is added same as 3rd item of the list?", cust3, customerList.get(2));

	}
	@Test
	public void testAddEmployee() {
		//fail("Not yet implemented"); 
		assertNotNull("Test if emplloyeeList is empty",employeeList);
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.AddEmployee(employeeList, emp1);
		assertEquals("Test if that Employee arraylist size is 1?", 1, employeeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that the Employee is added same as 1st item of the list?", emp1, employeeList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.AddEmployee(employeeList, emp2);
		C206_CaseStudy.AddEmployee(employeeList, emp3);
		assertEquals("Test that Employee arraylist size is 3?", 3, employeeList.size());
		assertSame("Test that Employee is added same as 3rd item of the list?", emp3, employeeList.get(2));

	}
	@Test
	public void testViewCustomer(){
		assertNotNull("Test if there is a valid Customer ArrayList to add to", customerList);
		
		String srchUsername="";
		String cust = C206_CaseStudy.ViewCustomer(customerList,srchUsername);
		String testOutput = "Username not found.";
		assertEquals("Check that ViewCustomer run",testOutput,cust);
		
		C206_CaseStudy.AddCustomer(customerList, cust1);
		C206_CaseStudy.AddCustomer(customerList, cust2);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		
		srchUsername = "Jackson2004";
		cust = C206_CaseStudy.ViewCustomer(customerList,srchUsername);
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
		String emp = C206_CaseStudy.ViewEmployee(employeeList,srchID);
		String testOutput = "Employee not found.";
		assertEquals("Check that ViewEmployee run",testOutput,emp);
		
		C206_CaseStudy.AddEmployee(employeeList, emp1);
		C206_CaseStudy.AddEmployee(employeeList, emp2);
		assertEquals("Test that employeeList have 2 employee",2,employeeList.size());
		
		srchID = "J123A";
		emp = C206_CaseStudy.ViewEmployee(employeeList,srchID);
		testOutput = String.format("Employee ID: %s\n"
				+ "Name: %s\n"
				+ "Password: %s\n"
				+ "Email: %s","J123A","John", "John@0203200","John@blc.com" );
		
		assertEquals("Test that ViewEmployee run",testOutput,emp);
		
	}

}
