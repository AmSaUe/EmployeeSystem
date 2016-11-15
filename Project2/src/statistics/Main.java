package statistics;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		  
		  /*JTextField Field1 = new JTextField(5);
	      JTextField Field2 = new JTextField(5);
	      JTextField Field3 = new JTextField(5);
	      JTextField Field4 = new JTextField(5);
	      JTextField Field4 = new JTextField(5);
	      JTextField Field4 = new JTextField(5);
	      JTextField Field4 = new JTextField(5);
	      JPanel myPanel = new JPanel();
	      myPanel.setLayout(new GridLayout(2,2));
	      myPanel.add(new JLabel("input 1:"));
	      myPanel.add(Field1);
	      myPanel.add(new JLabel("input 2:"));
	      myPanel.add(Field2);
	      myPanel.add(new JLabel("input 3:"));
	      myPanel.add(Field3);
	      myPanel.add(new JLabel("input 4:"));
	      myPanel.add(Field4);*/
	      
	      
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
										
										switch ((String)selectedValue3){//What kind of employee
										
										case "Doctor":
											break;
										case "Nurse":
											break;
										case "Researcher":
											break;
										case "Receptionist":
											break;
										case "Ambulance Driver":
											break;
										default: 
											break;
										}
										
									break;
								case "Delete":
									System.out.println("Delete is called!");//Delete
									break;
								case "Update":
									Object[] possibleValues4 = {"1", "2", "3", "4", "5", "6"};
									Object selectedValue4 = JOptionPane.showInputDialog(null, "What attributes do you want to update? ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues4, possibleValues4[0]);
										
										switch ((String)selectedValue4){//What kind of employee
									
										case "1":
											break;
										case "2":
											break;
										case "3":
											break;
										case "4":
											break;
										case "5":
											break;
										default: 
											break;
									}
									break;
								case "Search":
									System.out.println("Search is called!");//Search
									break;
								case "Display":
									System.out.println("Display is called!");//Display
									break;
								default://Main menu
									continue;
							}
					
            
					case "Employee Statistics"://Employee Statistics
						Object[] possibleValues2 = { "Average wage of the company", "Maximum salary in the company", "Minimum salary in the company", "Total Bonus", "Women employee Percentage of the company", "Men employee Percentage of the company", "Back to the previous menu"};
						Object selectedValue2 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues2, possibleValues2[0]);
               
							switch ((String)selectedValue2){
						
								case "Average wage of the company"://Ave
									System.out.println("Ave");
									break;
								case "Maximum salary in the company"://Max
									System.out.println("Max");
									break;
								case "Minimum salary in the company"://Min
									System.out.println("Min");
									break;
								case "Total Bonus"://Bonus
									System.out.println("Bonus");
									break;
								case "Women employee Percentage of the company"://Women
									System.out.println("Women");
									break;
								case "Men employee Percentage of the company"://Men
									System.out.println("Men");
									break;
								default://Main menu
									continue;
							}
							
					default://Exit
						JOptionPane.showMessageDialog(null, "Have a nice day!");
						break;
				}
		}
		while (0 == (JOptionPane.showConfirmDialog(null, "Do you want to go back to the main menu?", "Do you want to go back to the menu?", JOptionPane.YES_NO_OPTION)));
        JOptionPane.showMessageDialog(null, "Have a nice day!");
	}

}
