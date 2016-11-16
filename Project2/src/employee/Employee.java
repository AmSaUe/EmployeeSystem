package employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import utilities.GenderType;

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
	public static ArrayList<Employee> employee = new ArrayList<>();

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

	public static Employee findByID() {
		String input = JOptionPane.showInputDialog("Enter the ID of the employee:");
		int num = Integer.parseInt(input);
		Employee employeeTemp = null;

		for (Employee j : employee) {
			if (num == j.employeeID) {
				employeeTemp = j;
			}
		}
		return employeeTemp;

	}

	public static Employee findEmployee() {
		String input = JOptionPane.showInputDialog("Enter the first name of the employee:");
		String input1 = JOptionPane.showInputDialog("Enter the last name of the employee:");
		Employee employeeTemp = null;

		for (Employee j : employee) {
			if (j.firstName.equals(input) && j.lastName.equals(input1)) {
				employeeTemp = j;
			}
		}
		return employeeTemp;
	}

	public static void displayEmployee(Employee e) {
		
		JOptionPane.showMessageDialog(null, e.header() + e.toString());
	}

	public static void delete(Employee foundEmployee) {
		if (foundEmployee == null) {
			JOptionPane.showMessageDialog(null, "This Employee does not exist in the database!");
		}
		boolean b = employee.remove(foundEmployee);
		if (b == true) {
			JOptionPane.showMessageDialog(null, foundEmployee + " was deleted successfuly!");
		}
	}

	public abstract double calculateBonus();// Bonus calculation

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

	@Override
	public String toString() {
				
		String c = fixLengthString(employeeID, 2) + "  "+ fixLengthString(firstName+" "+lastName, 19) + "  " + fixLengthString(category, 16) + "  " + fixLengthString(salary, 6) + "  " + fixLengthString(gender, 7) + "  " 
		+ fixLengthString(age, 3) + "  " + fixLengthString(address, 19) + "  " + fixLengthString(eMail, 19) + "  " + fixLengthString(phone, 10) + "  " + fixLengthString(bankName, 11) + "  " + fixLengthString(accountNumber, 11) + "  " + "\n"; 
				return c;
		}

	
	public static String header() {
			String a = "ID  Name                 Category          Salary Gender    Age  Address             E-mail               Phone       Bank        Account Nr  \n";
			String b = "-------------------------------------------------------------------------------------------------------------------------------------------------\n";
			String c = a+b;
			return c;
		}
	private String fixLengthString(String start, int length) {
		if (start.length() >= length) {
			return start.substring(0, length);
		}
		else {
			while (start.length() < length) {
				start += " ";
			}
			return start;
		}
	}

	private String fixLengthString(int start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}

	private String fixLengthString(GenderType gender, int length) {
		String s = gender.toString();
		return fixLengthString(s, length);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeID != other.employeeID)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}
