package eCommerceDemo.business.abstarcts;

public interface UserCheckService {
	boolean eMailController(String eMail);
	boolean passWordController(String passWord);
	boolean nameController(String firstName, String lastName);

}
