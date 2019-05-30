package com.training;

// In a Source file there can be only one public class and name of the 
// public class and source file should be same

// If we have another class it should be default

class Employee{
	
	private String employeeName;

	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	


}

public class UsingThrowsClause {

	public static int findLength(String name)  throws NullPointerException{
		
		
		    return name.length();
	}
	
	
	public static int extractName(Employee employee) throws NullPointerException {
		
		          return findLength(employee.getEmployeeName());
	}

	public static void main(String[] args) {

		try {
			
			Employee ram = new Employee("Ramesh");
		     
		    int length = extractName(ram);
		
		    System.out.println("Length:="+length);
		    
		    
		    Employee shyam = new Employee();
		    
		    int length2 = extractName(shyam);
		    
		    System.out.println("Length:="+length2);
	
		} catch (NullPointerException e) {
			
			System.err.println("Name should not be null");
			e.printStackTrace();
		}
		
		     	    
	}

}
