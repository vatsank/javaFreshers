package com.training;

public class Student {

	private int rollNumber;
	private String studentName;
	
	private double mathsMark;   
	private double scienceMark;  
	private double tamilMark;  
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNumber, String studentName, double mathsMark, double scienceMark, double tamilMark) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.mathsMark = mathsMark;
		this.scienceMark = scienceMark;
		this.tamilMark = tamilMark;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public double getMathsMark() {
		return mathsMark;
	}


	public void setMathsMark(double mathsMark) {
		this.mathsMark = mathsMark;
	}


	public double getScienceMark() {
		return scienceMark;
	}


	public void setScienceMark(double scienceMark) {
		this.scienceMark = scienceMark;
	}


	public double getTamilMark() {
		return tamilMark;
	}


	public void setTamilMark(double tamilMark) {
		this.tamilMark = tamilMark;
	}
	
	
	
}
