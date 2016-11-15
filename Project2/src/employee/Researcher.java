package employee;

import utilities.GenderType;

public class Researcher extends Employee {

	private int NumberOfProjects;
	private int bonusBase;

	

	public Researcher(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary, int NumberOfProjects) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth, dayOfBirth,
				employeeID, accountNumber, salary);

		this.NumberOfProjects = NumberOfProjects;
		Employee.addEmployee(this);
	}

	public int getNumberOfProjects() {
		return NumberOfProjects;
	}

	public void setNumberOfProjects(int numberOfProjects) {
		NumberOfProjects = numberOfProjects;
	}

	
	public int getBonusBase() {
		return bonusBase;
	}

	public void setBonusBase(int bonusBase) {
		this.bonusBase = bonusBase;
	}

	@Override
	public double calculateBonus() {
		int bonus = getBonusBase()*NumberOfProjects;
		return bonus;
	}
	
	
	
}
