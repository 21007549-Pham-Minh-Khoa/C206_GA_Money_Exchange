import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C206_CaseStudyTest {
<<<<<<< HEAD

	private Appointment app1;
	private Appointment app2;
	private ArrayList<Appointment> appointmentList;
=======
	private employee emp1;
	private employee emp2;
	private employee emp3;
	private employee emp4;
	private customer cust1;
	private customer cust2;
	private customer cust3;
	private customer cust4;
>>>>>>> branch 'master' of https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
	
	public C206_CaseStudyTest() {
		super();
	}
	

//	private employee emp1;
//	private employee emp2;
//	private employee emp3;
//	private customer cust1;
//	private customer cust2;
//	private customer cust3;
//	
//	private ArrayList <employee> employeeList;
//	private ArrayList <customer> customerList;
	
	@Before
	public void setUp() throws Exception {
<<<<<<< HEAD

		app1 = new Appointment ("01/01/20" , "22:30" , "Daryl" , "DarylU" , "daryl@gmail.com");
		app2 = new Appointment ("01/02/20" , "22:30" , "Khoa" , "KhoaU" , "Khoa@gmail.com");
		appointmentList = new ArrayList <Appointment>();

//		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
//		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
//		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
//		
//		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
//		cust2 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
//		cust3 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
//		
//		employeeList = new ArrayList<employee>();
//		customerList = new ArrayList<customer>();

	}
	
	public void testAddAppointment() {
	assertNotNull("Test if there is valid Appointment arraylist to add to", appointmentList);
	
	//Given an empty list, after adding 1 item, the size of the list is 1
	C206_CaseStudy.addAppointment(appointmentList, app1);		
	assertEquals("Test if that appointment arraylist size is 1?", 1, appointmentList.size());
	
	//The item just added is as same as the first item of the list
	assertSame("Test that appointment is added same as 1st item of the list?", app1, appointmentList.get(0));
	
	//Add another item. test The size of the list is 2?
	C206_CaseStudy.addAppointment(appointmentList, app2);
	assertEquals("Test that appointment arraylist size is 2?", 2, appointmentList.size());
	assertSame("Test that appointment is added same as 3rd item of the list?", app2, appointmentList.get(2));
	}
	
	public void testRetrieveAllAppointment() {
		assertNotNull("Test if there is valid Chromebook arraylist to add to", appointmentList);
=======
		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		emp4 = new employee(null, null, null, null);
>>>>>>> branch 'master' of https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
		
<<<<<<< HEAD
		//test if the list of appointment retrieved from the SourceCentre is empty
		String allappointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, app1);
		C206_CaseStudy.addAppointment(appointmentList, app2);
		assertEquals("Test if that appointment arraylist size is 2?", 2, appointmentList.size());
=======
		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust2 = new customer("Hanna","Hanna@97","Hanna.SG@gmail.com","HannaKana");
		cust3 = new customer("AnyName","AnyName@00","AnyEmail@gmail.com","AnyUsername");
		cust4 = new customer(null, null, null,null);
>>>>>>> branch 'master' of https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
		
<<<<<<< HEAD
		//test if the expected output string same as the list of appointment retrieved from the SourceCentre
		allappointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
	
		assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
=======
		employeeList = new ArrayList<employee>();
		customerList = new ArrayList<customer>();
		
>>>>>>> branch 'master' of https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
	}
