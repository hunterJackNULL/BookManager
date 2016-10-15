package test;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.SQLException;

import com.book.dao.impl.BookDaoImpl;

public class Test {

	@org.junit.Test
	public void test() throws SQLException {
		BookDaoImpl bookDaoImpl = new BookDaoImpl();
		bookDaoImpl.update("insert into book(name,author,press,style,price) "
				+ "values('Êý¾Ý¿â','½­ËÕ','ddf','dd',34);");
	}
	@org.junit.Test
	public void testFile(){
		File file = new File("/BookManagerSystem/file/test.txt");
		
	 	System.out.print(file.exists());
	}

}
