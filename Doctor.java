/**
 * 
 */
package com.bridgelabz.oops;

/**
 * Created By:Medini P.D
 * Date:- 12/06/2018
 * Purpose:
 */

public class Doctor {
	private String doctorname;
	private String doctorid;
	private String specialization;
	private String availabity;
	private int count=0;

	public Doctor() {

	}
	public void setCount(int count) {
		this.count = count;
	}
	

	@Override
	public String toString() {
		return "Doctor [doctorname=" + doctorname + ", doctorid=" + doctorid + ", specialization=" + specialization
				+ ", availabity=" + availabity + ", count=" + count + "]";
	}
	public String getDoctorname() {
		return doctorname;
	}

	public int getCount() {
		return count;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailabity() {
		return availabity;
	}

	public void setAvailabity(String availabity) {
		this.availabity = availabity;
	}

	
	public Doctor(String doctorname, String doctorid, String specialization, String availabity) {
		this.doctorname = doctorname;
		this.doctorid = doctorid;
		this.specialization = specialization;
		this.availabity = availabity;

	}
}
