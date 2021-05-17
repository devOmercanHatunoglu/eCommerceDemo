package eCommerceDemo.business.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import eCommerceDemo.business.abstarcts.UserCheckService;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean eMailController(String eMail) {
		Pattern p = Pattern.compile("(@)(.+)$");
        Matcher m = p.matcher(eMail);

        if (m.find()) {
            System.out.println("Kullanılabilir Mail Adresi");
            return true;
        } else {
            return false;
        }
		
	}

	@Override
	public boolean passWordController(String passWord) {
		if (passWord.length() < 6) {
			System.out.println("Parolanız En az 6 Karakterden Oluşmalıdır. ");
			return false;
		}
		return true;
	}

	@Override
	public boolean nameController(String firstName, String lastName) {
		if (firstName.length() < 2 && lastName.length() < 2) {
			System.out.println("Ad ve Soyadınız En az 2 Karakterden Oluşmalıdır. ");
			return false;
		}
		else {
			return true;
		}
	}

}
