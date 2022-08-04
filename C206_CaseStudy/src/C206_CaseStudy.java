import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> appointmentList= new ArrayList<Item>();

	}
	

	//================================= Option 1 Add an item (CRUD - Create) =================================
		public static Item inputCamcorder() {
			String tag = Helper.readString("Enter asset tag > ");
			String description = Helper.readString("Enter description > ");
			int zoom = Helper.readInt("Enter optical zoom > ");

			Item b= new Item (tag, description);
			return b;
			
		}
		public static void addCamcorder(ArrayList<Item> BikeList, Item i) {
			
			BikeList.add(i);
			
		}
	
	
	
	//================================= Option 2 View Bike List and Features (CRUD- Read) =================================
	public static String retrieveAllBike(ArrayList<Item> bikeList) {
		String output = "";

		for (int i = 0; i < bikeList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-10s %-20d\n", bikeList.get(i).getAssetTag(),
					bikeList.get(i).getDescription(), 
					C206_CaseStudy.showAvailability(bikeList.get(i).getIsAvailable()),
					bikeList.get(i).getDueDate(),bikeList.get(i).getOpticalZoom());
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Item> bikeList) {
		C206_CaseStudy.setHeader("BIKE LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
				"AVAILABLE", "DUE DATE","OPTICAL ZOOM");
		 output += retrieveAllBike(bikeList);	
		System.out.println(output);
	}


	private static void setHeader(String string) {
		// TODO Auto-generated method stub
		
	}


}	
	}

}
