package com.book.dao;

import java.util.List;

import com.book.entity.Book;

public interface BookDao {
	public Book getBook(String name);
	public Book getBook(int id);
	public List<Book> getBooksListByPress(String press);
	public List<Book> getBooksListByStyle(String style);
	public List<Book> getBooksListByMoney(int min,int max);
	public void updateBook(Book book);
	public void updateBook(String name,int price,String author, String style,String press);
	public void deleteById(int id);
}
