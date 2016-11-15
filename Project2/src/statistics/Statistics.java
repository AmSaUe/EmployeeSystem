package statistics;

import employee.AmbulanceDriver;
import employee.Doctor;
import employee.Employee;
import employee.Housekeeper;
import employee.Nurse;
import employee.Receptionist;
import employee.Researcher;
import utilities.GenderType;

public class Statistics {

	public static void averageWage() {
		double totalSalary = 0;
		double averageWage = 0;
		for (Employee e : Employee.employee) {
			totalSalary += e.getSalary();
			averageWage = totalSalary / Employee.employee.size();
		}
		System.out.println("The average wage of the hospial is " + averageWage);
	}

	public static void highestWage() {
		double highestWage = Employee.employee.get(0).getSalary(); //her we look at the first salary at the arrays first salary at index 0 
		for (Employee e : Employee.employee) {

			if (highestWage < e.getSalary()) { // and begin compare it with all
												// next salaries
				highestWage = e.getSalary();
			}
		}
		System.out.println("The highest salary in the hospital is " + highestWage);
	}

	public static void lowestWage() {
		double lowestWage = Employee.employee.get(0).getSalary();
		for (Employee e : Employee.employee) {
			if (lowestWage > e.getSalary()) {
				lowestWage = e.getSalary();
			}
		}
		System.out.println("The lowest salary in the hospital is " + lowestWage);
	}

	public static void totalBonus() {
		double totalBonus = 0;
		for (Employee e : Employee.employee) {
			totalBonus += e.calculateBonus();
		}
		System.out.println("The total annual bonus is " + totalBonus);
	}

	public static void femalePercentage() {
		double femalePercentage = 0;
		int counter = 0;
		for (Employee e : Employee.employee) {
			if (e.getGender() == GenderType.FEMALE) {
				counter++;
			}
			femalePercentage = counter * 100 / Employee.employee.size();
		}
		System.out.println(femalePercentage + "% of all staff at the hospital are women.");
	}
	
	public static void maleByCategoryPercentage() {
		int doctorCounter = 0;
		int nurseCounter = 0;
		int researcherCounter = 0;
		int receptionistCounter = 0;
		int ambulanceDriverCounter = 0;
		int housekeeperCounter = 0;
		int maleDoctorCounter = 0;
		int maleNurseCounter = 0;
		int maleResearcherCounter = 0;
		int maleReceptionistCounter = 0;
		int maleAmbulanceDriverCounter = 0;
		int maleHousekeeperCounter = 0;
		
		for (Employee e : Employee.employee) {
			if (e instanceof Doctor) { // && e.getGender() == GenderType.MALE) {
				doctorCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleDoctorCounter++;
				}
			} else if (e instanceof Nurse) {
				nurseCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleNurseCounter++;
				}
			} else if (e instanceof Researcher) {
				researcherCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleResearcherCounter++;
				}
			} else if (e instanceof Receptionist) {
				receptionistCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleReceptionistCounter++;
				}
			} else if (e instanceof AmbulanceDriver) {
				ambulanceDriverCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleAmbulanceDriverCounter++;
				}
			} else if (e instanceof Housekeeper) {
				housekeeperCounter++;
				if(e.getGender() == GenderType.MALE) {
					maleHousekeeperCounter++;
				}
			}
		}
		System.out.println("Male doctors: " + maleDoctorCounter*100/doctorCounter + "%." );
		System.out.println("Male nurses: " + maleNurseCounter*100/nurseCounter + "%." );
		System.out.println("Male researchers: " + maleResearcherCounter*100/researcherCounter + "%." );
		System.out.println("Male receptionists: " + maleReceptionistCounter*100/receptionistCounter + "%." );
		System.out.println("Male ambulance drivers: " + maleAmbulanceDriverCounter*100/ambulanceDriverCounter + "%." );
		System.out.println("Male housekeepers: " + maleHousekeeperCounter*100/housekeeperCounter + "%." );
	}

}
