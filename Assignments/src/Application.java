
/*
Jonathan Ocampo
02/18/22
Descriptions - Creating Object Oriented Programming - Attributes, Instance Methods, Object calling
*/
public class Application {
	// Attributes 
	String userName;
	String passWord;
	String hint;
	int year;
	// Static Attribute - Non-changeable except through the class
	static String appName = "Vanguardians";

	public Application(String userName) {
		this.userName = userName;
	}
	
	public Application(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public Application(String userName, String passWord, String hint) {
		this.userName = userName;
		this.passWord = passWord;
		this.hint = hint;
	}

	public Application(String userName, String passWord, String hint, int year) {
		this.userName = userName;
		this.passWord = passWord;
		this.hint = hint;
		this.year = year;
	}

	// Instance Methods
	// Email Instance
	void email(String name) {
		this.userName = name;
	}
	// Security Instance
	void security(String pass) {
		this.passWord = pass;
	}
	// Year Instance
	int birthYear() {
		return this.year;
	}
	// Word Instance
	void Word(String hint) {
		this.hint = hint;
	}

	/*
	 * public static void main(String[] args) { // Object Creation Application
	 * jonathan = new Application(); System.out.println("Application Name: " +
	 * Application.appName); jonathan.userName = "JOcampo011994";
	 * System.out.println("Username: " + jonathan.userName); jonathan.passWord =
	 * "oggityboggity08"; System.out.println("Password: " + jonathan.passWord);
	 * jonathan.year = 94; System.out.println("Birth year: " + jonathan.year);
	 * jonathan.hint = "JackSkellington"; System.out.println("Password Hint: " +
	 * jonathan.hint);
	 * 
	 * }
	 */

}
