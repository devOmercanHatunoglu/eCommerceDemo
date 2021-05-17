package eCommerceDemo.dataAccess.concretes;

import java.util.List;
import java.util.ArrayList;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Hibernate ile Kayýt Edildi. " + user.geteMail());
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		
		
	}

	@Override
	public void update(User user) {
		
		
	}

	@Override
	public User get(String eMail) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
