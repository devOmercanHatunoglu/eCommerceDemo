package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstarcts.UserVerifyService;

public class UserVerifyManager implements UserVerifyService {

	@Override
	public void sendVerifyEmail(String eMail) {
		System.out.println("Do�rulama E-Postas� G�nderildi. "+ eMail);
		
	}

	@Override
	public boolean clickOnLink(String eMail, String verifyCode) {
		String code = "a1b1c1d1";
		if (code == verifyCode) {
			System.out.println("�yeli�iniz Onaylanm��t�r." + eMail);
			return true;
		}
		else {
			System.out.println("�yeli�iniz Onaylanmam��t�r." + eMail);
			return false;
		}
		}
		

}
