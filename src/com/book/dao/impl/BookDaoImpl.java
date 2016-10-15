package com.book.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.book.dao.BookDao;
import com.book.entity.Book;
import com.dao.DAO;

public class BookDaoImpl extends DAO<Book> implements BookDao {

	@Override
	/**
	 * 
	 */
	public Book getBook(String name) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM BOOK WHERE NAME = ?";
		Book book = null;
		try {
			book = get(sql, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public List<Book> getBooksListByPress(String press) {
		// TODO Auto-generated method stub
		List<Book> booksList = null;
		String sql = "SELECT * FROM BOOK WHERE PRESS = ?";
		try {
			booksList = getForList(sql, press);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksList;
	}

	@Override
	public List<Book> getBooksListByStyle(String style) {
		// TODO Auto-generated method stub
		List<Book> booksList = null;
		String sql = "SELECT * FROM BOOK WHERE STYLE = ?";
		try {
			booksList = getForList(sql, style);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksList;
	}

	@Override
	public List<Book> getBooksListByMoney(int min, int max) {
		// TODO Auto-generated method stub
		List<Book> booksList = null;
		String sql = "SELECT * FROM BOOK WHERE PRICE BETWEEN ? AND ?";
		try {
			booksList = getForList(sql, min, max);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksList;
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM BOOK WHERE ID = ?";
		Book book = null;
		try {
			book = get(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		String sql = "UPDATE book SET NAME =?, PRICE=?,AUTHOR=?,STYLE=?,PRESS=? WHERE ID=?";
		try {
			update(sql, book.getName(),book.getPrice(),book.getAuthor(),
					book.getStyle(),book.getPress(),book.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(String name, int price, String author, String style ,String press) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO book(NAME,PRICE,AUTHOR,STYLE,PRESS) VALUES(?,?,?,?,?)";
		try {
			update(sql, name,price,author,style,press);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM BOOK WHERE ID = ?";
		try {
			update(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
