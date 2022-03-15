package test;

public class doublelinked {
	static linknode head;
	public static void addbeg(employee emp) {
		if(head==null)
			head =new linknode(emp);
		else {
			linknode c=new linknode(emp);
			c.next=head;
			head=c;
			c.next.prev=head;
			}
		return ;
	}
	static linknode c=head;
	static linknode last=c;
	public static void addbeforeemp(int empno,employee emp)
	{
		linknode curr=head;
		if(curr.emp.empno==empno) {
			addbeg(emp);
		}
	}
	

	public static void main(String[] args) {
		linknode head= new linknode(new employee(1000,"manisha","cse"));
		head= new linknode(new employee(1001,"sowji","cse"));
		head= new linknode(new employee(1002,"surya","cse"));
		System.out.println("Forward traversal");
		while (c!=null) {
			System.out.println(c.emp);
			last=c;
			c=c.next;
		}
		System.out.println("reverse travelsal");
		while(last !=null)
		{
			System.out.println(last.emp);
			last=last.prev;
		}
		

	}

}
