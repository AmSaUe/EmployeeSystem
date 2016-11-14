package employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String eMail;
	private String address;
	private String phone;
	private String bankName;
	private String category;
	private GenderType gender;
	private LocalDate dateOfBirth;
	private int employeeID;
	private String accountNumber;
	private int salary;
	private int age;
	static ArrayList<Employee> employee = new ArrayList<>();

	public Employee(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.address = address;
		this.phone = phone;
		this.bankName = bankName;
		this.category = category;
		this.gender = gender;
		this.employeeID = employeeID;
		this.accountNumber = accountNumber;
		this.salary = salary;

		this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		LocalDate today = LocalDate.now();
		Period p = Period.between(dateOfBirth, today);
		this.age = p.getYears();

	}

	public static void addEmployee(Employee e) {
		employee.add(e);
	}
	
	public abstract double calculateBonus();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCategory() {
		return category;
	}

	public Enum getGender() {
		return gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public int getEmployeeID() {
		return employeeID;
	}

}
