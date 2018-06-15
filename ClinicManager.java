
package com.bridgelabz.oops;


import com.bridgelabz.utility.Utility;

public class ClinicManager {
	
	public static void main(String[] args) throws Exception {
     Utility u=new Utility();
		PatientService patientservice = new PatientserviceImplementation();
		ManagerService managerservice = new ManagerServiceImplementation();
		DoctorService doctorservice = new DoctorserviceImplementaion();
		
		System.out.println("Welcome to Clinic Management");
	
		while(true) {
		System.out.println("ENTER 1. TO VIEW DOCTOR'S LIST..");
		System.out.println("Enter 2. TO SEARCH DOCTOR..");
		System.out.println("Enter 3. TO SHOW POPULAR DOCTOR..  ");
		System.out.println("ENTER 4. TO SHOW POPULAR SPECIALIZATION..");
		System.out.println("ENTER 5  TO TAKE APPOINTMENT.. ..");
        System.out.println("ENTER 6. TO EXIT");
		System.out.println("enter your choice");
		int choice = u.inputInteger();

		switch (choice) {
		case 1:
			doctorservice.viewDoctorDetails();
			while (choice <= 6) {
				System.out.println("1. to Add Dotcor");
				System.out.println("2. to update Doctor");
				System.out.println("3. to Delete Doctor");
				System.out.println("4. to Add Patient ");
				System.out.println("5. to Delete Patient");
				System.out.println("6. to Update Patient");
				System.out.println("7. to Exit");
				System.out.println("enter your choice ");
				int n = u.inputInteger();
				switch (n) {
				case 1:
					managerservice.addDoctor();
					break;
				case 2:
					managerservice.updateDoctor();
					break;
				case 3:
					managerservice.deleteDoctor();
					break;
				case 4:
					managerservice.addPatient();
					break;
				case 5:
					managerservice.deletePatient();
					break;
				case 6:
					managerservice.updatePatient();
					break;
				case 7:
					break;
				default:
					System.out.println("Enter the correct choice...");
					break;
				}
			}

		case 2:
			while(choice<=5) {
			System.out.println("1. SEARCH BY NAME:");
			System.out.println("2. SEARCH BY ID:");
			System.out.println("3. SEARCH BY AVAILIBILITY:");
			System.out.println("4. SEARCH BY Specialization:");
			System.out.println("5. TO EXIT:");
			System.out.println("enter your choice:");
			int choice1 = u.inputInteger();
			switch (choice1) {
			case 1:
				doctorservice.searchDoctorbyName();
				break;
			case 2:
				doctorservice.searchDoctorbyId();
				break;
			case 3:
				doctorservice.searchDoctorbyAvailibility();

				break;
			case 4:
				doctorservice.searchDoctorbySpecialization();
				break;
			case 5:
				System.exit(0);
		    	}
			}
		case 3:
			patientservice.showPopularDoctor();
			break;

		case 4:
			patientservice.showPopularSpecialization();
			break;
		case 5:
			patientservice.takeAppointments();
			break;
		
		case 6:
			System.exit(0);
		return;
			
		 }
		
		}
	}
}