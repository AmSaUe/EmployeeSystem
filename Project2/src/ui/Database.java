package ui;

import employee.AmbulanceDriver;
import employee.Doctor;
import employee.Housekeeper;
import employee.Nurse;
import employee.Receptionist;
import employee.Researcher;
import utilities.GenderType;
import utilities.Qualification;
import utilities.Specialization;

public class Database {

	public static void database() {
		Doctor d1 = new Doctor("Erik", "Dahl", "dahl@gmail.com", "Liljeholmsv.34", "0739568423", "Nordea", "DOCTOR",
				GenderType.MALE, 1958, 01, 27, 1, "326 535 497", 56000, Specialization.CARDIOLOGIST, 30);
		Doctor d2 = new Doctor("Arthur", "Flint", "a.f@gmail.com", "Nackagatan 7", "0702365489", "SEB", "DOCTOR",
				GenderType.MALE, 1962, 11, 27, 2, "56 23654 89", 50000, Specialization.OBSTETRICIAN, 23);
		Doctor d3 = new Doctor("Emilia", "Nyl�n", "e.nylen@gmail.com", "Vasagatan 1", "0762458973", "SHB", "DOCTOR",
				GenderType.FEMALE, 1977, 12, 01, 3, "456 2239 87 1", 37000, Specialization.NEUROLOGIST, 5);
		Doctor d4 = new Doctor("Amanda", "Sten", "a.sten@gmail.com", "Strandliden 48", "0721436056", "Swedbank",
				"DOCTOR", GenderType.FEMALE, 1950, 06, 17, 4, "15426 32 1", 54200, Specialization.ALLERGIST, 20);
		Doctor d5 = new Doctor("Sara", "Ek", "sara.ek@gmail.com", "Bollmorav. 234", "0701254893", "SEB", "DOCTOR",
				GenderType.FEMALE, 1978, 10, 03, 5, "25 12589 23", 64000, Specialization.RHEUMATOLOGIST, 15);

		Nurse n1 = new Nurse("Per", "Green", "per.g@gmail.com", "Strandv�gen 2", "0762583146", "Swedbank", "NURSE",
				GenderType.MALE, 1958, 06, 27, 6, "12496 32 4", 29500, Qualification.NURSE);
		Nurse n2 = new Nurse("Lisa", "Svensson", "lisa.s@gmail.com", "Tyres�gr�nd 5", "0732651856", "Nordea", "NURSE",
				GenderType.FEMALE, 1979, 04, 22, 7, "552 126 332", 25000, Qualification.ASSISTANT_NURSE);
		Nurse n3 = new Nurse("Ebba", "Carlsson", "ebba.c@gmail.com", "Arlandav. 6", "0725146038", "SEB", "NURSE",
				GenderType.FEMALE, 1966, 12, 29, 8, "22 16852 66", 31000, Qualification.NURSE);
		Nurse n4 = new Nurse("Grace", "Town", "g.town@gmail.com", "Bondergata 5", "0732651596", "Swedbank", "NURSE",
				GenderType.MALE, 1988, 01, 25, 9, "56 87459 26", 36000, Qualification.NURSE);
		Nurse n5 = new Nurse("Anders", "Claus", "a.claus@gmail.com", "Landsv�gen 78", "0712563202", "SHB", "NURSE",
				GenderType.MALE, 1986, 03, 16, 10, "236 5418 63 2", 25000, Qualification.ASSISTANT_NURSE);

		Receptionist Rec1 = new Receptionist("Sara", "Svensson", "s.s@gmail.com", "Stockholm", "0700546982", "Nordea",
				"Receptionist", GenderType.FEMALE, 1958, 01, 27, 11, "548451325712", 25000, 250);
		Receptionist Rec2 = new Receptionist("Per", "Ericsson", "p.e@gmail.com", "Stockholm", "0751236985", "Nordea",
				"Receptionist", GenderType.MALE, 1962, 03, 02, 12, "784569875132", 25000, 470);
		Receptionist Rec3 = new Receptionist("Jessica", "Johnson", "j.j@gmail.com", "Stockholm", "0789654125", "Nordea",
				"Receptionist", GenderType.FEMALE, 1963, 12, 05, 13, "412845692137", 25000, 100);
		Receptionist Rec4 = new Receptionist("Maria", "Anders", "m.a@gmail.com", "Stockholm", "0784538795", "Nordea",
				"Receptionist", GenderType.FEMALE, 1979, 10, 12, 14, "875487895462", 25000, 233);
		Receptionist Rec5 = new Receptionist("Julia", "Smith", "j.s@gmail.com", "Stockholm", "0754898787", "Nordea",
				"Receptionist", GenderType.FEMALE, 1980, 12, 20, 15, "316547842531", 25000, 57);
		
		Researcher Res1 = new Researcher("Linnea", "Parker", "l.p@gmail.com", "Stockholm", "0712312345", "Nordea",
				"Researcher", GenderType.FEMALE, 1956, 06, 25, 16, "879542658715", 50000, 3);
		Researcher Res2 = new Researcher("Erik", "Strand", "e.s@gmail.com", "Stockholm", "0714623587", "Nordea",
				"Researcher", GenderType.MALE, 1978, 11, 28, 17, "635849521236", 50000, 2);
		Researcher Res3 = new Researcher("Elsa", "Andersson", "e.a@gmail.com", "Stockholm", "702158954", "Nordea",
				"Researcher", GenderType.FEMALE, 1989, 10, 07, 18, "963852741123", 50000, 1);
		Researcher Res4 = new Researcher("Marie", "Karlsson", "m.k@gmail.com", "Stockholm", "0713846521", "Nordea",
				"Researcher", GenderType.FEMALE, 1985, 01, 14, 19, "123456987741", 50000, 4);
		Researcher Res5 = new Researcher("Olivia", "Nilsson", "o.n@gmail.com", "Stockholm", "0745457545", "Nordea",
				"Researcher", GenderType.FEMALE, 1983, 02, 17, 20, "741852963123", 50000, 1);

		AmbulanceDriver ad1 = new AmbulanceDriver("Johanna", "Nilsson", "jn@mail.com", "Sollentuna", "0708549785",
				"Nordea", "Ambulance Driver", GenderType.FEMALE, 1988, 10, 27, 21, "352 687 467", 25000, 55);
		AmbulanceDriver ad2 = new AmbulanceDriver("Eric", "Cuszac", "ec@mail.com", "H�gersten", "0707978563", "Nordea",
				"Ambulance Driver", GenderType.MALE, 1990, 01, 15, 22, "367 445 894", 26000, 53);
		AmbulanceDriver ad3 = new AmbulanceDriver("Sune", "Carlsson", "sc@mail.com", "Stockholm", "0734549782", "SEB",
				"Ambulance Driver", GenderType.MALE, 1985, 11, 29, 23, "789 056 523", 28000, 35);
		AmbulanceDriver ad4 = new AmbulanceDriver("Nina", "Berg", "nb@mail.com", "Huddinge", "0708995485", "Sparbanken",
				"Ambulance Driver", GenderType.FEMALE, 1991, 04, 19, 24, "987 457 452", 22000, 44);
		AmbulanceDriver ad5 = new AmbulanceDriver("Carl", "Frank", "cf@mail.com", "Sk�rholmen", "07075497852", "SEB",
				"Ambulance Driver", GenderType.FEMALE, 1977, 05, 30, 25, "658 987 452", 30000, 72);

		Housekeeper h1 = new Housekeeper("Erica", "Carlsson", "erc@mail.com", "Gustavsberg", "0735498762", "SEB",
				"Housekeeper", GenderType.FEMALE, 1988, 10, 27, 26, "354 854 667", 22000, 10);
		Housekeeper h2 = new Housekeeper("Anna", "Uber", "au@mail.com", "Tyres�", "0706977452", "SEB", "Housekeeper",
				GenderType.FEMALE, 1990, 01, 15, 27, "367 645 894", 20000, 24);
		Housekeeper h3 = new Housekeeper("Ingrid", "Sunquist", "is@mail.com", "Stockholm", "0702365687", "Sparbanken",
				"Housekeeper", GenderType.FEMALE, 1985, 11, 29, 28, "789 123 523", 22000, 5);
		Housekeeper h4 = new Housekeeper("Gerard", "Bergkvist", "gb@mail.com", "Upplands V�sby", "0756659723", "Nordea",
				"Housekeeper", GenderType.MALE, 1991, 04, 19, 29, "987 357 452", 20000, 12);
		Housekeeper h5 = new Housekeeper("Ture", "Persson", "tp@mail.com", "Sk�rholmen", "0705497852", "SEB",
				"Housekeeper", GenderType.MALE, 1977, 03, 30, 30, "658 321 452", 24000, 6);
	}
}
