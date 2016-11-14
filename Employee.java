package employee;

import java.util.ArrayList;
import java.util.Date;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private String address;
	private String phone;
	private String bankName;
	private String category; //do we need it?
	private Enum gender;
	private String dateOfBirth;
	private int employeeID;
	private String accountNumber;
	private int salary;
//	private int age;  how calculate age?
	static ArrayList<Employee> employee = new ArrayList<>();
	
	
	public Employee(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, Enum gender, String dateOfBirth, int employeeID, String accountNumber, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.address = address;
		this.phone = phone;
		this.bankName = bankName;
		this.category = category;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.employeeID = employeeID;
		this.accountNumber = accountNumber;
		this.salary = salary;
	}
	
	public static void addEmployee(Employee e) {
		employee.add(e);
	}
	
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	
	

	
	

}
