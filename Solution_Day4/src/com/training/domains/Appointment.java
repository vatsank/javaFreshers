package com.training.domains;
import java.util.*;
public class Appointment {

	private HashMap<Doctor, Set<Patient>> appointments;

	public Appointment() {
		super();
		this.appointments = new HashMap<>();
		
	}

	
	public void setAppointments(HashMap<Doctor, Set<Patient>> appointments) {
		this.appointments = appointments;
	}

	
	public boolean addAppointment(Doctor doctor,Patient patient) {
		
		 boolean result = false;
		  
		  if(appointments.get(doctor) == null) {
			  TreeSet<Patient> list = new TreeSet<>();
			  list.add(patient);
			  appointments.put(doctor, list);
			  result = true;
		  } else {
			  
			  TreeSet<Patient> list = (TreeSet<Patient>) appointments.get(doctor);
			     list.add(patient);
			     appointments.put(doctor, list);
				  result = true;

		  }
		  
		      return result;
		      
	}
	
	
	public Set<Patient> getAppointments(Doctor doctor){
		
		 return appointments.get(doctor);
	}
	
	
}
