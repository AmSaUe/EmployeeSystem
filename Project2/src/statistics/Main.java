package statistics;

import javax.swing.JOptionPane;

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
           
				if ("Employee Management".equals((String)selectedValue)){//Employee Management
            	
				Object[] possibleValues1 = { "Register", "Delete", "Update", "Search", "Display", "back to the previous menu"};
                Object selectedValue1 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues1, possibleValues1[0]);
                	
                	if ("Register".equals((String)selectedValue)){ //Register
                		System.out.println("Register is called!");
                	}
                	else if("Delete".equals((String)selectedValue)){//Delete
                		System.out.println("Delete is called!");
                	}
                	else if ("Update".equals((String)selectedValue)){//Update
                		System.out.println("Update is called!");
                	}
                	else if ("Search".equals((String)selectedValue)){//Search
                		System.out.println("Search is called!");
                	}
                	else if ("Display".equals((String)selectedValue)) {//Display
                		System.out.println("Display is called!");
                	}
                	else //Previous menu
                	{
                		System.out.println("Previous menu!");
                	}	
				}
            
				else if ("Employee Statistics".equals((String)selectedValue)){//Employee Statistics
            
            	Object[] possibleValues2 = { "Average wage of the company", "Maximum salary in the company", "Minimum salary in the company", "Total Bonus", "Women employee Percentage of the company", "Men employee Percentage of the company", "Back to the previous menu"};
                Object selectedValue2 = JOptionPane.showInputDialog(null, "Please Choose one from the drop down list: ", "Input",JOptionPane.INFORMATION_MESSAGE, null,possibleValues2, possibleValues2[0]);
               
                	if ("Average Wage of the Company".equals((String)selectedValue)){ //Average Wage of the Company
                		System.out.println("Ave!");
                	}
                	else if("Maximum salary in the company".equals((String)selectedValue)){ //Maximum salary in the company
                		System.out.println("Max!");
                	}
                	else if ("Minimum salary in the company".equals((String)selectedValue)){//Minimum salary in the company
                		System.out.println("Min!");
                	}
                	else if ("Total Bonus".equals((String)selectedValue)){//Total Bonus
                		System.out.println("Bonus!");
                	}
                	else if("Women employee Percentage of the company".equals((String)selectedValue)){//Women employee Percentage of the company
                		System.out.println("Women");
                	}
            		else if ("Men employee Percentage of the company".equals((String)selectedValue)){//Men employee Percentage of the company
            			System.out.println("Men!");
                	}
                	else 
                	{
                		System.out.println("Previous menu!");
                	}
                	
				}
		}
		while (0 == (JOptionPane.showConfirmDialog(null, "Do you want to go back to the main menu?", "Do you want to go back to the menu?", JOptionPane.YES_NO_OPTION)));
        JOptionPane.showMessageDialog(null, "Have a nice day!");
	}

}
