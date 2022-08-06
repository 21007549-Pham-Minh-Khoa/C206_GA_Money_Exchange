import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FeedbackTest {


	private Feedback fb1;
	private Feedback fb2;
	private Feedback fb3;

	private ArrayList<Feedback> feedbackList;

	@Before
	public void setUp() throws Exception {

		fb1 = new Feedback(01, "John", "john132@gmail.com", 91234567, "too expensive");
		fb2 = new Feedback(02, "Benn", "benn432@vicdn.com", 85431234, "too slow");
		fb3 = new Feedback(03, "Mary", "mary5432@freed.com", 93216543, "material used is bad");

		feedbackList = new ArrayList<Feedback>();
	}

	@Test
	public void testAddFeedback() {

		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		FeedbackMain.addFeedback(feedbackList, fb1);
		assertEquals("Test if that Feedback arraylist size is 1?", 1, feedbackList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Feedback is added same as 1st item of the list?", fb1, feedbackList.get(0));

		// Add another item. test The size of the list is 2?
		FeedbackMain.addFeedback(feedbackList, fb2);
		FeedbackMain.addFeedback(feedbackList, fb3);
		assertEquals("Test that Feedback arraylist size is 3?", 3, feedbackList.size());
		assertSame("Test that Feedback is added same as 3rd item of the list?", fb3, feedbackList.get(2));
	}

	@Test
	public void testRetrieveAllFeedback() {

		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Feedback arraylist to add to", feedbackList);

		// test if the list of feedback retrieved from the SourceCentre is empty
		String allFeedback = FeedbackMain.retrieveAllFeedback(feedbackList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allFeedback);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		FeedbackMain.addFeedback(feedbackList, fb1);
		FeedbackMain.addFeedback(feedbackList, fb2);
		assertEquals("Test if that Feedback arraylist size is 2?", 2, feedbackList.size());

		// test if the expected output string same as the list of feedbacks retrieved
		// from the SourceCentre
		allFeedback = FeedbackMain.retrieveAllFeedback(feedbackList);

		testOutput = String.format("%-10d %-20s %-30d %-30s %-20s\n", 01, "John", 91234567, "john132@gmail.com",
				"too expensive");
		testOutput += String.format("%-10d %-20s %-30d %-30s %-20s\n", 02, "Benn", 85431234, "benn432@vicdn.com",
				"too slow");

		assertEquals("Check that ViewAllFeedbacklist", testOutput, allFeedback);

	}
	
	@Test
	public void testdeleteFeedback() {
		
		// Test that user list is not null, so that the user can be deleted
	    assertNotNull("Test if there is valid user arraylist to delete user from", feedbackList);

		  // Given an empty list, after adding 2 users, test if the size of the list is 2
	    FeedbackMain.addFeedback(feedbackList, fb1);
	    FeedbackMain.addFeedback(feedbackList, fb2);
	    assertEquals("Test if that user arraylist size is 2?", 2, feedbackList.size());

	    // The user added is as same as the first item of the list
	    assertSame("Test that user is added same as 1st user of the list?", fb1, feedbackList.get(0));

	    // Deleting user.Test the size of the list is to 1
	    FeedbackMain.doDeleteFeedback(feedbackList, fb1.getId());
	    assertEquals("test that user arraylist size is 1?", 1, feedbackList.size());
	    assertSame("Test that 2nd user is moved to the first item of the list?", fb2, feedbackList.get(0));
	  

	}

	@After
	public void tearDown() throws Exception {
		fb1 = null;
		fb2 = null;
		fb3 = null;
		feedbackList = null;
	}

}
