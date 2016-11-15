package employee;

public class AmbulanceDriver extends Employee {
	private int numberOfShifts;

	public AmbulanceDriver(String firstName, String lastName, String eMail, String address, String phone,
			String bankName, String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth,
			int employeeID, String accountNumber, int salary, int numberOfShifts) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth,
				dayOfBirth, employeeID, accountNumber, salary);
		this.numberOfShifts = numberOfShifts;
		Employee.addEmployee(this);
	}
//TEST
	@Override
	public double calculateBonus() {
		double bonus = numberOfShifts * getage();
		return bonus;
	}

	public int getNumberOfShifts() {
		return numberOfShifts;
	}

	public void setNumberOfShifts(int numberOfShifts) {
		this.numberOfShifts = numberOfShifts;
	}

	private int getage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
