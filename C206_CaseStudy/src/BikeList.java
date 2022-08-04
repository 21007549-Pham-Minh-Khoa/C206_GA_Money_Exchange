
public class BikeList {
	
	private String id;
	private String name;
	private String description;
	private double price;
	
	public BikeList(String id, String name, String desscription, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String description() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
		
	}
	
	public int getPrice() {
		return (int) price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
