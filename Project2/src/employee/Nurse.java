package employee;

import utilities.GenderType;
import utilities.Qualification;

public class Nurse extends Employee {
	
	private Qualification qualification;

	public Nurse(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary, Qualification qualification) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth,
				dayOfBirth, employeeID, accountNumber, salary);
		this.qualification = qualification;
		Employee.addEmployee(this);
	}
	
	@Override
	public double calculateBonus() {
		double bonus = (getSalary() * 12)*100/12;
		return bonus;
	}


	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

}
