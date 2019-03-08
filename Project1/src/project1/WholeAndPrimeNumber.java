package project1;

public class WholeAndPrimeNumber
{

	public static void main(String[] args)
	{
		System.out.println("prime number is :");
		int i = 1;
					
					while(i <= 100) {
						if (i % 2 == 0) 
						{
							System.out.print(i);
							
						}
							i++;
					}
					
					
					System.out.println("Odd number is :");
					for (int v = 0; v <= 100; v++)
					{
						if (v % 2 != 0) 
						{
							System.out.print(v);
						}
					}
					

	}

}
