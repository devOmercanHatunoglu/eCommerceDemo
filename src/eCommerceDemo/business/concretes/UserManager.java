package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstarcts.UserCheckService;
import eCommerceDemo.business.abstarcts.UserService;
import eCommerceDemo.business.abstarcts.UserUnusedEmailService;
import eCommerceDemo.business.abstarcts.UserVerifyService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserCheckService userCheckService;
	private UserUnusedEmailService userUnusedEmailService;
	private UserVerifyService userVerifyService;
	

	public UserManager(UserDao userDao, UserCheckService userCheckService,
			UserUnusedEmailService userUnusedEmailService, UserVerifyService userVerifyService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.userUnusedEmailService = userUnusedEmailService;
		this.userVerifyService = userVerifyService;
	}



	@Override
	public void register(User user) {
		if (userCheckService.nameController(user.getFirstName(), user.getLastName()) && userUnusedEmailService.isEmailAvaible(user.geteMail())
				&& userCheckService.eMailController(user.geteMail()) && userCheckService.passWordController(user.getPassWord())) {
			userDao.add(user);
			userVerifyService.sendVerifyEmail(user.geteMail());
			
		}
		
	}



	@Override
	public void login(String eMail, String passWord) {
		for(User user : userDao.getAll()) {
			if (eMail.equals(user.geteMail()) && passWord.equals(user.getPassWord())) {
				System.out.println("Baþarýyla Giriþ Yapýldý. " +user.getFirstName() + user.getLastName());
				
			}
			
			
		}
	}


	
		
	}
	
	
	
	
	


