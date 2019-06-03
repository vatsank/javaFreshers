package com.training.domains;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Hospital {

	public static void main(String[] args) {
		
		Appointment appointment = new Appointment();

		
		Doctor ramesh = new Doctor(101,"Ramesh",9484848,"ENT");
		
		
		Patient ram = new Patient(101, "Ramesh",34, "male");
		
		Patient shyam = new Patient(102, "Shyam",24, "male");
		
		
		  
		  
		  appointment.addAppointment(ramesh, ram);
		  
		  appointment.addAppointment(ramesh, shyam);
		  
		  
		 Set<Patient> appList=  appointment.getAppointments(ramesh);
			  
		 System.out.println(appList);
		 
		 
		  
		  
		
	}
}
