package com.user.dao.impl;

import java.sql.SQLException;

import com.dao.DAO;
import com.user.dao.UserDao;
import com.user.entity.User;

public class UserDaoImpl extends DAO<User> implements UserDao{

	@Override
	/**
	 * return 0:密码错误
	 * return 1:密码正确
	 * return -1:用户不存在
	 */
	public int checkUser(User user) {
		// TODO Auto-generated method stub
		int result = -1;
		String password = null;
		String sql = "SELECT password FROM user WHERE name = ?";
		try {
			password = getForValue(sql, user.getName());
			System.out.println(password);
			if(password == null){
				result = -1;
			}else if(password.equals(user.getPassword())){
				result = 1;
			}else{
				result = 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
