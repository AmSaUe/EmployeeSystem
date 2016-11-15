package employee;

import utilities.GenderType;
import utilities.Specialization;

public class Doctor extends Employee {

	private Specialization specialization;
	private int yearsOfExperience;
	
	public Doctor(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary, Specialization specialization, int yearsOfExperience) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth,
				dayOfBirth, employeeID, accountNumber, salary);
		this.specialization = specialization;
		this.yearsOfExperience = yearsOfExperience;
		Employee.addEmployee(this);
	}
	

	@Override
	public double calculateBonus() {
		double bonus=0;
		if(yearsOfExperience>0 && yearsOfExperience<=5) {
			bonus = getSalary() * 1;
		} else if (yearsOfExperience>=6 && yearsOfExperience<=10) {
			bonus = getSalary() * 1.5;
		} else if (yearsOfExperience>=11 && yearsOfExperience<=20) {
			bonus = getSalary() * 2;
		} else if (yearsOfExperience>=21) {
			bonus = getSalary() * 2.5;
		} 
		return bonus;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Specialization getSpecialization() {
		return specialization;
	}



	
	

}
