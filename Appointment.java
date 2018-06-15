package com.bridgelabz.oops;

public class Appointment {
	@Override
	public String toString() {
		return "Appointment [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
				+ ", patientId=" + patientId + ", timestamp=" + timestamp + "]";
	}
	private String doctorName;
	private String doctorId;
	private String patientName;
	private String patientId;
	private String timestamp;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}


	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}