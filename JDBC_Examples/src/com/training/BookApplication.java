package com.training;

import java.sql.Connection;
import java.sql.SQLException;

import com.training.daos.BookDaoImpl;
import com.training.domains.Author;
import com.training.domains.Book;
import com.training.ifaces.Dao;
import com.training.utils.SqlConnection;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = SqlConnection.getSqlConnection();
		BookDaoImpl dao = new BookDaoImpl(con);

//		Author javaAuthor = new Author(982,"Kathy Sieera", 4.5, 9484848);
//		  Book java = new Book(103,"Head First JSP","Computer",javaAuthor,320.00);
//		  
//		  
//		int[] result =dao.add(java);
//		  
//		System.out.println(result[0]+" row Added in Author");
//		
//		System.out.println(result[1]+" row Added in Book");
//		  
		  
	
//		System.out.println(dao.findAll());
	
		System.out.println(dao.remove(982));

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
