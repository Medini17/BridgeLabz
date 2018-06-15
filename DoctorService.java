/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */
public interface DoctorService {
	
	public void viewDoctorDetails() throws Exception;

	public Doctor searchDoctorbyName() throws Exception;

	public Doctor searchDoctorbyId() throws Exception;

	public  Doctor searchDoctorbySpecialization() throws Exception;

	public Doctor searchDoctorbyAvailibility() throws Exception;

}