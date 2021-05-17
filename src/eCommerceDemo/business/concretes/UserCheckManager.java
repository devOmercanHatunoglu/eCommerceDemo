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
            System.out.println("Kullan�labilir Mail Adresi");
            return true;
        } else {
            return false;
        }
		
	}

	@Override
	public boolean passWordController(String passWord) {
		if (passWord.length() < 6) {
			System.out.println("Parolan�z En az 6 Karakterden Olu�mal�d�r. ");
			return false;
		}
		return true;
	}

	@Override
	public boolean nameController(String firstName, String lastName) {
		if (firstName.length() < 2 && lastName.length() < 2) {
			System.out.println("Ad ve Soyad�n�z En az 2 Karakterden Olu�mal�d�r. ");
			return false;
		}
		else {
			return true;
		}
	}

}
