import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


	

public class Appointment_test {

	private Appointment app1;
	private Appointment app2;
	private Appointment app3;
	private ArrayList<Appointment> appointmentList;
	
	public Appointment_test() {
		super();
	}
	@Before
	public void setUp() throws Exception {

			app1 = new Appointment ("01/01/20" , "22:30" , "Daryl" , "DarylU" , "daryl@gmail.com");
			app2 = new Appointment ("01/02/20" , "22:30" , "Khoa" , "KhoaU" , "Khoa@gmail.com");
			app3 = new Appointment ("01/03/20" , "22:30" , "Xin" , "XinU" , "Xin@gmail.com");
			appointmentList = new ArrayList <Appointment>();
	}
	
	@Test
	public void testAddAppointment() {
		assertNotNull("Test if there is valid Appointment arraylist to add to", appointmentList);
		
		//Given an appty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addappointment(appointmentList, app1);		
		assertEquals("Test if that appointment arraylist size is 1?", 1, appointmentList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that appointment is added same as 1st item of the list?", app1, appointmentList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addappointment(appointmentList, app2);
		C206_CaseStudy.addappointment(appointmentList, app3);
		assertEquals("Test that appointment arraylist size is 3?", 3, appointmentList.size());
		assertSame("Test that appointment is added same as 3rd item of the list?", app3, appointmentList.get(2));
		}
		
		@Test
		public void testRetrieveAllAppointment() {
			assertNotNull("Test if there is valid Chromebook arraylist to add to", appointmentList);
			
			//test if the list of appointment retrieved from the SourceCentre is appty
			String allappointment= C206_CaseStudy.retrieveAllappointment(appointmentList);
			String testOutput = "";
			assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
					
			//Given an appty list, after adding 2 items, test if the size of the list is 2
			C206_CaseStudy.addappointment(appointmentList, app1);
			C206_CaseStudy.addappointment(appointmentList, app2);
			assertEquals("Test if that appointment arraylist size is 2?", 2, appointmentList.size());
			
			//test if the expected output string same as the list of appointment retrieved from the SourceCentre
			allappointment= C206_CaseStudy.retrieveAllappointment(appointmentList);

			testOutput = String.format("%-20s %-20s %-20s %-20s %-20s\n", "01/01/20" , "22:30" , "Daryl" , "DarylU" , "daryl@gmail.com");
			testOutput += String.format("%-20s %-20s %-20s %-20s %-20s\n", "01/02/20" , "22:30" , "Khoa" , "KhoaU" , "Khoa@gmail.com");
			
			assertEquals("Check that ViewAllappointmentlist", testOutput, allappointment);
		}
		
		@Test 
		public void testDeleteAppointment() {
			 assertNotNull("Test if there is a valid appointment ArrayList", appointmentList); 
			   
			  C206_CaseStudy.addappointment(appointmentList, app1); 
			  C206_CaseStudy.addappointment(appointmentList, app2); 
			  C206_CaseStudy.addappointment(appointmentList, app3); 
			  assertEquals("Test that appointmentList have 3 appointment", 3, appointmentList.size()); 
			   
			  String srchUser = "S123A"; 
			  String testOutput = "Invalid username entered"; 
			  String msg = C206_CaseStudy.deleteappointment(appointmentList, srchUser); 
			  assertEquals("Test that appointmentList have 3 appointment",3,appointmentList.size()); 
			  assertSame("Test that the first appointment in the list is app1", app1, appointmentList.get(0)); 
			  assertSame("Test that the second appointment in the list is app2", app2, appointmentList.get(1)); 
			  assertSame("Test that the second appointment in the list is app3", app3, appointmentList.get(2)); 
			  assertEquals("Test the message", testOutput, msg); 
			   
			  srchUser = app1.getUsername(); 
			  testOutput = "Appointment for " + srchUser + "deleted"; 
			  msg = C206_CaseStudy.deleteappointment(appointmentList, srchUser); 
			  assertEquals("Test that appointmentList have 2 appointment",2,appointmentList.size()); 
			  assertSame("Test that the first appointment in the list is app2", app2, appointmentList.get(0)); 
			  assertSame("Test that the second appointment in the list is app3", app3, appointmentList.get(1)); 
			  assertEquals("Test the message", testOutput, msg); 
		}
	
	@After
	public void tearDown() throws Exception {
	}
}
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//
//}
