package com.training.domains;

public class Author {

	private long authorId;
	private String authorName;
	private double rating;
	private long phoneNumber;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(long authorId, String authorName, double rating, long phoneNumber) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.rating = rating;
		this.phoneNumber = phoneNumber;
	}
	public long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", rating=" + rating + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
}
