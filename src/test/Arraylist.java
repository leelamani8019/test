package test;
public class Arraylist {
	static  int n=7;

	public static void main(String[] args) {
		double [] a=new double[n];
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				a[i]=Math.random();
		}
		System.out.println(a);
		}

}
