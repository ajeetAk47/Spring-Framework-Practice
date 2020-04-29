package ajeet.cg.lab2.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ajeet.cg.lab2.trainee.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{
	
	public User findByUsernameAndPassword(String username, String password);

}
