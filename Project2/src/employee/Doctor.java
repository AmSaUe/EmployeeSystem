package employee;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		double bonus = 0;
		if (yearsOfExperience > 0 && yearsOfExperience <= 5) {
			bonus = getSalary() * 1;
		} else if (yearsOfExperience >= 6 && yearsOfExperience <= 10) {
			bonus = getSalary() * 1.5;
		} else if (yearsOfExperience >= 11 && yearsOfExperience <= 20) {
			bonus = getSalary() * 2;
		} else if (yearsOfExperience >= 21) {
			bonus = getSalary() * 2.5;
		}
		return bonus;
	}

	public static void createEmployee() {

		JTextField Field1 = new JTextField(5);// employeeID
		JTextField Field2 = new JTextField(5);// firstName
		JTextField Field3 = new JTextField(5);// lastName
		String[] items = { "Male", "Female", "Uknown" };
		JComboBox combo = new JComboBox(items);
		JTextField Field4 = new JTextField(5);// gender
		JTextField Field5 = new JTextField(5);// yearOfBirth
		JTextField Field6 = new JTextField(5);// monthOfBirth
		JTextField Field7 = new JTextField(5);// dayOfBirth
		JTextField Field8 = new JTextField(5);// address
		JTextField Field9 = new JTextField(5);// phone
		JTextField Field10 = new JTextField(5);// eMail
		JTextField Field12 = new JTextField(5);// salary
		JTextField Field13 = new JTextField(5);// bankName
		JTextField Field14 = new JTextField(5);// accountNumber
		String[] items1 = { "Audiologist", "Allergist", "Anesthesiologist", "Cardiologist", "Dentist", "Dermatologist",
				"Endocrinologist", "Epidemiologist", "Gynecologist", "Immunologist", "Geneticist", "Microbiologist",
				"Neonatologist", "Neurologist", "Neurosurgeon", "Obstetrician", "Oncologist", "Orthopedist",
				"Pediatrician", "Physiologist", "Podiatrist", "Psychiatrist", "Radiologist", "Rheumatologist",
				"Surgeon", "Urologist" };
		JComboBox combo1 = new JComboBox(items1);
		JTextField Field15 = new JTextField(5);// yearsOfExperience

		JPanel myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(15, 1));
		myPanel.add(new JLabel("Employee ID: "));
		myPanel.add(Field1);
		myPanel.add(new JLabel("First Name: "));
		myPanel.add(Field2);
		myPanel.add(new JLabel("Last Name: "));
		myPanel.add(Field3);
		myPanel.add(new JLabel("Gender: "));
		myPanel.add(combo);
		myPanel.add(new JLabel("Year of Birth: "));
		myPanel.add(Field5);
		myPanel.add(new JLabel("Month of Birth: "));
		myPanel.add(Field6);
		myPanel.add(new JLabel("Day of Birth: "));
		myPanel.add(Field7);
		myPanel.add(new JLabel("Address: "));
		myPanel.add(Field8);
		myPanel.add(new JLabel("Phone Number: "));
		myPanel.add(Field9);
		myPanel.add(new JLabel("Email Address: "));
		myPanel.add(Field10);
		myPanel.add(new JLabel("Base Salary: "));
		myPanel.add(Field12);
		myPanel.add(new JLabel("Bank Name: "));
		myPanel.add(Field13);
		myPanel.add(new JLabel("Bank Account Number: "));
		myPanel.add(Field14);
		myPanel.add(new JLabel("Specialization: "));
		myPanel.add(combo1);
		myPanel.add(new JLabel("Years of Experience: "));
		myPanel.add(Field15);

		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please enter all the information about the new Doctor:", JOptionPane.OK_CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION) {

			GenderType genderTemp = GenderType.UNKNOWN;
			switch ((String) (combo.getSelectedItem())) {
			case "Female":
				genderTemp = GenderType.FEMALE;
				break;
			case "Male":
				genderTemp = GenderType.MALE;
				break;
			}

			Specialization special = Specialization.AUDIOLOGIST;
			switch ((String) (combo1.getSelectedItem())) {
			case "Allergist":
				special = Specialization.ALLERGIST;
				break;
			case "Anesthesiologist":
				special = Specialization.ANESTHESIOLOGIST;
				break;
			case "Cardiologist":
				special = Specialization.CARDIOLOGIST;
				break;
			case "Dentist":
				special = Specialization.DENTIST;
				break;
			case "Dermatologist":
				special = Specialization.DERMATOLOGIST;
				break;
			case "Endocrinologist":
				special = Specialization.ENDOCRINOLOGIST;
				break;
			case "Epidemiologist":
				special = Specialization.EPIDEMIOLOGIST;// TODO
				break;
			case "Gynecologist":
				special = Specialization.GYNECOLOGIST;
				break;
			case "Immunologist":
				special = Specialization.IMMUNOLOGIST;
				break;
			case "Geneticist":
				special = Specialization.GENETICIST;
				break;
			case "Microbiologist":
				special = Specialization.MICROBIOLOGIST;
				break;
			case "Neonatologist":
				special = Specialization.NEONATOLOGIST;
				break;
			case "Neurologist":
				special = Specialization.NEUROLOGIST;
				break;
			case "Neurosurgeon":
				special = Specialization.NEUROSURGEON;
				break;
			case "Obstetrician":
				special = Specialization.OBSTETRICIAN;
				break;
			case "Oncologist":
				special = Specialization.ONCOLOGIST;
				break;
			case "Orthopedist":
				special = Specialization.ORTHOPEDIST;
				break;
			case "Pediatrician":
				special = Specialization.PEDIATRICIAN;
				break;
			case "Physiologist":
				special = Specialization.PHYSIOLOGIST;
				break;
			case "Podiatrist":
				special = Specialization.PODIATRIST;
				break;
			case "Psychiatrist":
				special = Specialization.PSYCHIATRIST;
				break;
			case "Radiologist":
				special = Specialization.RADIOLOGIST;
				break;
			case "Rheumatologist":
				special = Specialization.RHEUMATOLOGIST;
				break;
			case "Surgeon":
				special = Specialization.SURGEON;
				break;
			case "Urologist":
				special = Specialization.UROLOGIST;
				break;
			}

			Doctor newDoctor = new Doctor(Field2.getText(), Field3.getText(), Field10.getText(), Field8.getText(),
					Field9.getText(), Field13.getText(), "Doctor", genderTemp, Integer.parseInt(Field5.getText()),
					Integer.parseInt(Field6.getText()), Integer.parseInt(Field7.getText()),
					Integer.parseInt(Field1.getText()), Field14.getText(), Integer.parseInt(Field12.getText()), special,
					Integer.parseInt(Field15.getText()));
			JOptionPane.showMessageDialog(null, "This new doctor was created successfully!");
		} else {
			JOptionPane.showMessageDialog(null, "Registration cancelled!");
		}

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
