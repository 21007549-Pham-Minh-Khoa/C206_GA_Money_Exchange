/**
 * 
 */

/**
 * @author 21007549
 *
 */
public class customer {
	private String name;
	private String email;
	private int mobileNum;
	
	
	
	public customer(String name, String email, int mobileNum) {
		this.mobileNum = mobileNum;
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobilenum() {
		return mobileNum;
	}

	public void setMobilenum(int mobilenum) {
		this.mobileNum = mobilenum;
	}
	
	
}
