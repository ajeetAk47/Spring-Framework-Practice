package ajeet.cg.lab2.trainee.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ajeet.cg.lab2.trainee.dao.UserDao;
import ajeet.cg.lab2.trainee.entity.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User findByUsernameAndPassword(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
	}

}
