package com.xoriant.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Book {
	private String title;
	private float price;
	private String author;
	private long ISBN;
	
	public Book() {

	}
	

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public long getISBN() {
		return ISBN;
	}
	
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
	
	
}
