package com.training.daos;

import com.training.ifaces.BookDao;
import com.training.ifaces.Dao;

import java.util.*;
import java.sql.*;
import com.training.domains.*;
public class BookDaoImpl implements BookDao<Book> {

	private Connection  con;
	
	public BookDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int[] add(Book t) {

		int[] rowAdded=new int[2];
		
		String addAuthorSQL= "insert into vamauthor values(?,?,?,?)";
		String addBookSQL = "insert into vambook values(?,?,?,?,?)";
		String forCheckingSQL = "select * from vamauthor where authorId =?";
		
		
		try {
			
			  PreparedStatement forChekStmt = con.prepareStatement(forCheckingSQL);
			   forChekStmt.setLong(1, t.getAuthor().getAuthorId());
			  
			  ResultSet rs = forChekStmt.executeQuery();
			  
			    if(!rs.next()) {
			
			PreparedStatement authorStmt = con.prepareStatement(addAuthorSQL);
			
			  Author author = t.getAuthor();
			  authorStmt.setLong(1, author.getAuthorId());
			  authorStmt.setString(2, author.getAuthorName());
			  authorStmt.setLong(3, author.getPhoneNumber());
			  authorStmt.setDouble(4, author.getRating());
			  
			 int  authorAdded = authorStmt.executeUpdate();
			 
			 rowAdded[0]= authorAdded;
			    }
			    else {
			    	
			    	System.out.println("Author Already Exisits - Adding Book Alone");
			try {
				PreparedStatement bookStmt = con.prepareStatement(addBookSQL);

				     bookStmt.setLong(1, t.getBookNumber());
				     bookStmt.setString(2, t.getBookName());
				     bookStmt.setString(3, t.getCategory());
				     bookStmt.setDouble(4, t.getPrice());
				     bookStmt.setLong(5, t.getAuthor().getAuthorId());

				     int bookAdded = bookStmt.executeUpdate();
				     
				     rowAdded[1]= bookAdded;
			} catch (Exception e) {
				e.printStackTrace();
			}
			    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public List<Book> findAll() {
		
		List<Book> bookList = new ArrayList<>();
		
		String sql = "SELECT *  FROM test.vamauthor v, "
				+ "test.vambook b where v.authorId=b.authorRef";
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			 while(rs.next()) {
				 
				 long authorId = rs.getLong("authorId");
				 String authorName = rs.getString("authorName");
				 double rating = rs.getDouble("rating");
					long phoneNumber = rs.getLong("phoneNumber");
				 
					Author author = new Author(authorId, authorName, rating, phoneNumber);
				 
					long bookNumber= rs.getLong("bookNumber");
				String  bookName= rs.getString("bookName");
				 String category = rs.getString("category");
				 double price = rs.getDouble("price");
				 
				 Book eachObject = new Book(bookNumber, bookName, author, price);
				 
				 bookList.add(eachObject);
				 
			 }
			
			
		} catch (Exception e) {
          e.printStackTrace();
		}
		
		return bookList;
	}

	@Override
	public int remove(long pkey) {
		
		int rowDeleted =0;
		String sql = "delete from vamauthor where authorId = ?";
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			  pstmt.setLong(1, pkey);
			  
			  rowDeleted = pstmt.executeUpdate();
			
		} catch (Exception e) {
		
			 e.printStackTrace();
		}
			return rowDeleted;
	}

}
