package eCommerceDemo;

import eCommerceDemo.business.abstarcts.UserService;
import eCommerceDemo.business.concretes.UserCheckManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.UserUnusedEmailManager;
import eCommerceDemo.business.concretes.UserVerifyManager;
import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.core.concretes.GoogleManagerAdapter;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("Ömercan","Hatunoðlu","ce.omercanhatunoglu@gmail.com","123456");
		GoogleService googleService = new GoogleManagerAdapter();
		UserDao userDao = new HibernateUserDao();
		UserService userService = new UserManager(userDao, new UserCheckManager(), new UserUnusedEmailManager(userDao), new UserVerifyManager());
		
		userService.register(user);
		userService.login("ce.omercanhatunoglu@gmail.com", "123456");
		
		googleService.loginWithGoogle();
		

	}

}
