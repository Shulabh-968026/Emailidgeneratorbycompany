import java.util.*;
public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity=500;
	private String alternatemail;
	private int defaultpasswordlength=12;
	private String companySuffix="company.com";
	private String email;
	
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email created::"+firstname+" "+lastname);
		
		this.department=setDepartment();
		System.out.println("Department is "+this.department);
		
		this.password=randomPassword(defaultpasswordlength);
		
		System.out.println("Password::"+this.password);
	    
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		
		System.out.println("Email is::"+email);
	}
	private String setDepartment()
	{
		System.out.println("Enter the Department \n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter Department Code::");
		Scanner in=new Scanner(System.in);
		int deptchoice=in.nextInt();
		if(deptchoice==1)
		{
			return "Sales";
		}
		else if(deptchoice==2)
		{
			return "Development";
		}
		else if(deptchoice==3)
		{
			return "Accounting";
		}
		return " ";
	}
	public String randomPassword(int length)
	{
	 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
	 char []password=new char[length];
	 
	 for(int i=0;i<length;i++)
	 {
		 int rand=(int)(Math.random()*passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
	 }
	 return new String(password);
	}
	public void setmailboxCapacity(int capacity)
	{
		this.mailboxcapacity=capacity;
	}
	
	public void setalternativemail(String altEmail)
	{
		this.alternatemail=altEmail;
	}
	
	public void changepassword(String password)
	{
		this.password=password;
	}
    public int getmailboxcapacity()
    {
    	return mailboxcapacity;
    }
    public String getalternativeEmial()
    {
    	return alternatemail;
    }
    
    public String getpassword()
    {
    	return password;
    }
    
    public String showInfo()
    {
    	return "Name::"+firstname+" "+lastname+
    			"\nCompany Email::"+email+
    			"\nMailBoxCapacity::"+mailboxcapacity+"mb";
    }
}
