package employee;

public class Researcher extends Employee {

	private int NumberOfProjects;

	public Researcher(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, String dateOfBirth, int employeeID, String accountNumber, int salary, int NumberOfProjects) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, dateOfBirth, employeeID, accountNumber,
				salary);


		this.NumberOfProjects = NumberOfProjects;
		Employee.addEmployee(this);
	}

	public int getNumberOfProjects() {
		return NumberOfProjects;
	}

	public void setNumberOfProjects(int numberOfProjects) {
		NumberOfProjects = numberOfProjects;
	}

	
	
	
	
	
}
