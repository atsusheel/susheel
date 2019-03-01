package hdfcCarLoan;

public class Projectclass1
	{
		int a,b,c;
		public Projectclass1(int a, int b) 
		{
			this.a=a;
			this.b=b;
			
		}
		public void add()
		{
		  c = a + b;
		  System.out.println(c);
		}
		public void sub()
		{
			c = a - b;
			System.out.println(c);
			
		}
	public static void main(String[] args) {
		Projectclass1 w1 = new Projectclass1(20,10);
		w1.add();
		w1.sub();

	}

}
