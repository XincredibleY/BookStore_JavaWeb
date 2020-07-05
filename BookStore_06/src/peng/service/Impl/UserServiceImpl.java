package peng.service.Impl;

import peng.bean.User;
import peng.dao.UserDao;
import peng.dao.Impl.UserDaoImpl;
import peng.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao ud = new UserDaoImpl();
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return ud.getUserByUserNameAndPassword(user);
	}

	@Override
	public boolean regist(User user) {
		// TODO Auto-generated method stub
		return ud.registUser(user);
	}

}
