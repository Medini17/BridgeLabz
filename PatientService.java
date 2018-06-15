/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public interface PatientService {
	
	public void takeAppointments() throws Exception;

	public void showPopularDoctor() throws Exception;

	public void showPopularSpecialization() throws Exception;

	public Patient searchPatientbyName() throws Exception;

	public void searchPatientbyId() throws Exception;

	public void searchPatientbyMobilenum() throws Exception;

	public void searchPatientbyAge() throws Exception;

}