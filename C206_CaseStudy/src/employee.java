/**
 * 
 */

/**
 * @author 21007549
 *
 */
public class employee {
	private String employeeID;
	private String password;
	private String name;
	public employee(String name, String password,  String employeeID) {
		this.name=name;
		this.password=password;
		this.employeeID = employeeID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
}
