package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstarcts.UserUnusedEmailService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserUnusedEmailManager implements UserUnusedEmailService {

	private UserDao userDao;
	
	public UserUnusedEmailManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isEmailAvaible(String eMail) {
		for (User user : userDao.getAll()) {
			if (eMail.equals(user.geteMail())) {
				System.out.println("Bu Email Adresi Kullanýlmaktadýr.");
				return false;
			}
			
		}
		return true;
	}

}
