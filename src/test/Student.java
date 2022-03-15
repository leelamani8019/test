package test;

public class Student {
	String sname;
	int sid;
	String address;

	public Student() {
		 sname="NA";
		 sid=0;
		 address="NA";
		
		
		
	}
	public Student(String sname,int sid, String address)
	{
		this.sname=sname;
		this.sid=sid;
		this.address=address;
		
	}
	public String toString()
	{
		String pass="\nsname:"+sname;
		pass+="\nsid:"+sid;
		pass+="\naddress:"+address;
		return pass;
	}

}
