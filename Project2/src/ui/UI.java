package ui;

import javax.swing.JOptionPane;

import employee.AmbulanceDriver;
import employee.Doctor;
import employee.Employee;
import employee.Housekeeper;
import employee.Nurse;
import employee.Receptionist;
import employee.Researcher;
import statistics.Main;
import statistics.Statistics;

public class UI {

	public static void employeeManagement() {
		Object[] possibleValues1 = { "Register", "Delete", "Update", "Search", "Display", "back to the previous menu" };
		Object selectedValue1 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ",
				"Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues1, possibleValues1[0]);

		switch ((String) selectedValue1) {

		case "Register":{// Register
			Object[] possibleValues3 = { "Doctor", "Nurse", "Researcher", "Receptionist", "Ambulance Driver",
					"Housekeeper" };
			Object selectedValue3 = JOptionPane.showInputDialog(null,
					"In which category do you want to add the new employee?", "Input", JOptionPane.INFORMATION_MESSAGE,
					null, possibleValues3, possibleValues3[0]);

			switch ((String) selectedValue3) {// What kind of employee?

			case "Doctor":
				Doctor.createEmployee();
				break;
			case "Nurse":
				Nurse.createEmployee();
				break;
			case "Researcher":
				Researcher.createEmployee();
				break;
			case "Receptionist":
				Receptionist.createEmployee();
				break;
			case "Ambulance Driver":
				AmbulanceDriver.createEmployee();
				break;
			case "Housekeeper":
				Housekeeper.createEmployee();
				break;

			}
		break;
		}
		case "Delete":
			Employee.delete(Employee.findByName());
			break;
		case "Update":{

			Employee e = Employee.findByName();

			Object[] possibleValues4 = { "First Name", "Last Name", "Address", "Phone Number", "Email Address",
					"Salary", "Bank Name", "Bank Account Number" };
			Object selectedValue4 = JOptionPane.showInputDialog(null, "What attributes do you want to update? ",
					"Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues4, possibleValues4[0]);

			switch ((String) selectedValue4) {// What kind of employee

			case "First Name":
				String input = JOptionPane.showInputDialog("Give me the new first name: ");
				e.setFirstName(input);
				break;
			case "Last Name":
				String input1 = JOptionPane.showInputDialog("Give me the new last name: ");
				e.setLastName(input1);
				break;
			case "Address":
				String input2 = JOptionPane.showInputDialog("Give me the new address: ");
				e.setAddress(input2);
				break;
			case "Phone Number":
				String input3 = JOptionPane.showInputDialog("Give me the new phone number: ");
				e.setPhone(input3);
				break;
			case "Email Address":
				String input4 = JOptionPane.showInputDialog("Give me the new email address: ");
				e.seteMail(input4);
				break;
			case "Salary":
				String input5 = JOptionPane.showInputDialog("Give me the new salary: ");
				int num = Integer.parseInt(input5);
				e.setSalary(num);
				break;
			case "Bank Name":
				String input6 = JOptionPane.showInputDialog("Give me the new bank name: ");
				e.setBankName(input6);
				break;
			case "Bank Account Number":
				String input7 = JOptionPane.showInputDialog("Give me the new account number: ");
				e.setAccountNumber(input7);
				break;
			}
			break;
		}
		case "Search":{
			Object[] possibleValues5 = { "By Full Name", "By ID" };
			Object selectedValue5 = JOptionPane.showInputDialog(null, "How do you want to search for the employee?  ",
					"Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues5, possibleValues5[0]);
			switch ((String) selectedValue5) {
			case "By Full Name":
				Employee e1 = Employee.findByName();
				Employee.displayEmployee(e1);
				break;
			case "By ID":
				Employee e2 = Employee.findByID();
				Employee.displayEmployee(e2);
				break;
			}
			break;
		}
		case "Display":{
			String d = Employee.header();
			StringBuilder s = new StringBuilder();
			for (Employee j : Employee.employee) {
				s.append(j.toString());
			}
			JOptionPane.showMessageDialog(null, d + s);
			// System.out.println(d+s);
			break;
			}
		}
	}

	public static void employeeStatistics() {
		Object[] possibleValues2 = { "Average wage of the company", "Maximum salary in the company",
				"Minimum salary in the company", "Total Bonus", "Women employee Percentage of the company",
				"Men employee Percentage of the company", "Back to the previous menu" };
		Object selectedValue2 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ",
				"Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues2, possibleValues2[0]);

		switch ((String) selectedValue2) {

		case "Average wage of the company":// Ave
			Statistics.averageWage();
			break;
		case "Maximum salary in the company":// Max
			Statistics.highestWage();
			break;
		case "Minimum salary in the company":// Min
			Statistics.lowestWage();
			break;
		case "Total Bonus":// Bonus
			Statistics.totalBonus();
			break;
		case "Women employee Percentage of the company":// Women
			Statistics.femalePercentage();
			break;
		case "Men employee Percentage of the company":// Men
			Statistics.maleByCategoryPercentage();
			break;
		}
		Main.mainMenu();
	}
}