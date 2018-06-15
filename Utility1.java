/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class Utility1 {
	private static Scanner scanner = new Scanner(System.in);
	static List<Doctor> list = new ArrayList<>();
	static List<Patient> patientlist = new ArrayList<>();
	public static ObjectMapper mapper = new ObjectMapper();

	/* To take String inputs from user */
	public static String userInputString() {
		return scanner.next();
	}

	/* To take Boolean inputs from user */
	public static boolean userInputBoolean() {
		return scanner.nextBoolean();
	}

	/* To take Integer inputs from user */
	public static int userInputInteger() {
		return scanner.nextInt();
	}

	public static String userInputNextLine() {
		return scanner.nextLine();
	}

	public static double userInputDouble() {
		return scanner.nextDouble();
	}

	public static <T> List<T> parseJSONArray(File file1, Class<T> class1) throws Exception {
		List<T> arrayList = new ArrayList<T>();
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, class1);
		arrayList = mapper.readValue(file1, javaType);

		return arrayList;

	}

	public static List<Doctor> adddoctor(List<Doctor> list2) {

		list = list2;
		System.out.println("enter the number doctors to be added ...");
		int noofperson = Utility1.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			System.out.println("enter detail information about Doctor");
			System.out.println("Enter the  DoctorName");
			String doctorname = Utility1.userInputString();

			System.out.println("Enter the  id");
			String doctorid = Utility1.userInputString();

			System.out.println("Enter the  Specialization");
			String specialization = Utility1.userInputString();

			System.out.println("Enter the Availibilty");
			String availbility = Utility1.userInputString();

			Doctor doctor = new Doctor(doctorname, doctorid, specialization, availbility);
			list.add(doctor);
		}

		return list;
	}

	public static List<Doctor> updatedoctor(List<Doctor> list, int index) {
		Doctor doctor = new Doctor();

		String name = list.get(index).getDoctorname();
		doctor.setDoctorname(name);
		String id = list.get(index).getDoctorid();
		doctor.setDoctorid(id);
		System.out.println("eneter the Specialization");
		String specialization = Utility1.userInputString();
		doctor.setSpecialization(specialization);
		System.out.println("enetr the availibity");
		String availibilty = Utility1.userInputString();
		doctor.setAvailabity(availibilty);
		list.remove(index);
		list.add(index,doctor);
		return list;
	}

	public static List<Patient> addPatient(List<Patient> list) {
		patientlist = list;
		System.out.println("enter the number Patient's to be added ...");
		int noofperson = Utility1.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			Patient patient = new Patient();
			System.out.println("Enter the patient name");
			patient.setPatientname(userInputString());
			System.out.println("enter patient id");
			patient.setPatientid(userInputString());
			System.out.println("enter patient mobile number");
			patient.setMobilenum(userInputString());
			System.out.println("enter patient age");
			patient.setAge(userInputInteger());
			patientlist.add(patient);
		}
		return patientlist;
	}

	public static List<Patient> updatePatient(List<Patient> list1, int index) {
		Patient patient=new Patient();
		//patientlist=list1;
		String name = list1.get(index).getPatientname();
		patient.setPatientname(name);
		String id = list1.get(index).getPatientid();
		patient.setPatientid(id);
		System.out.println("eneter the Age of patient");
		int age = Utility1.userInputInteger();
		patient.setAge(age);
		System.out.println("enter the patient phone number");
		String mobile = userInputString();
		patient.setMobilenum(mobile);
		list1.remove(index);
		list1.add(index,patient);
		return list1;
	}
	
}