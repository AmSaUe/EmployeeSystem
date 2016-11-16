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
import utilities.GenderType;
import utilities.Qualification;
import utilities.Specialization;

public class Main {

	public static void main(String[] args) {
		
		
		Doctor d1 = new Doctor("Erik", "Dahl", "dahl@gmail.com", "Liljeholmsv.34", "0739568423", "Nordea", "DOCTOR", GenderType.MALE, 1958,01,27,1,"326 535 497", 56000, Specialization.CARDIOLOGIST, 30);
		Doctor d2 = new Doctor("Arthur", "Flint", "a.f@gmail.com", "Nackagatan 7", "0702365489", "SEB", "DOCTOR", GenderType.MALE, 1962,11,27,2,"56 23654 89", 50000, Specialization.OBSTETRICIAN, 23);
		Doctor d3 = new Doctor("Emilia", "Nylén", "e.nylen@gmail.com", "Vasagatan 1", "0762458973", "SHB", "DOCTOR",  GenderType.FEMALE, 1977,12,01,3,"456 2239 87 1", 37000, Specialization.NEUROLOGIST, 5);
		Doctor d4 = new Doctor("Amanda", "Sten", "a.sten@gmail.com", "Strandliden 48", "0721436056", "Swedbank", "DOCTOR", GenderType.FEMALE, 1950,06,17,4,"15426 32 1", 54200, Specialization.ALLERGIST, 20);
		Doctor d5 = new Doctor("Sara", "Ek", "sara.ek@gmail.com", "Bollmorav. 234", "0701254893", "SEB", "DOCTOR", GenderType.FEMALE, 1978,10,03,5,"25 12589 23", 64000, Specialization.RHEUMATOLOGIST, 15);
		
		Nurse n1 = new Nurse("Per", "Green", "per.g@gmail.com","Strandvägen 2", "0762583146", "Swedbank", "NURSE", GenderType.MALE, 1958, 06, 27, 6, "12496 32 4", 29500, Qualification.NURSE);
		Nurse n2 = new Nurse("Lisa", "Svensson", "lisa.s@gmail.com","Tyresögränd 5", "0732651856", "Nordea", "NURSE", GenderType.FEMALE, 1979, 04, 22, 7, "552 126 332", 25000, Qualification.ASSISTANT_NURSE);
		Nurse n3 = new Nurse("Ebba", "Carlsson", "ebba.c@gmail.com","Arlandav. 6", "0725146038", "SEB", "NURSE", GenderType.FEMALE, 1966, 12, 29, 8, "22 16852 66", 31000, Qualification.NURSE);
		Nurse n4 = new Nurse("Grace", "Town", "g.town@gmail.com","Bondergata 5", "0732651596", "Swedbank", "NURSE", GenderType.MALE, 1988, 01, 25, 9, "56 87459 26", 36000, Qualification.NURSE);
		Nurse n5 = new Nurse("Anders", "Claus", "a.claus@gmail.com","Landsvägen 78", "0712563202", "SHB", "NURSE", GenderType.MALE, 1986, 03, 16, 10, "236 5418 63 2", 25000, Qualification.ASSISTANT_NURSE);
		
	
		 Receptionist Rec1 = new Receptionist("Sara", "Svensson", "s.s@gmail.com", "Stockholm", "700546982", "Nordea", "Receptionist", GenderType.FEMALE, 1958,01,27,1,"548451325712", 25000, 0);
		 Receptionist Rec2 = new Receptionist("Per", "Ericsson", "p.e@gmail.com", "Stockholm", "751236985", "Nordea", "Receptionist", GenderType.MALE, 1962,03,02,1,"784569875132", 25000,0);
		 Receptionist Rec3 = new Receptionist("Jessica", "Johnson", "j.j@gmail.com", "Stockholm", "789654125", "Nordea", "Receptionist", GenderType.FEMALE, 1963,12,05,1,"412845692137", 25000, 0);
		 Receptionist Rec4 = new Receptionist("Maria", "Anders", "m.a@gmail.com", "Stockholm", "784538795", "Nordea", "Receptionist", GenderType.FEMALE, 1979,10,12,1,"875487895462", 25000, 0);
		 Receptionist Rec5 = new Receptionist("Julia", "Smith", "j.s@gmail.com", "Stockholm", "754898787", "Nordea", "Receptionist", GenderType.FEMALE, 1980,12,20,1,"316547842531", 25000, 0);
		 Researcher Res1 = new Researcher("Linnea", "Parker", "l.p@gmail.com", "Stockholm", "712312345", "Nordea", "Researcher", GenderType.FEMALE, 1956,06,25,1,"879542658715", 50000, 0);
		 Researcher Res2 = new Researcher("Erik", "Strand", "e.s@gmail.com", "Stockholm", "714623587", "Nordea","Researcher", GenderType.MALE, 1978,11,28,1,"635849521236", 50000, 0);
		 Researcher Res3 = new Researcher("Elsa", "Andersson", "e.a@gmail.com", "Stockholm", "702158954", "Nordea", "Researcher", GenderType.FEMALE, 1989,10,07,1,"963852741123", 50000, 0);
		 Researcher Res4 = new Researcher("Marie", "Karlsson", "m.k@gmail.com", "Stockholm", "713846521", "Nordea", "Researcher", GenderType.FEMALE, 1985,01,14,1,"123456987741", 50000, 0);
		 Researcher Res5 = new Researcher("Olivia", "Nilsson", "o.n@gmail.com", "Stockholm", "745457545", "Nordea", "Researcher", GenderType.FEMALE, 1983,02,17,1,"741852963123", 50000, 0);
		 
		 AmbulanceDriver ad1 = new AmbulanceDriver("Johanna", "Nilsson", "jn@mail.com", "Sollentuna", "5497852", "Nordea","Ambulance Driver", GenderType.FEMALE, 1988,10,27,21,"35467", 25000,5);
		 AmbulanceDriver ad2 = new AmbulanceDriver("Eric", "Cuszac", "ec@mail.com", "Hägersten", "9785623", "Nordea","Ambulance Driver", GenderType.Male, 1990,01,15,22,"3675894", 26000,3);
		 AmbulanceDriver ad3 = new AmbulanceDriver("Sune", "Carlsson", "sc@mail.com", "Stockholm", "5497852", "SEB","Ambulance Driver", GenderType.Male, 1985,11,29,23,"789523", 28000,5);
		 AmbulanceDriver ad4 = new AmbulanceDriver("Nina", "Berg", "nb@mail.com", "Huddinge", "5995485", "Sparbanken","Ambulance Driver", GenderType.FEMALE, 1991,04,19,24,"987452", 22000,4);
		 AmbulanceDriver ad5 = new AmbulanceDriver("Carl", "Frank", "cf@mail.com", "Skärholmen", "5497852", "SEB","Ambulance Driver", GenderType.FEMALE, 1977,08,30,25,"658452", 30000,2);

		 Housekeeper h1 = new Housekeeper("Erica", "Carlsson", "erc@mail.com", "Gustavsberg", "498762", "SEB","Housekeeper", GenderType.FEMALE, 1988,10,27,26,"35467", 22000,1000,10);
		 Housekeeper h2 = new Housekeeper("Anna", "Uber", "au@mail.com", "Tyresö", "6977452", "SEB","Housekeeper", GenderType.FEMALE, 1990,01,15,27,"3675894", 20000,1000,24);
		 Housekeeper h3 = new Housekeeper("Ingrid", "Sunquist", "is@mail.com", "Stockholm", "236587", "Sparbanken","Housekeeper", GenderType.Female, 1985,11,29,28,"789523", 22000,1000,5);
		 Housekeeper h4 = new Housekeeper("Gerard", "Bergkvist", "gb@mail.com", "Upplands Väsby", "659723", "Nordea","Housekeeper", GenderType.Male, 1991,04,19,29,"987452", 20000,1000,12);
		 Housekeeper h5 = new Housekeeper("Ture", "Persson", "tp@mail.com", "Skärholmen", "5497852", "SEB","Housekeeper", GenderType.Male, 1977,08,30,30,"658452", 24000,1000,6);
		
		
	

		do {
				Object[] possibleValues = { "Employee Management", "Employee Statistics", "Exit"};
				Object selectedValue = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
           
				switch ((String)selectedValue){
				
					case "Employee Management"://Employee Management*
						Object[] possibleValues1 = { "Register", "Delete", "Update", "Search", "Display", "back to the previous menu"};
						Object selectedValue1 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues1, possibleValues1[0]);
               
				
							switch ((String)selectedValue1){
				
								case "Register"://Register
									Object[] possibleValues3 = {"Doctor", "Nurse", "Researcher", "Receptionist", "Ambulance Driver", "Housekeeper"};
									Object selectedValue3 = JOptionPane.showInputDialog(null, "In which category do you want to add the new employee?", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues3, possibleValues3[0]);
										
										switch ((String)selectedValue3){//What kind of employee?
										
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
										continue;
									
								case "Delete":
									Employee.delete(Employee.findEmployee());
									break;
								case "Update":
							
									Employee e = Employee.findEmployee();
									
									Object[] possibleValues4 = {"First Name", "Last Name", "Address", "Phone Number", "Email Address", "Salary", "Bank Name", "Bank Account Number"};
									Object selectedValue4 = JOptionPane.showInputDialog(null, "What attributes do you want to update? ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues4, possibleValues4[0]);
										
										switch ((String)selectedValue4){//What kind of employee
									
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
										continue;
								case "Search":
									Object[] possibleValues5 = {"By Full Name", "By ID"};
									Object selectedValue5 = JOptionPane.showInputDialog(null, "How do you want to search for the employee?  ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues5, possibleValues5[0]);
										switch ((String)selectedValue5){
										case "By Full Name":
											Employee e1 = Employee.findEmployee();
											Employee.displayEmployee(e1);
											break;
										case "By ID":
											Employee e2 = Employee.findByID();
											Employee.displayEmployee(e2);
											break;
											}
										continue;
									
								case "Display":
									String d = Employee.header();
									StringBuilder s = new StringBuilder();
//									String s = Employee.employee.toString();
									for(Employee j : Employee.employee) {
										s.append("\n"+j.toString());
									}
								    //JTextPane jtp = new JTextPane();
									//jtp.setSize(new Dimension(480, 10));
									//jtp.setPreferredSize(new Dimension(480, jtp.getPreferredSize().height));
									//JOptionPane.showMessageDialog(null, jtp,"Display", JOptionPane.INFORMATION_MESSAGE);
						   JOptionPane.showMessageDialog(null,d+s);

									//System.out.println(d+s);
							}continue;

					
            
					case "Employee Statistics"://Employee Statistics
						Object[] possibleValues2 = { "Average wage of the company", "Maximum salary in the company", "Minimum salary in the company", "Total Bonus", "Women employee Percentage of the company", "Men employee Percentage of the company", "Back to the previous menu"};
						Object selectedValue2 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues2, possibleValues2[0]);
               
							switch ((String)selectedValue2){
						
								case "Average wage of the company"://Ave
									Statistics.averageWage();
									break;
								case "Maximum salary in the company"://Max
									Statistics.highestWage();
									break;
								case "Minimum salary in the company"://Min
									Statistics.lowestWage();
									break;
								case "Total Bonus"://Bonus
									Statistics.totalBonus();
									break;
								case "Women employee Percentage of the company"://Women
									Statistics.femalePercentage();
									break;
								case "Men employee Percentage of the company"://Men
									Statistics.maleByCategoryPercentage();
									break;
							}continue;
				}
		
		
	

	}while (0 == (JOptionPane.showConfirmDialog(null, "Do you want to go back to the main menu?", "Do you want to go back to the menu?", JOptionPane.YES_NO_OPTION)));
        JOptionPane.showMessageDialog(null, "Have a nice day!");

}
	}



