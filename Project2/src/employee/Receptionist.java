package employee;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utilities.GenderType;

public class Receptionist extends Employee{

		private int NumberOfCalls = 0;

	
		

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
		
		public static Receptionist createReceptionist(){
			  
			  JTextField Field1 = new JTextField(5);//employeeID
			  JTextField Field2 = new JTextField(5);//firstName
		      JTextField Field3 = new JTextField(5);//lastName
		      JTextField Field4 = new JTextField(5);//gender
		      JTextField Field5 = new JTextField(5);//yearOfBirth
		      JTextField Field6 = new JTextField(5);//monthOfBirth
		      JTextField Field7 = new JTextField(5);//dayOfBirth
		      JTextField Field8 = new JTextField(5);//address
		      JTextField Field9 = new JTextField(5);//phone
		      JTextField Field10 = new JTextField(5);//eMail
		      JTextField Field11 = new JTextField(5);//category
		      JTextField Field12 = new JTextField(5);//salary
		      JTextField Field13 = new JTextField(5);//bankName
		      JTextField Field14 = new JTextField(5);//accountNumber
		      
		      
		      JPanel myPanel = new JPanel();
		      myPanel.setLayout(new GridLayout(11,1));
		      myPanel.add(new JLabel("Employee ID:"));
		      myPanel.add(Field1);
		      myPanel.add(new JLabel("First Name:"));
		      myPanel.add(Field2);
		      myPanel.add(new JLabel("Last Name:"));
		      myPanel.add(Field3);
		      myPanel.add(new JLabel("Gender:"));
		      myPanel.add(Field4);
		      myPanel.add(new JLabel("Year of Birth:"));
		      myPanel.add(Field5);
		      myPanel.add(new JLabel("Month of Birth:"));
		      myPanel.add(Field6);
		      myPanel.add(new JLabel("Day of Birth:"));
		      myPanel.add(Field7);
		      myPanel.add(new JLabel("Address:"));
		      myPanel.add(Field8);
		      myPanel.add(new JLabel("Phone Number:"));
		      myPanel.add(Field9);
		      myPanel.add(new JLabel("Email Address:"));
		      myPanel.add(Field10);
		      myPanel.add(new JLabel("Category:"));
		      myPanel.add(Field11);
		      myPanel.add(new JLabel("Base Salary:"));
		      myPanel.add(Field12);
		      myPanel.add(new JLabel("Bank Name:"));
		      myPanel.add(Field13);
		      myPanel.add(new JLabel("Bank Account Number:"));
		      myPanel.add(Field14);
		    
		      
		      
		      int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter all the information about the new employee:", JOptionPane.OK_CANCEL_OPTION);
		      
		      if (result == JOptionPane.OK_OPTION) {
		    	  
		    	  Receptionist newReceptionist = new Receptionist(Field2.getText(), Field3.getText(), Field10.getText(), Field8.getText(), Field9.getText(), 
		    			  Field13.getText(), Field11.getText(), Field4.getText(), Integer.parseInt(Field5.getText()), Integer.parseInt(Field6.getText()), 
		    			  Integer.parseInt(Field7.getText()), Integer.parseInt(Field1.getText()), Field14.getText(), Integer.parseInt(Field12.getText()),0);
		      }
		      
		}
}
