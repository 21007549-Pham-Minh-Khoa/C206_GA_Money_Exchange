import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
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
		emp1 = new employee("John", "John@0203200","John@blc.com","J123A");
		emp2 = new employee("James", "jAmEss$$1998","James@blc.com","J224D");
		emp3 = new employee("Jenny", "Jenny$052002","Jenny@blc.com","J689F");
		
		cust1 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust2 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		cust3 = new customer("Jackson","Jacky@04","Jackson2004@gmail.com","Jackson2004");
		
		employeeList = new ArrayList<employee>();
		customerList = new ArrayList<customer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddCustomer() {
		//fail("Not yet implemented"); 
		assertNotNull("Test if customerList is empty",customerList);
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.AddCustomer(customerList, cust1);
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, camcorderList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", cc1, camcorderList.get(0));

		// Add another item. test The size of the list is 2?
		ResourceCentre.addCamcorder(camcorderList, cc2);
		ResourceCentre.addCamcorder(camcorderList, cc3);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, camcorderList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", cc3, camcorderList.get(2));

	}

}
