package com.book.entity;

import java.io.Serializable;

public class Book implements Serializable{
	private Integer id;
	private String name;
	private Integer price;
	private String author;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String style;
	private String press;
	private boolean isBorrow;
	public boolean isBorrow() {
		return isBorrow;
	}
	public void setBorrow(boolean isBorrow) {
		this.isBorrow = isBorrow;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}

	public Book(Integer id, String name, Integer price, String author, String style, String press, boolean isBorrow) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.style = style;
		this.press = press;
		this.isBorrow = isBorrow;
	}
	public Book(Integer id,String name, Integer price, String author, String style, String press) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
		this.style = style;
		this.press = press;
		this.isBorrow = false;
	}
	public Book(){
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + ", style=" + style
				+ ", press=" + press + ", isBorrow=" + isBorrow + "]";
	}
}
