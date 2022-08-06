import java.util.*;

public class C206_CaseStudy {
	
	public static void main(String[] args) {
		start();		
	}
	
	private static void start() {
		int opt = 0;
		while (opt != 6) {
			menu();
			opt = Helper.readInt("Enter your choice > ");
			Helper.line(50, "=");
			if (opt == 1) {
				System.out.println("CUSTOMER MANAGEMENT");
				Employee_Customer_main.main(null);
			} else if(opt == 2) {
				System.out.println("BIKE MANAGEMENT");
				Bikelist.main(null);
			} else if (opt == 3) {
				System.out.println("BIKE PARTS MANAGEMENT");
				C206_CaseStudy_BikePartMain.main(null);
			} else if (opt == 4) {
				System.out.println("APPOINTMENT MANAGEMENT");
				AppointmentMain.main(null);
			} else if (opt == 5) {
				System.out.println("FEEDBACK MANAGEMENT");
				FeedbackMain.main(null);
			}else if (opt == 6) {
				System.out.println("GOOD BYE!");
			}
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("BIKE LOVER COMMUNITY");
		Helper.line(50, "=");
		System.out.println("1. Customer management");
		System.out.println("2. Bike management");
		System.out.println("3. Bike Parts management");
		System.out.println("4. Appointment management");
		System.out.println("5. Feedback management");
		System.out.println("6. Exit");
		Helper.line(50,"=");
		
	}
}
