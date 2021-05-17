package eCommerceDemo.business.abstarcts;


import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String eMail, String passWord);


}
