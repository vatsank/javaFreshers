package com.training.ifaces;

import java.util.List;

public interface Dao<T> {

	public int add(T t);
	public List<T> findAll();
	public int remove(long pkey);
	
}


// Add a Method to update the Phone Number


// Given a blood group should return the List of all the Donors in that group


// Alter the Table and add a Column Age

// Given a Blood group should print donors in that age group



