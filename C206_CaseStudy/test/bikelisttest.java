import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class bikelisttest {
	private bike bike1;
	private bike bike2;
	private bike bike3;
	private bike bike4;

	private ArrayList<bike> bikeList;

	@Before
	public void setUp() throws Exception {
		bike1 = new bike(1, "Joseph", "banana", 100);
		bike2 = new bike(2, "Leon", "apple", 70);
		bike3 = new bike(3, "Mina", "lemon", 110);
		bike4 = new bike(4, "Jane", "grape", 200);
		
		bikeList = new ArrayList<bike>();
		
	}
	
	@Test
	public void testAddingList() {
		// bike list is not null, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", bikeList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		Bikelist.addbike(bikeList, bike1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Bike is added same as 1st item of the list?", bike1, bikeList.get(0));

		// Add another item. test The size of the list is 3?
		Bikelist.addbike(bikeList, bike2);
		assertEquals("Test that Bike arraylist size is 2?", 2, bikeList.size());
		assertSame("Test that Bike is added same as 3rd item of the list?", bike2, bikeList.get(1));
	}

			@Test
			public void testRetrieveAllList() {
				// Test if Item list is not null but empty, so that can add a new item
				assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);

				// test if the list of Bike retrieved from the BikeList is empty
				String allbike = "";
				String testOutput = "";
				assertEquals("Check that ViewAllBikelist", testOutput, allbike);

				// Given an empty list, after adding 2 items, test if the size of the list is 2
				Bikelist.addbike(bikeList, bike1);
				Bikelist.addbike(bikeList, bike2);
				assertEquals("Test if that Bike arraylist size is 2?", 2, bikeList.size());
			
				
				// test if the expected output string same as the list of bike retrieved from the C206_CaseStudy 
				 allbike = Bikelist.retrieveAllbike(bikeList);
				 
				 testOutput = String.format("%-10d %-10s %-20s %-20d\n", 1, "Joseph","banana", 100); 
				 testOutput += String.format("%-10d %-10s %-20s %-20d\n", 2, "Leon", "apple", 70);
				 
				 assertEquals("Check that viewAllBikelist", testOutput, allbike);
				 
			}
	
			@Test
			public void testDeletingList() {
				// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);

				Bikelist.addbike(bikeList, bike1);
				Bikelist.addbike(bikeList, bike2);

				// Given an empty list, after adding 1 item, the size of the list is 1
				assertEquals("Test if that Bike arraylist size is 2?", 2, bikeList.size());

				// The item just added is as same as the first item of the list
				assertSame("Test that Bike is added same as 1st item of the list?", bike1, bikeList.get(0));
				assertNotNull("Test if there is validuser arraylist tp delete user from", bikeList);

				// Add another item. test The size of the list is 2?
				Bikelist.deleteBike(bikeList, bike1.getId());
				assertEquals("Test that Bike arraylist size is 1?", 1, bikeList.size());
				assertSame("Test that Bike is added same as 2nd item of the list?", bike2, bikeList.get(0));
			}
			

	@After
	public void tearDown() throws Exception {
		bike1 = null;
		bike2 = null;
		bike3 = null;
		bike4 = null;
		bikeList = null;
	}


	

}
