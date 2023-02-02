public class Divisors
{
	public static void main(String[]args)
	{
		int num=123454321, div;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+", ");
			}
		}
	}
}