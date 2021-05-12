package javaCampHomework2;

public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println("Öðrenci Eklendi :" + user.getFirstName() + " " + user.lastName + " " + user.id);
	}
	
	public void signIn() {
		System.out.println("Giriþ yapýldý ");
		
	}
	 
}