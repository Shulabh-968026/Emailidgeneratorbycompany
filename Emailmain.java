
public class Emailmain {

	public static void main(String [] args)
	{
		Email email=new Email("shulabh","Dixit");
		
		email.setalternativemail("shulabhdixit@gmail.com");
		System.out.println(email.getalternativeEmial());
		
		System.out.println(email.showInfo());
	}
}
