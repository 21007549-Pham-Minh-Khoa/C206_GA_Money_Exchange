import java.util.ArrayList;

public class C206_CaseStudy_BikePartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BikePart2> bikepartList = new ArrayList<BikePart2>();
		bikepartList.add(new BikePart2(001, "Tyre", 50.00, "wheel for bike"));
		bikepartList.add(new BikePart2(002, "Crankset", 80.50, "crankset for bike"));
		bikepartList.add(new BikePart2(003, "Pedal", 30.25, "pedal for bike"));

		int option = 0;
		while (option != 4) {
			C206_CaseStudy_BikePartMain.menu();
			option = Helper.readInt("Enter option > ");

			if (option == 1) {
				C206_CaseStudy_BikePartMain.viewBikePartList(bikepartList);
			} else if (option == 2) {
				BikePart2 bp = inputBikePartList();
				C206_CaseStudy_BikePartMain.addBikePart(bikepartList, bp);
				System.out.println("Added bikepart");

			} else if (option == 3) {
				C206_CaseStudy_BikePartMain.deleteBikePartList(bikepartList);
			} else if (option == 4) {
				System.out.println("");
			}
		}

	}

	// menu
	private static void menu() {
		// TODO: L05 Task 1 - Write code here for the menu options.
		Helper.line(40, "-");
		System.out.println("BIKE PART");
		Helper.line(40, "-");
		System.out.println("1. View all bike part items \n2. Add item \n3. Delete item \n4. Quit");
	}

	// create/add
	public static BikePart2 inputBikePartList() {
		int id = Helper.readInt("Enter bike part id > ");
		String name = Helper.readString("Enter bike part name > ");
		double price = Helper.readDouble("Enter bike part price > ");
		String description = Helper.readString("Enter bike part description > ");

		BikePart2 bp = new BikePart2(id, name, price, description);
		return bp;
	}

	public static void addBikePart(ArrayList<BikePart2> bikepartList, BikePart2 bp) {
		bikepartList.add(bp);
	}

	// view all/read
	public static String retrieveBikePartList(ArrayList<BikePart2> bikepartList) {
		String output = "";
		for (int i = 0; i < bikepartList.size(); i++) {
			output += String.format("%-10d %-30s %-10.2f %-100s\n", bikepartList.get(i).getId(),
					bikepartList.get(i).getName(), bikepartList.get(i).getPrice(),
					bikepartList.get(i).getDescription());
		}
		return output;
	}

	public static void viewBikePartList(ArrayList<BikePart2> bikepartList) {
		String output = String.format("%-10s %-30s %-10s %-100s\n", "ID", "NAME", "PRICE", "DESCRIPTION");
		output += retrieveBikePartList(bikepartList);
		System.out.println(output);
	}

	// update

	// delete
	public static boolean deletingBikePartList(ArrayList<BikePart2> bikepartList, int id) {
		boolean isDeleted = false;

		for (int i = 0; i < bikepartList.size(); i++) {
			if (bikepartList.get(i).getId() == id) {
				bikepartList.remove(i); // to remove from the bikepartList
				isDeleted = true;
			}
		}
		return isDeleted;
	}

//	public static boolean findCustomer(ArrayList<BikePart> bikepartList, int id) {
//		boolean isFound = false;
//		for (BikePart i : bikepartList) {
//			if (i.getName().equals(id)) {
//				isFound = true;
//				break;
//			}
//		}
//		return isFound;
//	}

	public static void deleteBikePartList(ArrayList<BikePart2> bikepartList) {
		viewBikePartList(bikepartList);
		int id = Helper.readInt("Enter id of bike part to delete > ");

		boolean isDeleted = deletingBikePartList(bikepartList, id);
		if (isDeleted == false) {
			System.out.println("Unsuccessful deletion.");
		} else {
			System.out.println("Bike part " + id + " deleted successfully!");
		}
	}
}
//
