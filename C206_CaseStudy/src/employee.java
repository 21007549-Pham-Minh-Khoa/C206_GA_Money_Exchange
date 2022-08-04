/**
 * 
 */

/**
 * @author 21007549
 *
 */
public class employee extends person{
	private String employeeID;

	public employee(String name, String password, String email, String employeeID) {
		super(name, password, email);
		this.employeeID = employeeID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
}
