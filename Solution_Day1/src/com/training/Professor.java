package com.training;

public class Professor {

	
	private String professorName;
	private Student student;
	
	public Professor(String professorName) {
		super();
		this.professorName = professorName;
	}


	public Professor(String professorName, Student student) {
		super();
		this.professorName = professorName;
		this.student = student;
	}


	public String getProfessorName() {
		return professorName;
	}


	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}


	public Professor() {
		super();
	}


	                      
	public String  allotGrade() {
		
		
		String grade = "b+";
		
		double average =( student.getMathsMark() + student.getScienceMark() + student.getTamilMark())/3;
		
		if(average >=80) {
			
			  grade = "a+";
		}
		
		return grade;
	}
}
