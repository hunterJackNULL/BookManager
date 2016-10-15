package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.UEncoder;

import com.book.dao.impl.BookDaoImpl;
import com.book.entity.Book;
import com.user.dao.impl.UserDaoImpl;
import com.user.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 添加cookie
		 */
		String name = request.getParameter("name");
		Cookie cookie = new Cookie("name", name);
		cookie.setMaxAge(100);//秒为单位
		response.addCookie(cookie);
		//checkCode 
		String checkCode = request.getParameter("checkCode");
		String sessionCheckCode = (String)request.getSession().getAttribute("checkCode");
		if(!checkCode.equals(sessionCheckCode)){
			request.setAttribute("errorMessage", "验证码错误");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			return;
		}
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		String identify = request.getParameter("identify");
		String password = request.getParameter("password");
		User user = new User(name,password);
		int result = userDaoImpl.checkUser(user);
		String path = "bookmanager.jsp";
		switch(result){
		case 0:
			path = "/welcome.jsp";
			request.setAttribute("errorMessage", "密码错误！！");
			break;
		case -1:
			request.setAttribute("errorMessage", "用户名不存在！！");
			path = "/welcome.jsp";
			break;
		case 1:
			path = "/book.book";
			request.getSession().setAttribute("name", name);
			break;
		default:break;
		}

		request.getRequestDispatcher(path).forward(request, response);
	}

}
