/**
 * 
 */

/**
 * @author 21007549
 *
 */
public class customer extends person{
	
	private String username;
	
	public customer(String name, String password, String email, String username) {
		super(name, password, email);		
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
