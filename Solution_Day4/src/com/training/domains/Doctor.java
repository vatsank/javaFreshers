package com.training.domains;

public class Doctor {

	private long doctorCode;
	private String doctorName;
	private long phoneNumber;
	private String specialization;
	public Doctor(long doctorCode, String doctorName, long phoneNumber, String specialization) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.phoneNumber = phoneNumber;
		this.specialization = specialization;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(long doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctors [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber
				+ ", specialization=" + specialization + "]";
	}
	
	
}
