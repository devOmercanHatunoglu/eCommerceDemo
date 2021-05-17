package eCommerceDemo.business.abstarcts;

public interface UserVerifyService {
	void sendVerifyEmail(String eMail);
	boolean clickOnLink (String eMail, String verifyCode);
	
}
