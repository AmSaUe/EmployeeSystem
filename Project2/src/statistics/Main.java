package statistics;

import java.awt.Dimension;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import employee.AmbulanceDriver;
import employee.Doctor;
import employee.Employee;
import employee.Housekeeper;
import employee.Nurse;
import employee.Receptionist;
import employee.Researcher;
import ui.Database;
import ui.UI;
import utilities.GenderType;
import utilities.Qualification;
import utilities.Specialization;

public class Main {

	public static void main(String[] args) {

		Database.database();
		mainMenu();
	}

	public static void mainMenu() {

		mainMenu: do {
			Object[] possibleValues = { "Employee Management", "Employee Statistics", "Exit" };
			Object selectedValue = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ",
					"Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

			switch ((String) selectedValue) {

			case "Employee Management":
				UI.employeeManagement();
				break;

			case "Employee Statistics":
				UI.employeeStatistics();
				break;

			case "Exit":
				break mainMenu;
			}
		} while (0 == (JOptionPane.showConfirmDialog(null, "Do you want to go back to the main menu?",
				"Do you want to go back to the menu?", JOptionPane.YES_NO_OPTION)));
		JOptionPane.showMessageDialog(null, "Have a nice day!");
	}
}
