package com.training;

import com.training.daos.BloodDonarDaoImpl;
import com.training.domains.BloodDonor;
import com.training.utils.SqlConnection;
import java.sql.*;
import java.util.List;
public class Application {

	public static void main(String[] args) {

		
		Connection con  =SqlConnection.getSqlConnection();
		
		
		BloodDonarDaoImpl dao = new BloodDonarDaoImpl(con);
		
//		
//		BloodDonor shyam = new BloodDonor(203, "Shyam","bneg", 48484822);
//		
//		int rowAdded = dao.add(shyam);
//		
//		System.out.println(rowAdded + ":=Row Added");
//		
		
//       int rowDeleted = dao.remove(203);
//		
//		System.out.println(rowDeleted + ":=Row Deleted");
//		
		
		List<BloodDonor> list = dao.findAll();
		
		System.out.println(list);

		// Add a Switch case here to select one of the option
		
	}

}


