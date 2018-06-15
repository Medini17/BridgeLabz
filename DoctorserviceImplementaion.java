/**
 * 
 */
package com.bridgelabz.oops;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */


public class DoctorserviceImplementaion implements DoctorService {

	File file = new File("/home/bridgelabz/Documents/doctor.json");
	List<Doctor> list = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();

	/**
	 * function to view doctor in the doctor file
	 */
	public void viewDoctorDetails() throws Exception {

		list = Utility1.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
			}
		} else {
			System.out.println("Doctor List is empty ..add doctors to the file");
		}
	}

	/**
	 * function to search doctor by Name in the doctor file
	 */
	public Doctor searchDoctorbyName() throws Exception {

		list = Utility1.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			System.out.println("Enter the doctor Name to be searched...");
			String doctorName = Utility1.userInputString();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getDoctorname().equalsIgnoreCase(doctorName)) {
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
					return list.get(i);
				}
			}
			System.out.println("Sorry!! No doctor is available.... ");
		}

		return null;
	}

	/**
	 * function to search doctor by Id in the doctor file
	 */
	public Doctor searchDoctorbyId() throws Exception {
		list = Utility1.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			System.out.println("Enter the doctor Id to be searched...");
			String doctorId = Utility1.userInputString();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getDoctorid().equalsIgnoreCase(doctorId)) {
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
					return list.get(i);
			}
			}
			System.out.println("Sorry!! No doctor is available.... ");
		
		}
		return null;
	}

	/**
	 * function to search doctor by Specialization in the doctor file
	 */
	public Doctor searchDoctorbySpecialization() throws Exception {
		list = Utility1.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			System.out.println("Enter the doctor Specialization to be searched...");
			String doctorspecialization = Utility1.userInputString();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getSpecialization().equalsIgnoreCase(doctorspecialization)) {
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
					return list.get(i);
					}
				}

			}
			System.out.println("Sorry!! No doctor is available.... ");
		
		return null;
	}

	/**
	 * function to search doctor by Availibity in the doctor file
	 */
	public Doctor searchDoctorbyAvailibility() throws Exception {

		list = Utility1.parseJSONArray(file, Doctor.class);
		if (!list.isEmpty()) {
			System.out.println("Enter the doctor Availibility to be searched...");
			String doctoravailibity = Utility1.userInputString();

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getAvailabity().equalsIgnoreCase(doctoravailibity)) {
					System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
					return list.get(i);
				}
			}

			System.out.println("Sorry!! No doctor is available.... ");

		}

		return null;
	}
}