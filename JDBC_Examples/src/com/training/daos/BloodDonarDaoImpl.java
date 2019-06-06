package com.training.daos;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.training.domains.BloodDonor;
import com.training.ifaces.Dao;

public class BloodDonarDaoImpl implements Dao<BloodDonor> {
	
	private Connection con;
	
	
	

	public BloodDonarDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(BloodDonor t) {

		String sql = "insert into bloodDonor values(?,?,?,?)";
		int rowAdded =0;
		PreparedStatement pstmt=null;
		try {
			
			 pstmt  = con.prepareStatement(sql);
			
			pstmt.setLong(1, t.getDonorId());
			pstmt.setString(2, t.getDonorName());
			pstmt.setString(3,t.getBloodGroup());
			pstmt.setLong(4, t.getPhoneNumber());
			
						
			rowAdded = pstmt.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
       finally {
    	
    	   try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
       }
		
		return rowAdded;
	}

	@Override
	public List<BloodDonor> findAll() {

		List<BloodDonor> list = new ArrayList<>();
		
		PreparedStatement pstmt  = null;
		try {
			
			String sql = "Select * from bloodDonor";
			pstmt = con.prepareStatement(sql);
			
			ResultSet resultSet = pstmt.executeQuery();
			
			while(resultSet.next()) {
				
				    long donorId =    resultSet.getInt("donorId");
				     String donorName =   resultSet.getString("donorName");
				      String bloodGroup =  resultSet.getString("bloodGroup");
				       long phoneNumber = resultSet.getLong("phoneNumber");
			
				       BloodDonor donor = new BloodDonor(donorId,donorName, bloodGroup, phoneNumber);
				       
				       list.add(donor);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int remove(long pkey) {
		String sql = "delete from  bloodDonor where donorId =?";
		int rowDeleted =0;
		PreparedStatement pstmt=null;
		try {
			
			 pstmt  = con.prepareStatement(sql);
			
			pstmt.setLong(1,pkey);
			
			rowDeleted = pstmt.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
       finally {
    	
    	   try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
       }
		
		return rowDeleted;

	}

	
}
