package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.stereotype.Repository;

import bdd.ConnectionProvider;
import model.User;
@Repository("UserDao")
public class UserDaoImpl implements UserDao{

	@Override
	public void newUser(User u) {
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into User values(?,?,?)");  
		ps.setInt(1,u.getUserid());  
		ps.setString(2,u.getMotdepasse());  
		ps.setString(3,u.getPseudo()); 
		ps.setBoolean(4,u.getIsadmin());
		ps.setDate(5,(java.sql.Date) u.getDateinscription());    
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
	//return status;  
		
	}

	@Override
	public void delete(User user) {
		Connection con=ConnectionProvider.getCon();  
		
		
	}

	@Override
	public User findUserByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ChangePass(String password) {
		// TODO Auto-generated method stub
		
	}

}
