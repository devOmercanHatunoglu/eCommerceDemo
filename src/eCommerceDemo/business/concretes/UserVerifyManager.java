package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstarcts.UserVerifyService;

public class UserVerifyManager implements UserVerifyService {

	@Override
	public void sendVerifyEmail(String eMail) {
		System.out.println("Doğrulama E-Postası Gönderildi. "+ eMail);
		
	}

	@Override
	public boolean clickOnLink(String eMail, String verifyCode) {
		String code = "a1b1c1d1";
		if (code == verifyCode) {
			System.out.println("Üyeliğiniz Onaylanmıştır." + eMail);
			return true;
		}
		else {
			System.out.println("Üyeliğiniz Onaylanmamıştır." + eMail);
			return false;
		}
		}
		

}
