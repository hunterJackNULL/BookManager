package com.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.impl.BookDaoImpl;
import com.book.entity.Book;

/**
 * Servlet implementation class AffairServlet
 */
@WebServlet("/AffairServlet")
public class AffairServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDaoImpl bookDaoImpl = new BookDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AffairServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		StringBuffer requestURL = request.getRequestURL();
		int index = requestURL.lastIndexOf("/");
		String requestMethod = requestURL.substring(index+1);
		String methodName = requestMethod.substring(0, requestMethod.length()-3);
		//System.out.println(methodName);
		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			try {
				method.invoke(this, request,response);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		//System.out.println(id);
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));
		String style = request.getParameter("style");
		String press = request.getParameter("press");
		Book book = new Book(id,name,price,author,style,press);
		System.out.println(book.toString());
		bookDaoImpl.updateBook(book);
		String path = "result.jsp?updateSucceed=true";
		request.getRequestDispatcher(path).forward(request, response);
	
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		bookDaoImpl.deleteById(id);
		String path = "result.jsp?updateSucceed=true";
		request.getRequestDispatcher(path).forward(request, response);
		
	}
	protected void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));
		String style = request.getParameter("style");
		String press = request.getParameter("press");
		//System.out.println(book.toString());
		bookDaoImpl.updateBook(name,price,author,style,press);
		String path = "result.jsp?updateSucceed=true";
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void seek(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void bookList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
