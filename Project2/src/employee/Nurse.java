package employee;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utilities.GenderType;
import utilities.Qualification;

public class Nurse extends Employee {
	
	private Qualification qualification;

	public Nurse(String firstName, String lastName, String eMail, String address, String phone, String bankName,
			String category, GenderType gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int employeeID,
			String accountNumber, int salary, Qualification qualification) {
		super(firstName, lastName, eMail, address, phone, bankName, category, gender, yearOfBirth, monthOfBirth,
				dayOfBirth, employeeID, accountNumber, salary);
		this.qualification = qualification;
		Employee.addEmployee(this);
	}
	
	@Override
	public double calculateBonus() {
		double bonus = (getSalary() * 12)*100/12;
		return bonus;
	}


	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	
	public static void createEmployee(){
		  
		  JTextField Field1 = new JTextField(5);//employeeID
		  JTextField Field2 = new JTextField(5);//firstName
	      JTextField Field3 = new JTextField(5);//lastName
	      String[] items = {"Male", "Female", "Uknown"};
	      JComboBox combo = new JComboBox(items);
	      JTextField Field4 = new JTextField(5);//gender
	      JTextField Field5 = new JTextField(5);//yearOfBirth
	      JTextField Field6 = new JTextField(5);//monthOfBirth
	      JTextField Field7 = new JTextField(5);//dayOfBirth
	      JTextField Field8 = new JTextField(5);//address
	      JTextField Field9 = new JTextField(5);//phone
	      JTextField Field10 = new JTextField(5);//eMail
	      JTextField Field12 = new JTextField(5);//salary
	      JTextField Field13 = new JTextField(5);//bankName
	      JTextField Field14 = new JTextField(5);//accountNumber
	      String[] items1 = {"Nurse", "Nurse Assistant"};
	      JComboBox combo1 = new JComboBox(items1);
	      
	      
	      JPanel myPanel = new JPanel();
	      myPanel.setLayout(new GridLayout(15,1));
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
	      myPanel.add(new JLabel("Qualification: "));
	      myPanel.add(combo1);
	      
	      
	      int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter all the information about the new Nurse:", JOptionPane.OK_CANCEL_OPTION);
	      
	      if (result == JOptionPane.OK_OPTION) {
	    	  
	    	  GenderType genderTemp = GenderType.UNKNOWN;
	    	  switch ((String)(combo.getSelectedItem())){
	    	  	case "Female":  
	    		  genderTemp = GenderType.FEMALE;
	    		  break;
	    	  	case "Male":
	    		  genderTemp = GenderType.MALE;
	    		  break;
	    	  }
	    	 
	    	  Qualification qual = Qualification.NURSE;
	    	  if ((String)(combo1.getSelectedItem()) == "Nurse Assistant"){
	    		  qual = Qualification.ASSISTANT_NURSE;
	    	  }
	    	  
	    	  Nurse newNurse = new Nurse(Field2.getText(), Field3.getText(), Field10.getText(), Field8.getText(), Field9.getText(), 
	    			  Field13.getText(), "Nurse", genderTemp, Integer.parseInt(Field5.getText()), Integer.parseInt(Field6.getText()), 
	    			  Integer.parseInt(Field7.getText()), Integer.parseInt(Field1.getText()), Field14.getText(), Integer.parseInt(Field12.getText()),qual);
	      }
			JOptionPane.showMessageDialog(null, "This new Nurse was created successfully!");

	}
}
