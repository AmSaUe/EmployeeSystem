package employee;

public class Receptionist extends Employee{

		private int NumberOfCalls;

	
		

		public Receptionist(String firstName, String lastName, String eMail, String address, String phone,
				String bankName, String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth,
				int employeeID, String accountNumber, int salary, int NumberOfCalls) {
			super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth, dayOfBirth,
					employeeID, accountNumber, salary);

			this.NumberOfCalls = NumberOfCalls;
			Employee.addEmployee(this);
		}

		public int getNumberOfCalls() {
			return NumberOfCalls;
		}

		public void setNumberOfCalls(int numberOfCalls) {
			NumberOfCalls = numberOfCalls;
		}
		
		@Override
		public double calculateBonus() {
			int bonus = NumberOfCalls*2;
			return bonus;
		}
		
}
