package com.xoriant.util;

import org.hibernate.Session;

import com.xoriant.dto.Book;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Book book = new Book();
		book.setISBN(005544);
		book.setAuthor("Margaret Atwood");
		book.setTitle("The Handmaid's Tale");
		book.setPrice(350);
		
		session.save(book);
		session.getTransaction().commit();
		
	}
}
