package employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import models.Book;
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
		JOptionPane.showMessageDialog(null, e.toString());
	}

	/*
	 * public static int findIndex(){ String input =
	 * JOptionPane.showInputDialog("Enter the first name of the employee:");
	 * String input1 =
	 * JOptionPane.showInputDialog("Enter the last name of the employee:"); int
	 * indexOfEmployee = 0;
	 * 
	 * for (Employee j: employee){ if (j.firstName.equals(input) &&
	 * j.lastName.equals(input1)){ indexOfEmployee = employee.indexOf(j) ; } }
	 * return indexOfEmployee; }
	 */

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeID;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public String toString() {

		return "Name " + firstName + lastName + "eMail=" + eMail + ", address=" + address + ", phone=" + phone
				+ ", bankName=" + bankName + ", category=" + category + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", employeeID=" + employeeID + ", accountNumber=" + accountNumber + ", salary=" + salary
				+ "\n";

		public void printHeader() {
			System.out.println("ID Name   Title                 Author                ISBN            ");
		}
				public void printBook(Book book) {
				
			System.out.println(fixLengthString(book.getID(), 6) + "  " + fixLengthString(book.getTitle(),20) 
			+ "  " + fixLengthString(book.getAuthor(), 20) + "  " +
					fixLengthString(book.getIsbn(), 15));
		}
				private String fixLengthString(String start, int length) {
			// TODO fix string padding problem
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
