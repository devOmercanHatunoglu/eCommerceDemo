package eCommerceDemo.entities.concretes;

public class User {
		private String firstName;
		private String lastName;
		private String eMail;
		private String passWord;
		
		public User(String firstName, String lastName, String eMail, String passWord) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.eMail = eMail;
			this.passWord = passWord;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String geteMail() {
			return eMail;
		}

		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		

}
