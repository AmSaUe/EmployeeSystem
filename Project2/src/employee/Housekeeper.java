package employee;

import utilities.GenderType;

public class Housekeeper extends Employee{

	private int bonusBase = 1000;
	private int workingMonths;
	public Housekeeper(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary, int bonusBase, int workingMonths) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth,
				dayOfBirth, employeeID, accountNumber, salary);
		this.bonusBase = bonusBase;
		this.workingMonths = workingMonths;
		Employee.addEmployee(this);
	}
	
	
	
	@Override
	public double calculateBonus() {
		double bonus = (getBonusBase() * getWorkingMonths()) ;
		return bonus;
	}
	
	
	
	public int getBonusBase() {
		return bonusBase;
	}
	public void setBonusBase(int bonusBase) {
		this.bonusBase = bonusBase;
	}
	public int getWorkingMonths() {
		return workingMonths;
	}
	public void setWorkingMonths(int workingMonths) {
		this.workingMonths = workingMonths;
	}

	

}