<<<<<<< HEAD
=======

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
	
	@Test
	public void testDeleteCustomer() {
		assertNotNull("Test if there is a valid Customer ArrayList", customerList);
		
		C206_CaseStudy.AddCustomer(customerList, cust1);
		C206_CaseStudy.AddCustomer(customerList, cust2);
		C206_CaseStudy.AddCustomer(customerList, cust3);
		assertEquals("Test that customerList have 3 customer", 3, customerList.size());
		
		String srchUsername = "Sammy123";
		String testOutput = "User not found";
		String msg = C206_CaseStudy.DeleteCustomer(customerList, srchUsername);
		assertEquals("Test that customerList have 3 customer",3,customerList.size());
		assertSame("Test that the first customer in the list is cust1", cust1, customerList.get(0));
		assertSame("Test that the second customer in the list is cust2", cust2, customerList.get(1));
		assertSame("Test that the second customer in the list is cust3", cust3, customerList.get(2));
		assertEquals("Test the message", testOutput, msg);
		
		srchUsername = cust1.getUsername();
		testOutput = "Remove user "+cust1.getUsername();
		msg = C206_CaseStudy.DeleteCustomer(customerList, srchUsername);
		assertEquals("Test that customerList have 2 customer",2,customerList.size());
		assertSame("Test that the first customer in the list is cust2", cust2, customerList.get(0));
		assertSame("Test that the second customer in the list is cust3", cust3, customerList.get(1));
		assertEquals("Test the message", testOutput, msg);
		
	}
	
	@Test
	public void testDeleteEmployee() {
		assertNotNull("Test if there is a valid Employee ArrayList", employeeList);
		
		C206_CaseStudy.AddEmployee(employeeList, emp1);
		C206_CaseStudy.AddEmployee(employeeList, emp2);
		C206_CaseStudy.AddEmployee(employeeList, emp3);
		assertEquals("Test that employeeList have 3 customer", 3, employeeList.size());
		
		String srchUserID = "S123A";
		String testOutput = "Employee not found";
		String msg = C206_CaseStudy.DeleteEmployee(employeeList, srchUserID);
		assertEquals("Test that employeeList have 3 employee",3,employeeList.size());
		assertSame("Test that the first employee in the list is emp1", emp1, employeeList.get(0));
		assertSame("Test that the second employee in the list is emp2", emp2, employeeList.get(1));
		assertSame("Test that the second employee in the list is emp3", emp3, employeeList.get(2));
		assertEquals("Test the message", testOutput, msg);
		
		srchUserID = emp1.getEmployeeID();
		testOutput = "Remove user "+emp1.getName();
		msg = C206_CaseStudy.DeleteEmployee(employeeList, srchUserID);
		assertEquals("Test that employeeList have 2 employee", 2, employeeList.size());
		assertSame("Test that the first employee in the list is emp2", emp2, employeeList.get(0));
		assertSame("Test that the second employee in the list is emp3", emp3, employeeList.get(1));
		assertEquals("Test the message", testOutput, msg);
		
	}
	
	@Test
	public void testLoginCustomer() {
		String loginName = "";
		String password = "";
		boolean online = C206_CaseStudy.LoginCustomer(customerList, loginName, password);
		assertFalse("Test the default online status is false",online);
		
		
	}

>>>>>>> branch 'master' of https://github.com/21007549-Pham-Minh-Khoa/C206_GA_Team3.git
}
	
	//public void test
	//@After
	//public void tearDown() throws Exception {
	
//
//	@Test
	//public void testAddCustomer() {
		//fail("Not yet implemented"); 
		//assertNotNull("Test if customerList is empty",customerList);
		// Given an empty list, after adding 1 item, the size of the list is 1
//		C206_CaseStudy.AddCustomer(customerList, cust1);
//		assertEquals("Test if that Camcorder arraylist size is 1?", 1, camcorderList.size());
//
//		// The item just added is as same as the first item of the list
//		assertSame("Test that Camcorder is added same as 1st item of the list?", cc1, camcorderList.get(0));
//
//		// Add another item. test The size of the list is 2?
//		ResourceCentre.addCamcorder(camcorderList, cc2);
//		ResourceCentre.addCamcorder(camcorderList, cc3);
//		assertEquals("Test that Camcorder arraylist size is 3?", 3, camcorderList.size());
//		assertSame("Test that Camcorder is added same as 3rd item of the list?", cc3, camcorderList.get(2));
//
//	}
//
//}
