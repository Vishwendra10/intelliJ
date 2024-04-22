package com.yash.tdd.intassg6;
/**
 * 
 * @author vishwendra.singh
 *
 */
public class Author {
	
	private int book_id;
	private String book_name;
	private double	book_price;
	private String book_type;
	static int count=0;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	
	public Author()
	{
	}
	public Author(int book_id, String book_name, double book_price, String book_type) {
		super();
		count++;
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_type = book_type;
	}
	@Override
	public String toString() {
		return "Author [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price + ", book_type="
				+ book_type + "]";
	}
}
