package com.training;

import java.util.Scanner;

public class Application {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Student ram = new Student(101, "Ramesh", 70, 80, 90);
		Professor garg = new Professor("Garg",ram);
		
		System.out.println("Grade :="+garg.allotGrade());
		
	}
}
