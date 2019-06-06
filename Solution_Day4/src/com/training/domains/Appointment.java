package com.training.domains;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
		 
		 TreeSet<Patient> list;
		 
		  File file = new File(doctor.getDoctorName());
		  
		  if(file.exists()) {
	    	 list = readFromFile(doctor);
		  }
		  if(appointments.get(doctor) == null) {
			   list = new TreeSet<>();
			  list.add(patient);
			  appointments.put(doctor, list);
			  result = true;
		  } else {
			  
			   list = (TreeSet<Patient>) appointments.get(doctor);
			     list.add(patient);
			     appointments.put(doctor, list);
				  result = true;

		  }
		  
		  writeToFile(doctor, list);
		  
		      return result;
		      
	}
	
	
	public Set<Patient> getAppointments(Doctor doctor){
		
		 return appointments.get(doctor);
	}
	
	
	private void writeToFile(Doctor doctor, Set<Patient> list) {
		
		   String fileName = doctor.getDoctorName();
		   
		   		   PrintWriter writer=null;
		   try {
	 writer = new PrintWriter(new FileWriter(new File(fileName)
	,true));
			
			for(Object eachObject : list) {
				
				writer.println(eachObject.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		   finally {
			   
			   writer.close();
		   }
		   
	}
	

	private TreeSet<Patient> readFromFile(Doctor doctor) {
		
		   String fileName = doctor.getDoctorName();
		   
			 TreeSet<Patient> list= new TreeSet<>();

		   File file = new File(fileName);
		   BufferedReader reader=null;
		   try {
			 reader = new BufferedReader(new FileReader(file));
			
			 String line =null;
			 while( (line =reader.readLine())!=null){
				 
				 String[] values = line.split(",");
				 Patient eachPatient = new Patient(Long.parseLong(values[0]),values[1], 
						 Integer.parseInt(values[2]), values[3]);
				 
				 list.add(eachPatient);
				 
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		   finally {
			   
			   try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			   
			   
		   }
		   return list;
		   
	}

}
