package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstarcts.UserVerifyService;

public class UserVerifyManager implements UserVerifyService {

	@Override
	public void sendVerifyEmail(String eMail) {
		System.out.println("Doðrulama E-Postasý Gönderildi. "+ eMail);
		
	}

	@Override
	public boolean clickOnLink(String eMail, String verifyCode) {
		String code = "a1b1c1d1";
		if (code == verifyCode) {
			System.out.println("Üyeliðiniz Onaylanmýþtýr." + eMail);
			return true;
		}
		else {
			System.out.println("Üyeliðiniz Onaylanmamýþtýr." + eMail);
			return false;
		}
		}
		

}
