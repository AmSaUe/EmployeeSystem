package employee;

public class Doctor extends Employee {

	
	private int yearsOfExperience;

	public Doctor(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, Enum gender, String dateOfBirth, int employeeID, String accountNumber, int salary,
			 int yearsOfExperience) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, dateOfBirth, employeeID,
				accountNumber, salary);
		
		this.yearsOfExperience = yearsOfExperience;
		Employee.addEmployee(this);
	}

	
}
