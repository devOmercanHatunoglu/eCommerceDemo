package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void loginWithGoogle() {
		System.out.println("Google Hesab� ile Giri� Yap�ld�.");
		
	}

}
