import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest_BikePart {
	private BikePart2 bp1;
	private BikePart2 bp2;
	private BikePart2 bp3;

	private ArrayList <BikePart2> bikepartList;
	
	public C206_CaseStudyTest_BikePart() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		bp1 = new BikePart2(001, "Tyre", 50.00, "wheel for bike");
		bp2 = new BikePart2(002, "Crankset", 80.50, "crankset for bike");
		bp3 = new BikePart2(003, "Pedal", 30.25, "pedal for bike");
		
		bikepartList = new ArrayList<BikePart2>();
	}

	
	@Test
	public void addBikePart() {
		//fail("Not yet implemented"); 
		assertNotNull("Test if bikepartList is empty",bikepartList);
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp1);
		assertEquals("Test if that BikePart arraylist size is 1?", 1, bikepartList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that BikePart added same as 1st item of the list?", bp1, bikepartList.get(0));

		// Add another item. test The size of the list is 3?
		C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp2);
		C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp3);
		assertEquals("Test that BikePart arraylist size is 3?", 3, bikepartList.size());
		assertSame("Test that BikePart is added same as 3rd item of the list?", bp3, bikepartList.get(2));
	}
	
	@Test
	public void retrieveBikePartList() {
		// Test if Item list is not null but empty, so that can add a new item
				assertNotNull("Test if there is valid BikePartList arraylist to add to", bikepartList);
				
				//test if the list of bikepartList retrieved from the SourceCentre is empty
				String allBikePart = C206_CaseStudy_BikePartMain.retrieveBikePartList(bikepartList);
				String testOutput = "";
				assertEquals("Test that items retrieved is same as items in viewBikePartList", testOutput, allBikePart);
						
				//Given an empty list, after adding 2 items, test if the size of the list is 2
//				C206_CaseStudy.addBikePart(bikepartList, bp1);
				C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp2);
				C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp3);
				
				assertEquals("Test if that BikePart arraylist size is 2?", 2, bikepartList.size());
				
				//test if the expected output string same as the list of BikePart retrieved from the SourceCentre
				allBikePart = C206_CaseStudy_BikePartMain.retrieveBikePartList(bikepartList);

//				testOutput += String.format("%-10d %-20s %-10.2f %-100s\n", 001, "Tyre", 50.00, "wheel for bike");
				testOutput = String.format("%-10d %-30s %-10.2f %-100s\n", 002, "Crankset", 80.50, "crankset for bike");
				testOutput += String.format("%-10d %-30s %-10.2f %-100s\n", 003, "Pedal", 30.25, "pedal for bike");

				
				assertEquals("Test that items retrieved is same as items in viewBikePartList", testOutput, allBikePart);
	}
	
	@Test
	public void deletingBikePartList() {
		//fail("Not yet implemented");

				assertNotNull("Test if bikepartList is empty",bikepartList);
				C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp1);
				C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp2);
				assertEquals("Test that bikepartList have 2 items", 2, bikepartList.size());
				
			       //The bikepart item added is as same as the first item of the list
		        assertSame("Test that bikepart added is same as 1st bikepart of the list?", bp1, bikepartList.get(0));
		        
		        // Test that user list is not null, so that the user can be deleted
		        assertNotNull ("Test if there is valid user arraylist to delete user from",bikepartList);
		        
		        //Deleting user.Test the size of the list is to 2
		        C206_CaseStudy_BikePartMain.deletingBikePartList(bikepartList, bp1.getId());
		        assertEquals("test that bikepart arraylist size is 1?", 1, bikepartList.size());
		        assertSame("Test that 2nd bikepart is moved to the first item of the list?", bp2, bikepartList.get(0));
		  
	}
	
	@After
	public void tearDown() throws Exception {
		bp1 = null;
		bp2 = null;
		bp3 = null;
		bikepartList = null;
	}
}
