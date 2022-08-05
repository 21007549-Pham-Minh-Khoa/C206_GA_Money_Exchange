import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C206_CaseStudyTest {

	private Appointment app1;
	private Appointment app2;
	private ArrayList<Appointment> appointmentList;
	
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
		
		//test if the list of appointment retrieved from the SourceCentre is empty
		String allappointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);
		String testOutput = "";
		assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addAppointment(appointmentList, app1);
		C206_CaseStudy.addAppointment(appointmentList, app2);
		assertEquals("Test if that appointment arraylist size is 2?", 2, appointmentList.size());
		
		//test if the expected output string same as the list of appointment retrieved from the SourceCentre
		allappointment= C206_CaseStudy.retrieveAllAppointment(appointmentList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
	
		assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
	}
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
