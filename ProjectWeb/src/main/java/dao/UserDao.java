package dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.User;
@Repository("FavDao")
public interface UserDao {
	
	void newUser(User user);
	
	void delete (User user);
	
	User findUserByPseudo(String pseudo);
	
	List<User> findAllUser();
	
	void ChangePass (String password);
	

		
		}  

