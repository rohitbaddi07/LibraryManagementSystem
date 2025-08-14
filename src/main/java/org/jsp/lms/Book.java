package org.jsp.lms;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String auther;
	private double price;
	private int qty;
	private String des;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auther=" + auther + ", price=" + price + ", qty=" + qty
				+ ", des=" + des + "]";
	}
	public Book(int id, String title, String auther, double price, int qty, String des) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.price = price;
		this.qty = qty;
		this.des = des;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
